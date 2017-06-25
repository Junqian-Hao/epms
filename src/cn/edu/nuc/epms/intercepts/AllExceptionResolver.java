package cn.edu.nuc.epms.intercepts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 郝俊谦
 * @Date 2017/6/22 08:57
 * @Description : 全局异常处理
 */
public class AllExceptionResolver implements HandlerExceptionResolver {
    private static final Log log = LogFactory.getLog(AllExceptionResolver.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        log.debug("全局异常处理");
        return new ModelAndView("/error.html");
    }
}
