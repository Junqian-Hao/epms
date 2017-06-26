package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Administrator;
import cn.edu.nuc.epms.entity.AdministratorExample;
import cn.edu.nuc.epms.mapper.AdministratorMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author 16359
 * @Date 2017/6/23 21:01
 * @Description :超级管理员
 */
@Controller
@RequestMapping("/SupperAdminController")
public class SupperAdminController {
    @Autowired
    AdministratorMapper administratorMapper;

    private static final Log log = LogFactory.getLog(SupperAdminController.class);

    @RequestMapping("login")
    public void login(HttpServletRequest request, HttpServletResponse response, Administrator administrator) throws Exception {
        log.debug("用户登录");
        if (administrator == null) {
            request.setAttribute("message", "请输入账号密码");
            request.getRequestDispatcher("../login.jsp").forward(request, response);
            return;
        }
        AdministratorExample administratorExample = new AdministratorExample();
        AdministratorExample.Criteria criteria = administratorExample.createCriteria();
        criteria.andAdminidEqualTo(administrator.getAdminid());
        criteria.andPasswordEqualTo(administrator.getPassword());
        List<Administrator> administrators = administratorMapper.selectByExample(administratorExample);
        log.debug("查询返回" + administrators);
        if (administrators == null || administrators.size() == 0) {
            log.debug("账号密码错误");
            request.setAttribute("message", "账号或密码错误");
            request.getRequestDispatcher("../login.jsp").forward(request, response);
            return;
        }
        log.debug("登录成功");
        request.getSession().setAttribute("id",administrator.getAdminid());
        response.sendRedirect("../index.jsp");
    }

    @RequestMapping("adminlist")
    public void adminlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("显示所有管理员");
        AdministratorExample administratorExample = new AdministratorExample();
        List<Administrator> administrators = administratorMapper.selectByExample(administratorExample);
        log.debug("查询结果:" + administrators);
        request.setAttribute("adminlist", administrators);
        request.getRequestDispatcher("../adminlist.jsp").forward(request, response);
    }

    @RequestMapping("update")
    public void updateAdministrator(HttpServletRequest request, HttpServletResponse response , Administrator administrator) throws Exception {
        log.debug("修改管理员信息");
        AdministratorExample administratorExample = new AdministratorExample();
        AdministratorExample.Criteria criteria = administratorExample.createCriteria();
        criteria.andAdminidEqualTo(administrator.getAdminid());
        int i = administratorMapper.updateByExample(administrator, administratorExample);
        if (i > 0) {
            log.debug("修改成功");
        } else {
            log.debug("修改失败");
        }
        response.sendRedirect("adminlist.action");
    }

    @RequestMapping("insertAdministrator")
    public void insertAdministrator(HttpServletRequest request, HttpServletResponse response , Administrator administrator) throws Exception {
        log.debug("添加管理员");
        log.debug("请求数据"+administrator);
        int insert = administratorMapper.insert(administrator);
        if (insert > 0) {
            log.debug("查入成功");
        } else {
            log.debug("插入失败");
        }
        response.sendRedirect("adminlist.action");
    }
    @RequestMapping("deleteAdministrator")
    public void deleteAdministrator(HttpServletRequest request, HttpServletResponse response , Administrator administrator) throws Exception {
        log.debug("删除管理员");
        log.debug("请求数据"+administrator);
        AdministratorExample administratorExample = new AdministratorExample();
        AdministratorExample.Criteria criteria = administratorExample.createCriteria();
        criteria.andAdminidEqualTo(administrator.getAdminid());
        int i = administratorMapper.deleteByExample(administratorExample);
        if (i > 0) {
            log.debug("删除成功");
        } else {
            log.debug("删除失败");
        }
        response.sendRedirect("adminlist.action");
    }
}
