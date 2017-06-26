package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Attendance;
import cn.edu.nuc.epms.entity.AttendanceExample;
import cn.edu.nuc.epms.entity.Employee;
import cn.edu.nuc.epms.mapper.AttendanceMapper;
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
 * @Author 16359
 * @Date 2017/6/26 14:58
 * @Description :出勤记录
 */
@Controller
@RequestMapping("/AttendanceController")
public class AttendanceController {
    @Autowired
    AttendanceMapper attendanceMapper;
    private static final Log log = LogFactory.getLog(AttendanceController.class);

    @RequestMapping("/statWork")
    public void statWork(HttpServletRequest request, HttpServletResponse response , int id,int isovertime) throws Exception {
        log.debug("上班打卡");
        log.debug("请求数据" + id+isovertime);
        Date date = new Date();
        AttendanceExample attendanceExample = new AttendanceExample();
        AttendanceExample.Criteria criteria = attendanceExample.createCriteria();
        criteria.andAttdateEqualTo(date);
        criteria.andIdEqualTo(id);
        criteria.andIsovertimeEqualTo(isovertime);
        List<Attendance> attendances = attendanceMapper.selectByExample(attendanceExample);
        if (attendances.size() > 0) {
            request.setAttribute("message","您今天已签到");
            request.getRequestDispatcher("../eindex.jsp").forward(request, response);
            return;
        }
        Attendance attendance = new Attendance();
        attendance.setId(id);
        attendance.setAttdate(date);
        attendance.setWorkhours(date);
        attendance.setIsovertime(isovertime);
        int i = attendanceMapper.insertSelective(attendance);
        if (i > 0) {
            log.debug("插入成功");
            request.setAttribute("message","签到成功");
        } else {
            log.debug("签到失败");
            request.setAttribute("message","签到失败");
        }
        request.getRequestDispatcher("../eindex.jsp").forward(request,response);
    }

    @RequestMapping("/endWork")
    public void endWork(HttpServletRequest request, HttpServletResponse response , Employee employee) throws Exception {
        log.debug("下班打卡");
        log.debug("请求数据" + employee);
        Date date = new Date();
        AttendanceExample attendanceExample = new AttendanceExample();
        AttendanceExample.Criteria criteria = attendanceExample.createCriteria();
        criteria.andAttdateEqualTo(date);
        criteria.andIdEqualTo(employee.getId());
        List<Attendance> attendances = attendanceMapper.selectByExample(attendanceExample);
        if (attendances.size() < 0) {
            request.setAttribute("message","您尚未签到");
            request.getRequestDispatcher("../eindex.jsp").forward(request, response);
            return;
        }
        Attendance attendance = attendances.get(0);
        attendance.setClosingtime(date);
        int i = attendanceMapper.updateByPrimaryKeySelective(attendance);
        if (i > 0) {
            log.debug("签退成功");
            request.setAttribute("message","签退成功");
        } else {
            log.debug("签退失败");
            request.setAttribute("message","签退失败");
        }
        request.getRequestDispatcher("../eindex.jsp").forward(request,response);
    }
    @RequestMapping("/selectAll")
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("查询所有签到信息");
        AttendanceExample attendanceExample = new AttendanceExample();
        List<Attendance> attendances = attendanceMapper.selectByExample(attendanceExample);
        request.getRequestDispatcher("../eindex.jsp").forward(request,response);
    }

}
