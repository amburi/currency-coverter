package com.example.currency.model;

public class Motd {
    public String msg;
    public String url;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Motd{" +
                "msg='" + msg + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
