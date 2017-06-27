package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Rprecord;
import cn.edu.nuc.epms.entity.RprecordExample;
import cn.edu.nuc.epms.mapper.RprecordMapper;
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
 * @Date 2017/6/27 10:33
 * @Description :奖惩记录
 */
@Controller
@RequestMapping("/RprecordController")
public class RprecordController {
    @Autowired
    RprecordMapper rprecordMapper;

    private static final Log log = LogFactory.getLog(RprecordController.class);

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request, HttpServletResponse response, Rprecord rprecord) throws Exception {
        log.debug("添加奖惩记录");
        log.debug("请求数据" + rprecord);
        rprecord.setRpdate(new Date());

        int i = rprecordMapper.insert(rprecord);
        if (i > 0) {
            log.debug("插入成功");
        } else {
            log.debug("插入失败");
        }
        response.sendRedirect("selectAll.action");
    }

    @RequestMapping("/selectAll")
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("查询所有奖惩记录");
        RprecordExample rprecordExample = new RprecordExample();
        List<Rprecord> rprecords = rprecordMapper.selectByExample(rprecordExample);
        request.setAttribute("rprecordlist", rprecords);
        request.getRequestDispatcher("../rprecordlist.jsp").forward(request, response);


    }

    @RequestMapping("/selectById")
    public void selectById(HttpServletRequest request, HttpServletResponse response, int id) throws Exception {
        log.debug("通过id查询奖惩记录");
        RprecordExample rprecordExample = new RprecordExample();
        RprecordExample.Criteria criteria = rprecordExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Rprecord> rprecords = rprecordMapper.selectByExample(rprecordExample);
        request.setAttribute("rprecordlist", rprecords);
        request.getRequestDispatcher("../rprecordlist.jsp").forward(request, response);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, HttpServletResponse response, int rpid) throws Exception {
        log.debug("通过id查询奖惩记录");
        int i = rprecordMapper.deleteByPrimaryKey(rpid);
        if (i > 0) {
            log.debug("删除成功");
        } else {
            log.debug("删除失败");
        }
        response.sendRedirect("selectAll.action");
    }
}
