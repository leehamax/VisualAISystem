package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/main")
public class Main {
    private static final Log logger = LogFactory.getLog(Main.class);

    @RequestMapping(value = "/main1")
    public String main1(){
        return "fir";
    }
}
