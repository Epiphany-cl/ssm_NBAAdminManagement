package com.lina.controller;

import com.github.pagehelper.PageInfo;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.lina.vo.ResultVO;
import com.lina.vo.TeamQueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping("team")
public class TeamController {

    @Resource
    private TeamService teamService;

    //多条件分页查询
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<Team> selectTeam(@RequestParam(value = "pageNum", required = false, defaultValue = "5") Integer pageNum,
                                     @RequestParam(value = "pageSize", required = false, defaultValue = "1") Integer pageSize,
                                     TeamQueryVO queryVO) {
        if (pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize <= 0) {
            pageSize = 5;
        }

        PageInfo<Team> pageInfo = teamService.queryByPageAndCondition(pageNum, pageSize, queryVO);
        return new ResultVO<>(pageInfo);
    }

    //添加team
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO<Team> addTeam(Team team) {
        int res = teamService.addTeam(team);
        if (res == 1) {
            return new ResultVO<>();
        } else {
            return new ResultVO<>(555, "你瞅啥！");
        }
    }

    /*更新修改team*/
    //1. 根据id查询team
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO<Team> queryTeamById(@PathVariable("id") Integer id) {
        Team team = teamService.queryTeamById(id);
        return new ResultVO<>(team);
    }

    //2. 修改更新team
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO<Team> updateTeamInfo(@PathVariable("id") Integer id, Team team) {
        team.setTeamId(id);
        int res = teamService.updateTeamById(team);
        if (res == 1) {
            return new ResultVO<>();
        } else {
            return new ResultVO<>(555, "你瞅啥！");
        }
    }

    //删除
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO<Team> deleteTeamById(@PathVariable Integer id) {
        int res = teamService.deleteTeamById(id);

        if (res == 1) {
            return new ResultVO<>();
        } else {
            return new ResultVO<>(555, "你瞅啥！");
        }
    }

    //图片上传
    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    public ResultVO<Team> uploadLogo(@PathVariable("id") Integer id,
                                     @RequestParam("logo") MultipartFile myFile,
                                     HttpServletRequest request) {
        //获得服务器上文件夹
        String path = request.getServletContext().getRealPath("/img/uploadFile");
        //获得图片原石名字
        String originalFilename = myFile.getOriginalFilename();
        //修改名字
        /*1.获得后缀*/
        String fileSuffix = null;
        if (originalFilename != null) {
            fileSuffix = originalFilename.substring(originalFilename.lastIndexOf('.'));
        }
        /*随机字符串*/
        String randomStr = UUID.randomUUID().toString().replace("-", "");
        /*组合*/
        String newFileName = randomStr + fileSuffix;

        int res = 0;
        try {
            myFile.transferTo(new File(path + "/" + newFileName));
            Team team = teamService.queryTeamById(id);
            team.setTeamLogo(newFileName);
            res = teamService.updateTeamById(team);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResultVO<>(555, "你瞅啥！");
        }
        if (res == 1) {
            return new ResultVO<>();
        } else {
            return new ResultVO<>(555, "你瞅啥！");
        }
    }

}
