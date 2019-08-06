package cn.van.log.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志控制器
 *
 * @author Van
 * @since 2019.2.26
 */
@RestController
@RequestMapping("/log")
public class LogbackController {

    /**
     * 测试正常请求
     * @param msg
     * @return
     */
    @GetMapping("/{msg}")
    public String getMsg(@PathVariable String msg) {
        return "request msg : " + msg;
    }

    /**
     * 测试抛异常
     * @return
     */
    @GetMapping("/exception")
    public String getException(){
        // 故意造出一个异常
        Integer.parseInt("abc123");
        return "success";
    }
}
