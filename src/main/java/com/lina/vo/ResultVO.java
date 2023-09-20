package com.lina.vo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ResultVO<T> {
    private PageInfo<T> pageInfo;
    private T obj;
    private List<T> list;
    private Integer code = 200;
    private String msg = "ok";

    public ResultVO(List<T> list) {
        this.list = list;
    }

    public ResultVO(T obj) {
        this.obj = obj;
    }

    public ResultVO(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
