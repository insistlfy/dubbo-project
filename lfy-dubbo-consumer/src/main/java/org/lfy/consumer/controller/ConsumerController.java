package org.lfy.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import org.lfy.consumer.service.ConsumerServiceImpl;
import org.lfy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConsumerController
 * @Description: TODO
 * @Author: LFY
 * @Created: 2021/8/23 18:28
 * @Versions: V1.0
 */
@RestController
@RequestMapping("/dubbo")
public class ConsumerController {

    @Autowired
    private ConsumerServiceImpl consumerService;

    @GetMapping("/consumer")
    private JSONObject consumer() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "200");
        jsonObject.put("message", "success");
        jsonObject.put("data", consumerService.getUser(100L));
        return jsonObject;
    }
}
