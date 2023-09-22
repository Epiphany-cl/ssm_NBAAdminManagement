package com.lina.controller;


import com.github.pagehelper.PageInfo;
import com.lina.mapper.GameMapper;
import com.lina.pojo.Game;
import com.lina.service.GameService;
import com.lina.vo.GameListInfoVO;
import com.lina.vo.GameQueryVO;
import com.lina.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("game")
public class GameController {
    @Resource
    private GameService gameService;

    //http://localhost:8080/game/list?chineseName=&beginDate=&endDate=&typeId=-1&pageSize=5&pageNum=pageLi
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<GameListInfoVO> getList(
            @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
            GameQueryVO gameQueryVO) {
        pageSize = pageSize > 0 ? pageSize : 5;
        pageNum = pageNum > 0 ? pageNum : 1;

        PageInfo<GameListInfoVO> pageInfo = gameService.queryByPageInfoAndCondition(pageNum, pageSize, gameQueryVO);
        return new ResultVO<>(pageInfo);
    }
}
