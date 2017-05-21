package com.mirsfang.model;

/**
 * Created by Administrator on 2017/5/20.
 */
public class Response {
    private int status;
    private Object data;
    private String msg;

    public Response() {
    }

    public Response(int status, Object data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
