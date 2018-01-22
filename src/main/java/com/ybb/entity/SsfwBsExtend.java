package com.ybb.entity;

public class SsfwBsExtend {
    private String uuid;
    private String nsrsbh;

    public SsfwBsExtend(String uuid, String nsrsbh) {
        this.uuid = uuid;
        this.nsrsbh = nsrsbh;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
}
