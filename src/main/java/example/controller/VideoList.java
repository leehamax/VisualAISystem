package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/down")
public class VideoList {
    private static final Log logger = LogFactory.getLog(VideoList.class);
    @RequestMapping(value = "/videlist")
    public String product(){
        return "aboutus";
    }
}
