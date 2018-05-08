package example.controller;
import com.sun.deploy.net.HttpResponse;
import org.apache.commons.logging.*;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import example.pojo.User;
import org.apache.ibatis.session.SqlSession;
import test.SFactory;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/userlogin")
public class UserLogin {
    private static final Log logger = LogFactory.getLog(UserLogin.class);

    @RequestMapping(value = "/login")
    public String register(@RequestParam("login_form_username") String login_form_username,
                           @RequestParam("login_form_password") String login_form_password, Model model,
                           HttpSession session){
        logger.info("login方法调用中");
        SqlSession session1 = SFactory.getSqlSession();
        User user=session1.selectOne("mapper.UserMapper.findByName",login_form_username);
        if(user==null){
            session1.commit();
            session1.close();
            return "login";
        }
        else{
            if(user.getPassword().equals(login_form_password)){
                session1.commit();
                session1.close();
                model.addAttribute("user",user);
                session.setAttribute("user",user);
                return "fir";
            }
            else{
                logger.info(user.getPassword());
                logger.info(login_form_password);
                session1.commit();
                session1.close();
                return "product";
            }

        }
    }
}
