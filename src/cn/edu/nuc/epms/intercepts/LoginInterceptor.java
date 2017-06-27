package cn.edu.nuc.epms.intercepts;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author 16359
 * @Date 2017/4/25 8:02
 * @Description :拦截未登录用户访问
 */
public class LoginInterceptor implements HandlerInterceptor {
    private static Logger logger = Logger.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        logger.debug("登录拦截器执行");
        String url = request.getRequestURI();
        if (url.indexOf("BusinesstripController/insert.action") >= 0
                || url.indexOf("DepartmentController") >= 0
                || url.indexOf("EmployeeController") >= 0
                || url.indexOf("RprecordController/insert.action") >= 0
                || url.indexOf("insertrprecord.jsp") >= 0
                || url.indexOf("RprecordController/delete.action") >= 0
                || url.indexOf("SupperAdminController") >= 0
                || url.indexOf("TrainController/inserttrain.action") >= 0
                || url.indexOf("TrainController/updatetrain.action") >= 0
                || url.indexOf("TrainrecordController/inserttrainrecord.action") >= 0
                || url.indexOf("TrainController/deletetrain.action") >= 0) {
            if (url.indexOf("login.action")>=0) {
                return true;
            }
            logger.debug("访问特殊页面");
            HttpSession session = request.getSession();
            Object id = session.getAttribute("id");
            if (id == null || session == null) {
                logger.debug("身份不存在,拦截");
                response.sendRedirect("/epms/login.jsp");
                return false;
            }
        }

        return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
