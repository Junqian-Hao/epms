package cn.edu.nuc.epms.entity;

import java.util.Date;

public class Employee {
    private Integer id;

    private Integer eno;

    private String name;

    private String sex;

    private Date birth;

    private String nation;

    private String education;

    private String duty;

    private String domicileplace;

    private String politics;

    private String physiological;

    private Date contractsigningdate;

    private Date contractexpirationdate;

    private String contractcontents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getDomicileplace() {
        return domicileplace;
    }

    public void setDomicileplace(String domicileplace) {
        this.domicileplace = domicileplace == null ? null : domicileplace.trim();
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics == null ? null : politics.trim();
    }

    public String getPhysiological() {
        return physiological;
    }

    public void setPhysiological(String physiological) {
        this.physiological = physiological == null ? null : physiological.trim();
    }

    public Date getContractsigningdate() {
        return contractsigningdate;
    }

    public void setContractsigningdate(Date contractsigningdate) {
        this.contractsigningdate = contractsigningdate;
    }

    public Date getContractexpirationdate() {
        return contractexpirationdate;
    }

    public void setContractexpirationdate(Date contractexpirationdate) {
        this.contractexpirationdate = contractexpirationdate;
    }

    public String getContractcontents() {
        return contractcontents;
    }

    public void setContractcontents(String contractcontents) {
        this.contractcontents = contractcontents == null ? null : contractcontents.trim();
    }
}