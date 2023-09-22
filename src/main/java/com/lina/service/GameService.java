package com.lina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lina.mapper.GameMapper;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.Game;
import com.lina.pojo.GameExample;
import com.lina.pojo.Team;
import com.lina.pojo.TeamExample;
import com.lina.vo.GameListInfoVO;
import com.lina.vo.GameQueryVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GameService {
    @Resource
    private GameMapper gameMapper;
    @Resource
    private TeamMapper teamMapper;

    //页面要的不是简单gameList
   /*
   public PageInfo<Game> queryByPageAndCondition(Integer pageNum, Integer pageSize, GameQueryVO gameQueryVO) {
        String chineseName = gameQueryVO.getChineseName();//由名字得到所匹配的主客场team的id
        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria teamCriteria = teamExample.createCriteria();
        if (chineseName != null && !chineseName.trim().isEmpty()) {
            teamCriteria.andChineseNameLike("%" + chineseName + "%");
        }
        List<Team> teams = teamMapper.selectByExample(teamExample);
        ArrayList<Integer> teamIdList = new ArrayList<>();
        teams.forEach(team -> teamIdList.add(team.getTeamId()));

        Integer typeId = gameQueryVO.getTypeId();
        Date beginDate = gameQueryVO.getBeginDate();
        Date endDate = gameQueryVO.getEndDate();

        GameExample gameExample = new GameExample();
        GameExample.Criteria gameCriteria = gameExample.createCriteria();
        //注意判断是否为空！！！！！！
        if (!teamIdList.isEmpty()) {
            gameCriteria.andHomeTeamIdIn(teamIdList);
            gameCriteria.andVisitingTeamIdIn(teamIdList);
        }
        if (typeId != null && typeId != -1) {
            gameCriteria.andTypeIdEqualTo(typeId);
        }
        if (beginDate != null) {
            gameCriteria.andGameDateGreaterThan(beginDate);
        }
        if (endDate != null) {
            gameCriteria.andGameDateLessThan(endDate);
        }


        //分页查询
        PageInfo<Game> pageInfo;
        //方法一(推荐)
        *//*
        PageHelper.startPage(pageNum, pageSize);
        List<Game> games = gameMapper.selectByExample(gameExample);
        pageInfo = new PageInfo<>(games);
        *//*
        //方法二(帅)
        pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> gameMapper.selectByExample(gameExample));

        return pageInfo;
    }
*/
    public PageInfo<GameListInfoVO> queryByPageInfoAndCondition(Integer pageNum, Integer pageSize, GameQueryVO gameQueryVO) {
        String chineseName = gameQueryVO.getChineseName();
        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria teamCriteria = teamExample.createCriteria();
        if (chineseName != null && !chineseName.trim().isEmpty()) {
            teamCriteria.andChineseNameLike("%" + chineseName + "%");
        }
        List<Team> teams = teamMapper.selectByExample(teamExample);
        ArrayList<Integer> teamIdList = new ArrayList<>();
        teams.forEach(team -> teamIdList.add(team.getTeamId()));

        Integer typeId = gameQueryVO.getTypeId();
        Date beginDate = gameQueryVO.getBeginDate();
        Date endDate = gameQueryVO.getEndDate();

        GameExample gameExample = new GameExample();
        GameExample.Criteria gameCriteria = gameExample.createCriteria();
        //注意判断是否为空！！！！！！
        if (!teamIdList.isEmpty()) {
            gameCriteria.andHomeTeamIdIn(teamIdList);//只能查询主场的 如果要同时查询主场和客场的 就要自己写mybatis.xml文件了 反向生成 Criteria 没有or的连接方法 只有and
        }
        if (typeId != null && typeId != -1) {
            gameCriteria.andTypeIdEqualTo(typeId);
        }
        if (beginDate != null) {
            gameCriteria.andGameDateGreaterThan(beginDate);
        }
        if (endDate != null) {
            gameCriteria.andGameDateLessThan(endDate);
        }

        PageHelper.startPage(pageNum, pageSize);
        List<Game> games = gameMapper.selectByExample(gameExample);

        ArrayList<GameListInfoVO> listInfoVOS = new ArrayList<>();
        for (Game game : games) {
            GameListInfoVO gameListInfoVO = new GameListInfoVO();
            gameListInfoVO.setGameId(game.getGameId());
            gameListInfoVO.setHomeTeamId(game.getHomeTeamId());
            gameListInfoVO.setVisitingTeamId(game.getVisitingTeamId());
            gameListInfoVO.setHomeTeamScore(game.getHomeTeamScore());
            gameListInfoVO.setVisitingTeamScore(game.getVisitingTeamScore());
            gameListInfoVO.setGameDate(game.getGameDate());
            gameListInfoVO.setTypeId(game.getTypeId());
            gameListInfoVO.setIsDel(game.getIsDel());
            gameListInfoVO.setStatus(game.getStatus());
            gameListInfoVO.setHomeTeam(teamMapper.selectByPrimaryKey(game.getHomeTeamId()));
            gameListInfoVO.setVisitingTeam(teamMapper.selectByPrimaryKey(game.getVisitingTeamId()));
            listInfoVOS.add(gameListInfoVO);
        }
        return new PageInfo<>(listInfoVOS);
    }
}
