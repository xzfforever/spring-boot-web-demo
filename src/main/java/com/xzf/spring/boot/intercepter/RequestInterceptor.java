package com.xzf.spring.boot.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestInterceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    /**
     *在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("----RequestInterceptor---preHandle-:"+httpServletRequest.getRequestURL().toString());
        return true;
    }

    /**
     * 该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用，可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作。
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("----RequestInterceptor---postHandle--");

    }

    /**
     *该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行,用于进行资源清理。
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("----RequestInterceptor---afterCompletion--");
    }
}
