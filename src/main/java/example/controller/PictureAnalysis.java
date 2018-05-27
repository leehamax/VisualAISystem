package example.controller;

import org.apache.commons.io.FileUtils;
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
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;
import example.pojo.User;
import org.apache.ibatis.session.SqlSession;
import test.SFactory;
import javax.servlet.http.HttpSession;
import test.Test;
import jxl.write.WritableWorkbook;
import static test.Test.createExcel;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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
    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request
                                          )throws Exception {
        //下载文件路径
        logger.info("downloading");
        String fileNameAndPath = "D:\\JAVA\\check\\result.xls";
        String fileName="result.xls";
        InputStream in=new FileInputStream(new File(fileNameAndPath));//将该文件加入到输入流之中
        byte[] body=null;
        body=new byte[in.available()];// 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
        in.read(body);//读入到输入流里面
        fileName=new String(fileName.getBytes("gbk"),"iso8859-1");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename="+fileName);
        HttpStatus statusCode = HttpStatus.OK;//设置响应吗
        ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;
    }

}
