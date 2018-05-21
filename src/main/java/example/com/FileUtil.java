package example.com;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * leeham 2018.5.1
 */
public class FileUtil {


    public static String readFileAsString(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        }

        if (file.length() > 1024 * 1024 * 1024) {
            throw new IOException("File is too large");
        }

        StringBuilder sb = new StringBuilder((int) (file.length()));
        // 创建字节输入流
        FileInputStream fis = new FileInputStream(filePath);
        // 创建一个长度为10240的Buffer
        byte[] bbuf = new byte[10240];
        // 用于保存实际读取的字节数
        int hasRead = 0;
        while ( (hasRead = fis.read(bbuf)) > 0 ) {
            sb.append(new String(bbuf, 0, hasRead));
        }
        fis.close();
        return sb.toString();
    }

    public static File convert(MultipartFile file)
    {
        File convFile = new File(file.getOriginalFilename());
        try {
            convFile.createNewFile();
            FileOutputStream fos = new FileOutputStream(convFile);
            fos.write(file.getBytes());
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return convFile;
    }
    public static byte[] readFileByBytes(MultipartFile file1) throws IOException {
            File file = FileUtil.convert(file1) ;
            ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
            BufferedInputStream in = null;
            try {
                in = new BufferedInputStream(new FileInputStream(file));
                short bufSize = 1024;
                byte[] buffer = new byte[bufSize];
                int len1;
                while (-1 != (len1 = in.read(buffer, 0, bufSize))) {
                    bos.write(buffer, 0, len1);
                }

                byte[] var7 = bos.toByteArray();
                return var7;
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException var14) {
                    var14.printStackTrace();
                }

                bos.close();
            }

    }

//    public static byte[] readFileByBytes(String filePath) throws IOException {
//        File file = new File(filePath);
//        if (!file.exists()) {
//            throw new FileNotFoundException(filePath);
//        } else {
//            ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
//            BufferedInputStream in = null;
//
//            try {
//                in = new BufferedInputStream(new FileInputStream(file));
//                short bufSize = 1024;
//                byte[] buffer = new byte[bufSize];
//                int len1;
//                while (-1 != (len1 = in.read(buffer, 0, bufSize))) {
//                    bos.write(buffer, 0, len1);
//                }
//
//                byte[] var7 = bos.toByteArray();
//                return var7;
//            } finally {
//                try {
//                    if (in != null) {
//                        in.close();
//                    }
//                } catch (IOException var14) {
//                    var14.printStackTrace();
//                }
//
//                bos.close();
//            }
//        }
//    }
}
