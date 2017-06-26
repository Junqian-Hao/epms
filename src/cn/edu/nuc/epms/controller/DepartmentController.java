package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Department;
import cn.edu.nuc.epms.entity.DepartmentExample;
import cn.edu.nuc.epms.mapper.DepartmentCustomMapper;
import cn.edu.nuc.epms.mapper.DepartmentMapper;
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
 * @Date 2017/6/26 11:52
 * @Description :部门
 */
@Controller
@RequestMapping("/DepartmentController")
public class DepartmentController {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    DepartmentCustomMapper departmentCustomMapper;

    private static final Log log = LogFactory.getLog(DepartmentController.class);

    @RequestMapping("/select")
    public void select(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("查询所有部门");
        List<DepartmentCustomMapper> departmentCustomMappers = departmentCustomMapper.selectDepartmentCustom();
        log.debug("查询返回数据" + departmentCustomMappers);
        request.setAttribute("departmentlist", departmentCustomMappers);
        request.getRequestDispatcher("../departmentlist.jsp").forward(request,response);
    }

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request, HttpServletResponse response ,Department department) throws Exception {
        log.debug("添加部门");
        log.debug("请求数据"+department);
        int i = departmentMapper.insert(department);
        if (i > 0) {
            log.debug("插入成功");
        } else {
            log.debug("插入失败");
        }
        response.sendRedirect("select.action");
    }
    @RequestMapping("/update")
    public void update(HttpServletRequest request, HttpServletResponse response ,Department department) throws Exception {
        log.debug("修改部门");
        log.debug("请求数据"+department);
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andEnoEqualTo(department.getEno());
        int i = departmentMapper.updateByExampleSelective(department,departmentExample);
        if (i > 0) {
            log.debug("修改成功");
        } else {
            log.debug("修改失败");
        }
        response.sendRedirect("select.action");
    }

    @RequestMapping("/deleat")
    public void deleat(HttpServletRequest request, HttpServletResponse response ,Department department) throws Exception {
        log.debug("删除部门");
        log.debug("请求数据"+department);
        int i = departmentMapper.deleteByPrimaryKey(department.getEno());
        if (i > 0) {
            log.debug("删除成功");
        } else {
            log.debug("删除失败");
        }
        response.sendRedirect("select.action");
    }
}
