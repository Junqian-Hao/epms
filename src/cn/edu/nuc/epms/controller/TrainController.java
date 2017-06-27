package cn.edu.nuc.epms.controller;

import cn.edu.nuc.epms.entity.EmployeeExample;
import cn.edu.nuc.epms.entity.Train;
import cn.edu.nuc.epms.entity.TrainExample;
import cn.edu.nuc.epms.mapper.TrainMapper;
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
@RequestMapping("/TrainController")
public class TrainController{
    @Autowired
    TrainMapper trainMapper;
    private static final Log log = LogFactory.getLog(SupperAdminController.class);

    @RequestMapping("trainlist")
    public void trainlist(HttpServletRequest request, HttpServletResponse response)throws Exception{
        log.debug("培训信息");
        TrainExample trainExample=new TrainExample();
        List<Train> trains=trainMapper.selectByExample(trainExample);
        log.debug("培训信息"+trains);
        request.setAttribute("trainlist",trains);
        request.getRequestDispatcher("../trainlist.jsp").forward(request,response);
    }
    @RequestMapping("inserttrain")
    public void inserttrain(HttpServletResponse response,HttpServletRequest request,Train train) throws Exception{
        log.debug("添加培训信息");
        int insert=trainMapper.insert(train);
        if(insert>0){
            log.debug("添加培训信息成功");
        }else {
            log.debug("添加信息失败");
        }
        response.sendRedirect("trainlist.action");
    }
    @RequestMapping("updatetrain")
    public void updatetrain(HttpServletRequest request,HttpServletResponse response,Train train)throws Exception{
     TrainExample trainExample=new TrainExample();
     TrainExample.Criteria criteria=trainExample.createCriteria();
     criteria.andTrainidEqualTo(train.getTrainid());
     int update=trainMapper.updateByExample(train,trainExample);
     if(update>0){
         log.debug("修改成功");
     }else {
         log.debug("修改失败");
     }
      response.sendRedirect("trainlist.action");
    }
    @RequestMapping("deletetrain")
    public void deletetrain(HttpServletResponse response,HttpServletRequest request,Train train)throws Exception{
        log.debug("删除该培训");
        int del=trainMapper.deleteByPrimaryKey(train.getTrainid());
        if(del>0){
            log.debug("取消成功");
        }
        else{
            log.debug("取消失败");
        }
        response.sendRedirect("trainlist.action");
    }
}
