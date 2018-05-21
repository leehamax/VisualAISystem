package example.controller;

import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import example.pojo.Info;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.UUID;
import example.pojo.User;
import org.apache.ibatis.session.SqlSession;
import test.SFactory;
import javax.servlet.http.HttpSession;
import test.Test;
import jxl.write.WritableWorkbook;
import static test.Test.createExcel;

@Controller
@RequestMapping(value = "/picture")
public class PictureAnalysis {
    private static final Log logger = LogFactory.getLog(PictureAnalysis.class);
    @RequestMapping(value = "/analysis")
    public void analysisPicture(@RequestParam(value = "fileArray") MultipartFile[] fileArray){
        for(int i=0;i<fileArray.length;i++){
            MultipartFile file = fileArray[i];
            try {
                Test.run(file);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //开始创建excel
        WritableWorkbook b=Test.createExcel();
        Test.createExcel=null;

    }


}
