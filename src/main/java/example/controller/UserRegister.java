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
@SessionAttributes("user")
@RequestMapping(value = "/userresgister")
public class UserRegister {
    private static final Log logger = LogFactory.getLog(UserRegister.class);

    @RequestMapping(value = "/register")
    public String register(@RequestParam("signup_form_username") String signup_form_username,
                           @RequestParam("signup_form_email") String signup_form_email,
                           @RequestParam("signup_form_usernumber") String signup_form_usernumber,
                           @RequestParam("signup_form_usernumber") String signup_form_password, Model model,
                           HttpSession session){
        logger.info("register方法调用中");
       User user=new User();
       user.setUsername(signup_form_username);
       user.setMailbox(signup_form_email);
       user.setNumber(signup_form_usernumber);
       user.setPassword(signup_form_password);
       model.addAttribute("user",user);
      session.setAttribute("user",user);
        SqlSession session1 = SFactory.getSqlSession();
        session1.insert("mapper.UserMapper.insertUser",user);
        session1.commit();
        session1.close();
        return "fir";
    }

}
