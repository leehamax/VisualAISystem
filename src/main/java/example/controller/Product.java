package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/product")
public class Product {
    private static final Log logger = LogFactory.getLog(Product.class);
    @RequestMapping(value = "/product1")
    public String product(){
        return "product";
    }
}
