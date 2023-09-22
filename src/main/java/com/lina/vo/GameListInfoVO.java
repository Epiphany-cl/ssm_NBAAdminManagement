package com.lina.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lina.pojo.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameListInfoVO {
    private Integer gameId;
    private Team homeTeam;
    private Integer homeTeamScore;
    private Team visitingTeam;
    private Integer visitingTeamScore;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gameDate;
    private Integer typeId;
    private Integer isDel;
    private Integer status;
    private Integer homeTeamId;
    private Integer visitingTeamId;
}
