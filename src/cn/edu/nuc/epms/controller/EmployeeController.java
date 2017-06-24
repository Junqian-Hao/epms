package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Employee;
import cn.edu.nuc.epms.mapper.EmployeeMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by macbookair on 2017/6/24.
 */

@Controller
@RequestMapping("/EmployeeController")
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    private static final Log log = LogFactory.getLog(EmployeeController.class);
    @RequestMapping("insert")
    public void insert(HttpServletResponse response, HttpServletRequest request,Employee employee){
        log.debug("insert");

    }

}
