package cn.edu.nuc.epms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Attendance {
    private Integer attid;

    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date attdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date workhours;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date closingtime;

    private Integer isovertime;

    public Integer getAttid() {
        return attid;
    }

    public void setAttid(Integer attid) {
        this.attid = attid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAttdate() {
        return attdate;
    }

    public void setAttdate(Date attdate) {
        this.attdate = attdate;
    }

    public Date getWorkhours() {
        return workhours;
    }

    public void setWorkhours(Date workhours) {
        this.workhours = workhours;
    }

    public Date getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    public Integer getIsovertime() {
        return isovertime;
    }

    public void setIsovertime(Integer isovertime) {
        this.isovertime = isovertime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attid=" + attid +
                ", id=" + id +
                ", attdate=" + attdate +
                ", workhours=" + workhours +
                ", closingtime=" + closingtime +
                ", isovertime=" + isovertime +
                '}';
    }
}