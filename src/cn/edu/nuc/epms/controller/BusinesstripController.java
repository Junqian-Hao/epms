package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Businesstrip;
import cn.edu.nuc.epms.mapper.BusinesstripMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        log.debug("添加出差记录");
        log.debug("请求数据" + businesstrip);

    }
}
