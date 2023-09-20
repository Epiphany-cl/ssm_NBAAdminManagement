package com.lina.controller;

import com.github.pagehelper.PageInfo;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.lina.vo.ResultVO;
import com.lina.vo.TeamQueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
        }else {
            return new ResultVO<>(200,"你瞅啥！");
        }
    }

    //更新修改team
    @RequestMapping("")
    public ResultVO<Team> updateTeamInfo(){

        return null;
    }
}
