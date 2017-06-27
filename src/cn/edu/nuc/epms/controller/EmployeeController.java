package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Employee;
import cn.edu.nuc.epms.entity.EmployeeExample;
import cn.edu.nuc.epms.entity.Remove;
import cn.edu.nuc.epms.entity.RemoveExample;
import cn.edu.nuc.epms.mapper.EmployeeMapper;
import cn.edu.nuc.epms.mapper.RemoveMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by macbookair on 2017/6/24.
 */

@Controller
@RequestMapping("/EmployeeController")

public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    RemoveMapper removeMapper;

    private static final Log log = LogFactory.getLog(EmployeeController.class);

    @RequestMapping("employeelist")
    public void employeelist(HttpServletResponse response, HttpServletRequest request) throws Exception {
        log.debug("显示所有员工信息");
        EmployeeExample employeeExample = new EmployeeExample();
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        log.debug("查询结果" + employees);
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("../employeelist.jsp").forward(request,response);

    }

    @RequestMapping("insertEmployee")
    public void insertEmployee(HttpServletResponse response, HttpServletRequest request, Employee employee) throws Exception {
        log.debug("insert");
        int insert = employeeMapper.insert(employee);
        if (insert > 0) {
            Remove remove=new Remove();
            remove.setId(employee.getId());
            remove.setRmethod("进入公司");
            remove.setRdate(new Date());
            removeMapper.insert(remove);
            log.debug("欢迎成为本公司的一员");
        } else {
            log.debug("添加信息失败");
        }
        response.sendRedirect("employeelist.action");
    }

    @RequestMapping("deleteEmployee")
    public void deleteEmployee(HttpServletResponse response, HttpServletRequest request, Employee employee) throws Exception {
        log.debug("delete");
        EmployeeExample employeeExample=new EmployeeExample();
        Employee employee1 = employeeMapper.selectByPrimaryKey(employee.getId());
        employee1.setDuty("离职");
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andIdEqualTo(employee.getId());
        int delete = employeeMapper.updateByExample(employee1,employeeExample);
        if (delete > 0) {
            Remove remove=new Remove();
            remove.setId(employee.getId());
            remove.setRmethod("离职");
            remove.setRdate(new Date());
            removeMapper.insert(remove);
        } else {
            log.debug("未移除指定员工");
        }
        response.sendRedirect("employeelist.action");
    }

    @RequestMapping("updateEmployee")
    public void updateEmployee(HttpServletRequest request, HttpServletResponse response, Employee employee) throws Exception {
        log.debug("update");
        Employee employee1=employeeMapper.selectByPrimaryKey(employee.getId());
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andIdEqualTo(employee.getId());
        int update = employeeMapper.updateByExample(employee, employeeExample);
        if (update > 0) {
            log.debug("资料修改成功");
            if(employee.getDuty().equals(employee1.getDuty()))
            {
                response.sendRedirect("employeelist.action");
            }
            else {
                String method = "原职位："+employee.getDuty()+"->新职位："+employee.getDuty();
                Remove remove=new Remove();
                remove.setId(employee.getId());
                remove.setRmethod(method);
                remove.setRdate(new Date());
                removeMapper.insert(remove);
            }
        } else {
            log.debug("员工资料修改失败");
        }
        response.sendRedirect("employeelist.action");
    }

    @RequestMapping("test")
    public void test(HttpServletRequest request, HttpServletResponse response, Employee data) throws Exception {
        log.debug("日期时间测试");
        log.debug(data);

    }

}
