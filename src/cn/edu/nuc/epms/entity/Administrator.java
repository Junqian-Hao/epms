package cn.edu.nuc.epms.entity;

public class Administrator {
    private Integer adminid;

    private String password;

    private Integer type;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminid=" + adminid +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}