package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Businesstrip;
import cn.edu.nuc.epms.entity.BusinesstripExample;
import cn.edu.nuc.epms.mapper.BusinesstripMapper;
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
 * @Date 2017/6/26 17:14
 * @Description :出差
 */
@Controller
@RequestMapping("/BusinesstripController")
public class BusinesstripController {
    @Autowired
    BusinesstripMapper businesstripMapper;
    private static final Log log = LogFactory.getLog(BusinesstripController.class);

    @RequestMapping("/insert")
    public void insert(HttpServletRequest request, HttpServletResponse response , Businesstrip businesstrip) throws Exception {
        log.debug("添加出差记录 ");
        log.debug("请求数据" + businesstrip);
        int i = businesstripMapper.insert(businesstrip);
        if (i > 0) {
            log.debug("插入成功");
        } else {
            log.debug("签到失败");
        }
        response.sendRedirect("selectAll.action");
    }

    @RequestMapping("/selectAll")
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("查询所有出差信息");
        BusinesstripExample businesstripExample = new BusinesstripExample();
        List<Businesstrip> businesstrips = businesstripMapper.selectByExample(businesstripExample);
        request.setAttribute("businesstriplist", businesstrips);
        request.getRequestDispatcher("../businesstriplist.jsp").forward(request, response);

    }
    @RequestMapping("/selectById")
    public void selectById(HttpServletRequest request, HttpServletResponse response , int id) throws Exception {
        log.debug("通过id查询信息");
        BusinesstripExample businesstripExample = new BusinesstripExample();
        BusinesstripExample.Criteria criteria = businesstripExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Businesstrip> businesstrips = businesstripMapper.selectByExample(businesstripExample);
        request.setAttribute("businesstriplist", businesstrips);
        request.getRequestDispatcher("../businesstriplist.jsp").forward(request, response);

    }

    @RequestMapping("/registe")
    public void registe(HttpServletRequest request, HttpServletResponse response , Businesstrip businesstrip) throws Exception {
        log.debug("出差报道");
        log.debug("请求数据" + businesstrip);
        BusinesstripExample businesstripExample = new BusinesstripExample();
        BusinesstripExample.Criteria criteria = businesstripExample.createCriteria();
        criteria.andBtidEqualTo(businesstrip.getBtid());
        List<Businesstrip> businesstrips = businesstripMapper.selectByExample(businesstripExample);
        Businesstrip businesstrip1 = businesstrips.get(0);
        businesstrip1.setRegisterdate(new Date());
        int i = businesstripMapper.updateByExampleSelective(businesstrip1, businesstripExample);
        if (i > 0) {
            log.debug("报道成功");
            request.setAttribute("message","报道成功");
        } else {
            log.debug("报道失败");
            request.setAttribute("message","报道失败");
        }
        response.sendRedirect("selectById.action?id="+businesstrip1.getId());
    }
}
