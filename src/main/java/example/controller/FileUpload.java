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
import java.io.File;
import java.util.UUID;

import example.pojo.User;
import org.apache.ibatis.session.SqlSession;
import test.SFactory;
import javax.servlet.http.HttpSession;
@Controller
@RequestMapping(value = "/file")
public class FileUpload {
    private static final Log logger = LogFactory.getLog(FileUpload.class);
    @RequestMapping(value = "/upload")
    public String upload(@RequestParam(value = "video", required = false) MultipartFile video,
                               @RequestParam(value = "cover", required = false) MultipartFile cover, HttpServletRequest request, ModelMap map,HttpSession session){
     logger.info("upload方法调用中");
     if(!(video.isEmpty()&&cover.isEmpty())){
         try {


             String path1=request.getSession().getServletContext().getRealPath("video/");
             File tempFile1 = new File(path1, video.getOriginalFilename());
             if (!tempFile1.getParentFile().exists()) {
                 tempFile1.getParentFile().mkdir();
             }
             if (!tempFile1.exists()) {
                 tempFile1.createNewFile();
             }
             video.transferTo(tempFile1);

             String path=request.getSession().getServletContext().getRealPath("videoimg/");
             File tempFile = new File(path, cover.getOriginalFilename());
             if (!tempFile.getParentFile().exists()) {
                 tempFile.getParentFile().mkdir();
             }
             if (!tempFile.exists()) {
                 tempFile.createNewFile();
             }
             cover.transferTo(tempFile);
             Info info=new Info();
             User user=(User)session.getAttribute("user");
             SqlSession session1 = SFactory.getSqlSession();
             User temp=session1.selectOne("mapper.UserMapper.findByName",user.getUsername());
             info.setUser_id(temp.getId());
             info.setUser(user);
             info.setUser_info("/video/" + tempFile1.getName());
             logger.info("/video/" + tempFile1.getName());
             info.setVideo_name(video.getOriginalFilename());
             info.setVideo_img("/videoimg/" + tempFile.getName());
             logger.info("video/" + tempFile.getName());
             session.setAttribute("info",info);
             session1.insert("mapper.InfoMapper.insertInfo",info);
             session1.commit();
             session1.close();
             return "fir";
         }catch (Exception e){
             e.printStackTrace();
         }
     }
    return "history";
    }

}
