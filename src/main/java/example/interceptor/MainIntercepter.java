package example.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.*;
import example.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class MainIntercepter implements HandlerInterceptor{
    private static final Log logger = LogFactory.getLog(MainIntercepter.class);

    private static final String[] IGNORE_URI={"/home/hi","/home/hello"};

    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object handler, Exception arg3)throws Exception{
        logger.info("MainInterceptor afterCompletion");

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object handler, ModelAndView modelAndView)throws Exception{
        logger.info("MainInterceptor postHandle");

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        logger.info("MainInterceptor preHandle");
        boolean flag =false;
        String servletPath=request.getServletPath();
        for(String s:IGNORE_URI){
            if(servletPath.contains(s)){
                flag=true;
                break;
            }
        }
        if(!flag){
            User user=(User)request.getSession().getAttribute("user");
            if(user==null){
                logger.info("MainInterceptor 拦截成功");
                request.setAttribute("message","请先登陆");
                request.getRequestDispatcher("login").forward(request,response);
            }
            else {
                logger.info("MainInterceptor 拦截通行");
                flag=true;
            }
        }
        return flag;
    }




}
