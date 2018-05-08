package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/information")
public class Information {
    private static final Log logger = LogFactory.getLog(Information.class);
    @RequestMapping(value = "/information1")
    public String information(){
        return "info";
    }
}
