package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.Remove;
import cn.edu.nuc.epms.entity.RemoveExample;
import cn.edu.nuc.epms.mapper.RemoveMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by macbookair on 2017/6/26.
 */
@Controller
@RequestMapping("/RemoveController")
public class RemoveController {
    @Autowired
    RemoveMapper removeMapper;

    private static final Log log = LogFactory.getLog(EmployeeController.class);

    @RequestMapping("insertRemove")
    public void insertRemove(HttpServletRequest request, HttpServletResponse response,Remove remove)throws Exception {
        log.debug("插入调动信息");
        int insert=removeMapper.insert(remove);
        if(insert>0){
            log.debug("调动记录插入成功");
        }else{
            log.debug("记录插入失败");
        }
        response.sendRedirect("removelist.action");
    }
    @RequestMapping("removelist")
    public void removelist(HttpServletResponse response,HttpServletRequest request)throws Exception{
        RemoveExample removeExample=new RemoveExample();
        List<Remove> removes=removeMapper.selectByExample(removeExample);
        log.debug("调动记录" + removes);
        request.setAttribute("removelist",removes);
        request.getRequestDispatcher("../removelist.jsp").forward(request,response);
    }

}
