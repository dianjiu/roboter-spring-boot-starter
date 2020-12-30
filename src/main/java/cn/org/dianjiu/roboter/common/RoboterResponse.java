package cn.org.dianjiu.roboter.common;

import java.io.Serializable;

public class RoboterResponse <T> implements Serializable {
    private static final long serialVersionUID = 2914853172898904181L;

    /**
     *响应编码
     */
    private String code;
    /**
     *提示信息
     */
    private String msg;
    /**
     *响应数据
     */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RoboterResponse() {
    }

    public RoboterResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RoboterResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


}