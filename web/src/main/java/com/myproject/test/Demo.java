package com.myproject.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * Demo
 *
 * @author: sunjie
 * @date: 15/9/21
 */
@Controller
@RequestMapping(value = "/demo")
public class Demo {

    public Demo(){
        System.out.println("1111");
    }

    @RequestMapping(value = "/test.do")
    public void getDemo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        OutputStream os = null;
        byte[] bs = "21313".getBytes("utf-8");
        response.setContentLength(bs.length);
        os = response.getOutputStream();
        os.write(bs);
        os.flush();
        os.close();
    }
}