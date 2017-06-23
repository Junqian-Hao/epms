package cn.edu.nuc.epms.entity;

import java.util.Date;

public class Salary {
    private Integer salaryid;

    private Integer id;

    private Float bassallary;

    private Float fine;

    private Float award;

    private Date paydate;

    public Integer getSalaryid() {
        return salaryid;
    }

    public void setSalaryid(Integer salaryid) {
        this.salaryid = salaryid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBassallary() {
        return bassallary;
    }

    public void setBassallary(Float bassallary) {
        this.bassallary = bassallary;
    }

    public Float getFine() {
        return fine;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }

    public Float getAward() {
        return award;
    }

    public void setAward(Float award) {
        this.award = award;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }
}