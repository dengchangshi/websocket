package com.example.websocket.controller;

import com.example.websocket.service.WebSocket;
import com.example.websocket.service.WebSocketTest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @Author: dengcs
 * @Date: 2019/11/19 16:16
 * Comment:
 */
@Controller
public class TestController {
    @Resource
    private WebSocketTest webSocket;

    /**
     * 页面文件入口
     */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 发送场景模拟
     * @param msg
     * @return
     */
    @GetMapping("/test")
    @ResponseBody
    public String sendMessage(String msg) throws IOException {
        //如果访问的地址中msg参数不为空值，发送msg的值给前端
        if(!StringUtils.isEmpty(msg)){
            webSocket.sendMessage(msg);
            //webSocket.sendToUser(msg);
            return "服务端发送消息msg："+msg;
        }
        return "服务端未发送消息msg："+msg;
    }
}
