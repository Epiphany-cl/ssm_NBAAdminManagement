package com.lina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.Team;
import com.lina.pojo.TeamExample;
import com.lina.vo.TeamQueryVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TeamService {

    @Resource
    private TeamMapper teamMapper;

    public PageInfo<Team> queryByPageAndCondition(Integer pageNum, Integer pageSize, TeamQueryVO queryVO) {
        //多条件查询实体类
        TeamExample teamExample = new TeamExample();
        //获得参数容器
        TeamExample.Criteria criterion = teamExample.createCriteria();
        //放入条件
        String teamName = queryVO.getTeamName();
        String chineseName = queryVO.getChineseName();
        String coach = queryVO.getCoach();
        Date beginDate = queryVO.getBeginDate();
        Date endDate = queryVO.getEndDate();
        Integer area = queryVO.getArea();

        if (teamName != null && !teamName.trim().isEmpty()) {
            criterion.andTeamNameLike("%" + teamName + "%");
        }
        if (chineseName != null && !chineseName.trim().isEmpty()) {
            criterion.andChineseNameLike("%" + chineseName + "%");
        }
        if (coach != null && !coach.trim().isEmpty()) {
            criterion.andCoachLike("%" + coach + "%");
        }
        if (area != null && area != -1) {
            criterion.andAreaEqualTo(area);
        }
        if (beginDate != null) {
            criterion.andCreateTimeGreaterThan(beginDate);
        }
        if (endDate != null) {
            criterion.andCreateTimeLessThan(endDate);
        }

        //分页查询
        PageHelper.startPage(pageNum,pageSize);
        List<Team> teams = teamMapper.selectByExample(teamExample);

        return new PageInfo<>(teams);
    }
}
