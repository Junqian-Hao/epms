package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.*;
import cn.edu.nuc.epms.mapper.EmployeeMapper;
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

    @RequestMapping("inserttrainrecord")
    public void inserttrainrecord(HttpServletRequest request, HttpServletResponse response,TrainrecordKey trainrecordKey) throws Exception{
        log.debug("插入一条培训记录");
        int insert=trainrecordMapper.insert(trainrecordKey);

        if (insert>0){
            log.debug("插入记录成功");
        }else{
            log.debug("插入记录失败");
        }

        response.sendRedirect("trainlist.action");
    }
    @RequestMapping("trainrecordlist")
    public void trainrecordlist(HttpServletResponse response,HttpServletRequest request)throws Exception{
        TrainrecordExample trainrecordExample=new TrainrecordExample();
        EmployeeExample employeeExample=new EmployeeExample();
        TrainExample trainExample=new TrainExample();
        List<TrainrecordKey> trainrecordKeys=trainrecordMapper.selectByExample(trainrecordExample);
        List<Train> trains=trainMapper.selectByExample(trainExample);
        List<Employee> employees=employeeMapper.selectByExample(employeeExample);
        log.debug("培训记录"+trainrecordKeys);
        request.setAttribute("trainrecordlist",trainrecordKeys);
        request.setAttribute("trainlist",trains);
        request.setAttribute("employeelist",employees);
        request.getRequestDispatcher("../trainrecordlist.jsp").forward(request,response);
    }

}
