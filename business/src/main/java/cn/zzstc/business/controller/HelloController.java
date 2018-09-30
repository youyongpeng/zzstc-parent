package cn.zzstc.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author youyp
 * @DATE 2018/9/28/028
 */
@RestController
public class HelloController {


    @GetMapping("/v1/hello")
    public String hello(){

        return "hello";
    }

}
