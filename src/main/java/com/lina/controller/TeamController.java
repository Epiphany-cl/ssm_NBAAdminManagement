package com.lina.controller;

import com.github.pagehelper.PageInfo;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.lina.vo.ResultVO;
import com.lina.vo.TeamQueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


}
