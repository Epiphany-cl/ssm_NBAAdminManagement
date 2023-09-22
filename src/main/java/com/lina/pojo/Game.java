package com.lina.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Game {
    private Integer gameId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gameDate;

    private Integer homeTeamId;

    private Integer homeTeamScore;

    private Integer visitingTeamId;

    private Integer visitingTeamScore;

    private Integer typeId;

    private Integer status;

    private Integer isDel;

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameDate=" + gameDate +
                ", homeTeamId=" + homeTeamId +
                ", homeTeamScore=" + homeTeamScore +
                ", visitingTeamId=" + visitingTeamId +
                ", visitingTeamScore=" + visitingTeamScore +
                ", typeId=" + typeId +
                ", status=" + status +
                ", isDel=" + isDel +
                '}';
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getVisitingTeamId() {
        return visitingTeamId;
    }

    public void setVisitingTeamId(Integer visitingTeamId) {
        this.visitingTeamId = visitingTeamId;
    }

    public Integer getVisitingTeamScore() {
        return visitingTeamScore;
    }

    public void setVisitingTeamScore(Integer visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}