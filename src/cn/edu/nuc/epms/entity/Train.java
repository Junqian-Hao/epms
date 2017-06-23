package cn.edu.nuc.epms.entity;

import java.util.Date;

public class Train {
    private Integer trainid;

    private Date tstarttime;

    private Date tendtime;

    private String tcontent;

    public Integer getTrainid() {
        return trainid;
    }

    public void setTrainid(Integer trainid) {
        this.trainid = trainid;
    }

    public Date getTstarttime() {
        return tstarttime;
    }

    public void setTstarttime(Date tstarttime) {
        this.tstarttime = tstarttime;
    }

    public Date getTendtime() {
        return tendtime;
    }

    public void setTendtime(Date tendtime) {
        this.tendtime = tendtime;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent == null ? null : tcontent.trim();
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainid=" + trainid +
                ", tstarttime=" + tstarttime +
                ", tendtime=" + tendtime +
                ", tcontent='" + tcontent + '\'' +
                '}';
    }
}