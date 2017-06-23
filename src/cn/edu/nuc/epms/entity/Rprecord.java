package cn.edu.nuc.epms.entity;

import java.util.Date;

public class Rprecord {
    private Integer rpid;

    private Integer id;

    private Integer rptype;

    private Float rpmoney;

    private Date rpdate;

    private String rpreason;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRptype() {
        return rptype;
    }

    public void setRptype(Integer rptype) {
        this.rptype = rptype;
    }

    public Float getRpmoney() {
        return rpmoney;
    }

    public void setRpmoney(Float rpmoney) {
        this.rpmoney = rpmoney;
    }

    public Date getRpdate() {
        return rpdate;
    }

    public void setRpdate(Date rpdate) {
        this.rpdate = rpdate;
    }

    public String getRpreason() {
        return rpreason;
    }

    public void setRpreason(String rpreason) {
        this.rpreason = rpreason == null ? null : rpreason.trim();
    }

    @Override
    public String toString() {
        return "Rprecord{" +
                "rpid=" + rpid +
                ", id=" + id +
                ", rptype=" + rptype +
                ", rpmoney=" + rpmoney +
                ", rpdate=" + rpdate +
                ", rpreason='" + rpreason + '\'' +
                '}';
    }
}