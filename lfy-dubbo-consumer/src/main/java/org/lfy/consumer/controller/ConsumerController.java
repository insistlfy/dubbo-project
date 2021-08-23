package org.lfy.consumer.controller;

import org.lfy.consumer.service.ConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConsumerController
 * @Description: TODO
 * @Author: LFY
 * @Created: 2021/8/23 18:28
 * @Versions: V3.0
 * @Company: ©2021东方微银科技（西安）有限公司
 */
@RestController
@RequestMapping("/dubbo")
public class ConsumerController {

    @Autowired
    private ConsumerServiceImpl consumerService;

    @GetMapping("/consumer")
    private String consumer() {
        return consumerService.consumer();
    }
}
