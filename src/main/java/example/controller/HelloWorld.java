package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HelloWorld {

    private static final Log logger = LogFactory.getLog(HelloWorld.class);

    @RequestMapping(value = "/hello")
    public String hello(){
        return "login";
    }
    @RequestMapping(value = "/hi")
    public String hi(){
        return "signup";
    }

}
