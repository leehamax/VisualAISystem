package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import jxl.Cell;
import jxl.Sheet;
import org.json.JSONObject;
import example.com.FileUtil;
import example.com.HttpUtil;
import example.com.Base64Util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class Test {
    private static ArrayList<String> createExcel=new ArrayList<String> () ;
    private static WritableWorkbook book;
    private static WritableSheet sheet ;
    private static WritableFont normalFont;

    private static WritableFont diffFont;
    private static WritableCellFormat normalFormat;
    private static WritableCellFormat diffFormat;
    public static void createExcel(){
        try {
            String fileNameAndPath = "D:\\JAVA\\check\\result.xls";
            book = Workbook.createWorkbook(new File(fileNameAndPath));
            // 生成名为"第一页"的工作表，参数0表示这是第一页
            sheet = book.createSheet("第一页", 0);
            // 设置字体为宋体,11号字,不加粗,颜色为红色
            normalFont = new WritableFont(WritableFont.createFont("宋体"), 11, WritableFont.NO_BOLD);
            // 设置字体为宋体,11号字,不加粗,颜色为红色
            diffFont = new WritableFont(WritableFont.createFont("宋体"), 11, WritableFont.NO_BOLD);
            diffFont.setColour(Colour.RED);

            normalFormat = new WritableCellFormat(normalFont);
            normalFormat.setAlignment(jxl.format.Alignment.CENTRE);
            normalFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);

            diffFormat = new WritableCellFormat(diffFont);
            diffFormat.setAlignment(jxl.format.Alignment.CENTRE);
            diffFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);



            for(int i=0; i<=createExcel.size(); i=i+2){
                if(i==createExcel.size()){
                    break;
                }
                Label lab1 = new Label(0,i,createExcel.get(i));
                if(i+1>createExcel.size()){
                    continue;
                }
                Label lab2 = new Label(2,i,createExcel.get(i+1));

                sheet.addCell(lab1);
                sheet.addCell(lab2);

            }



            book.write();
            book.close();
            System.out.println("创建文件成功!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

        }
    }
    public static void run(String filePath)throws Exception{
       String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
       // 本地图片路径
           byte[] imgData = FileUtil.readFileByBytes(filePath);
           String imgStr = Base64Util.encode(imgData);
           String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
           String accessToken = getAuth("85Z3L7aZClkAu2u2YsAYijV7", "ymGuOhQ287TZb0P8rZEvZQP8ktN50CLk");
           //long startTime=System.currentTimeMillis();
           String result = HttpUtil.post(otherHost, accessToken, params);
           String temp=result.substring(result.indexOf("["),result.indexOf("]"));
           //System.out.println(result);
           System.out.println(temp);
           StringTokenizer token=new StringTokenizer(temp,"\"}");
           boolean a=false;
           boolean b=false;
           while(!(a==true&&b==true)&&token.hasMoreElements()){
               String use=token.nextToken();
               int t=use.lastIndexOf("注册号");
               int t1=use.lastIndexOf("名称");
               if(t>=0){
                   use.substring(t);
                   System.out.println(use);
                   createExcel.add(use);
                   a=true;
               }
               else if(t1>=0){
                   use.substring(t1);
                   System.out.println(use);
                   createExcel.add(use);
                   b=true;
               }

           }
           //long endTime=System.currentTimeMillis(); //获取结束时间
           //System.out.println("程序运行时间： "+(endTime-startTime)+"ms");



   }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for(int a=1;a<=50;a++){
            String aa="D:\\JAVA\\check\\"+a+".png";
            try {
                Test.run(aa);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
       //开始创建excel

        createExcel();
        //结束创建excel
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        createExcel=null;


    }




    public static String getAuth(String ak, String sk) {
        // 获取token地址
        String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
        String getAccessTokenUrl = authHost
                // 1. grant_type为固定参数
                + "grant_type=client_credentials"
                // 2. 官网获取的 API Key
                + "&client_id=" + ak
                // 3. 官网获取的 Secret Key
                + "&client_secret=" + sk;
        try {
            URL realUrl = new URL(getAccessTokenUrl);
            // 打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                //System.err.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = "";
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            //System.err.println("result:" + result);
            JSONObject jsonObject = new JSONObject(result);
            String access_token = jsonObject.getString("access_token");
            return access_token;
        } catch (Exception e) {
            System.err.printf("获取token失败！");
            e.printStackTrace(System.err);
        }
        return null;
    }
}

