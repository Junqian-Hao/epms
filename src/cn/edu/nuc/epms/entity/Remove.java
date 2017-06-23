package cn.edu.nuc.epms.entity;

import java.util.Date;

public class Remove {
    private Integer removeid;

    private Integer id;

    private String rmethod;

    private Date rdate;

    public Integer getRemoveid() {
        return removeid;
    }

    public void setRemoveid(Integer removeid) {
        this.removeid = removeid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRmethod() {
        return rmethod;
    }

    public void setRmethod(String rmethod) {
        this.rmethod = rmethod == null ? null : rmethod.trim();
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    @Override
    public String toString() {
        return "Remove{" +
                "removeid=" + removeid +
                ", id=" + id +
                ", rmethod='" + rmethod + '\'' +
                ", rdate=" + rdate +
                '}';
    }
}