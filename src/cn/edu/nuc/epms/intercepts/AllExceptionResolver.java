package cn.edu.nuc.epms.intercepts;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 郝俊谦
 * @Date 2017/6/22 08:57
 * @Description : 全局异常处理
 */
public class AllExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        try {
            httpServletResponse.sendRedirect("error.html");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}
