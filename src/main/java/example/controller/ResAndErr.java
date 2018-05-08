package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/resanderr")
public class ResAndErr {
    private static final Log logger = LogFactory.getLog(ResAndErr.class);

    @RequestMapping(value = "/err")
    public String err(){
        return "error";
    }
    @RequestMapping(value = "/res")
    public String res(){
        return "response";
    }

}
