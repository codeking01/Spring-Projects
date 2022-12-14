package com.codeking.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author : codeking
 * @date : 2022/11/22 20:17
 */
@Controller
public class DownloadAndUploadController {
    // 下载功能
    @RequestMapping("testDownload")
    public ResponseEntity<byte []> testDownload(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String,String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=ss1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte []> responseEntity=new ResponseEntity<byte []>(bytes,headers,statusCode);
        return responseEntity;
    }

    //文件上传
    @RequestMapping(value = "testUpload",method = RequestMethod.POST)
    public String testUpload(MultipartFile uploadFile,HttpSession session) throws IOException {
        //获取上传的文件的文件名
        String filename =uploadFile.getOriginalFilename();
        //处理文件重名问题
        String splitPointName=filename.substring(filename.lastIndexOf('.'));
        filename= UUID.randomUUID().toString()+splitPointName;
        //获取服务器中uploadFile 目录的路径
        ServletContext servletContext = session.getServletContext();
        String webUploadFile = servletContext.getRealPath("uploadFile");
        File file=new File(webUploadFile);
        if (!file.exists()){ //没有就新建目录
            file.mkdir();
        }
        String finalPath=webUploadFile+File.separator+filename;
        //实现上传功能
        uploadFile.transferTo(new File(finalPath));
        return "success";
    }
}
