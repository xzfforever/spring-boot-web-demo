package com.xzf.spring.boot.controller;


import com.xzf.spring.boot.exception.DataCheckException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/one")
    public String testOne(){
        return "login";
    }

    /**
     * ControllerHandler中拦截异常
     */
    @GetMapping(value = "/exception")
    public String testException1() throws Exception{
        throw new DataCheckException("110","商品名称中含有违禁词!");
    }

    /**
     * ControllerHandler中拦截异常
     */
    @GetMapping(value = "/exception/one")
    public void testException2() throws Exception{
        throw new Exception("exception");
    }

    @PostMapping(value = "/uploadFile")
    @ResponseBody
    public String testUploadFile(@RequestParam("file") MultipartFile file){
        return file.getName();
    }

}
