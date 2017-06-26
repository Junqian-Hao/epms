package cn.edu.nuc.epms.entity;

/**
 * @Author 16359
 * @Date 2017/6/26 12:57
 * @Description :部门扩展类
 */
public class DepartmentCustom extends Department{
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "DepartmentCustom{" +
                "employee=" + employee +
                "} " + super.toString();
    }
}
