package example.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.*;
import example.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class MainIntercepter implements HandlerInterceptor{
    private static final Log logger = LogFactory.getLog(MainIntercepter.class);

    private static final String[] IGNORE_URI={"/product/product1"};

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
               //logger.info("进入这里了");
                User user=(User)request.getSession().getAttribute("user");
                if(user==null){
                    logger.info("MainInterceptor 拦截成功");
                    //request.setAttribute("message","请先登陆");
                    //request.getRequestDispatcher("/userlogin/login").forward(request,response);
                    response.sendRedirect(request.getContextPath()+"/home/hello");
                    return false;
                }
                else {
                    logger.info("MainInterceptor 拦截通行");
                    flag=true;
                }

            }
            else {
                flag=true;

            }
        }


        return flag;
    }




}
