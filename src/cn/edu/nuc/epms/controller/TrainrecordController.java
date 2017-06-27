package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.*;
import cn.edu.nuc.epms.mapper.EmployeeMapper;
import cn.edu.nuc.epms.mapper.TrainCustomMapper;
import cn.edu.nuc.epms.mapper.TrainMapper;
import cn.edu.nuc.epms.mapper.TrainrecordMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by macbookair on 2017/6/27.
 */
@Controller
@RequestMapping("/TrainrecordController")
public class TrainrecordController {

    private static final Log log = LogFactory.getLog(EmployeeController.class);
    @Autowired
    TrainrecordMapper trainrecordMapper;
    @Autowired
    TrainMapper trainMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    TrainCustomMapper trainCustomMapper;

    @RequestMapping("inserttrainrecord")
    public void inserttrainrecord(HttpServletRequest request, HttpServletResponse response,TrainrecordKey trainrecordKey) throws Exception{
        log.debug("插入一条培训记录");
        int insert=trainrecordMapper.insert(trainrecordKey);

        if (insert>0){
            log.debug("插入记录成功");
        }else{
            log.debug("插入记录失败");
        }

        response.sendRedirect("trainrecordlist.action");
    }
    @RequestMapping("trainrecordlist")
    public void trainrecordlist(HttpServletResponse response,HttpServletRequest request)throws Exception{
        List<TrainCustomMapper> trainCustomMappers = trainCustomMapper.selectTrainCustomMapper();
        log.debug("培训记录"+trainCustomMappers);
        request.setAttribute("trainrecordlist",trainCustomMappers);
        request.getRequestDispatcher("../trainrecordlist.jsp").forward(request,response);
    }

}
