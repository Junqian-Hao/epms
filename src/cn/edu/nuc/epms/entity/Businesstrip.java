package cn.edu.nuc.epms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Businesstrip {
    private Integer id;

    private Integer btid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date btdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registerdate;

    private String btmessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public Date getBtdate() {
        return btdate;
    }

    public void setBtdate(Date btdate) {
        this.btdate = btdate;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getBtmessage() {
        return btmessage;
    }

    public void setBtmessage(String btmessage) {
        this.btmessage = btmessage == null ? null : btmessage.trim();
    }

    @Override
    public String toString() {
        return "Businesstrip{" +
                "id=" + id +
                ", btid=" + btid +
                ", btdate=" + btdate +
                ", registerdate=" + registerdate +
                ", btmessage='" + btmessage + '\'' +
                '}';
    }
}