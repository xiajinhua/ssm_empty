package com.ssm.vo;

public class BaseVo<T> {
    private Integer code;
    private String msg;
    private T content;

    public BaseVo(Integer code, String msg, T content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
