/* 
 * 项目名：	com.john.service.impl
 * 文件名：	GreetingServiceImpl
 * 模块说明：	
 * 修改历史：
 * 2017/11/8 - ihui - 创建。
 */

package com.john.service.impl;

import com.john.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ihui
 * @date 2017/11/8
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    RestTemplate template;

    @Override
    public String greeting(String name) {
        return template.getForObject("http://SPRINGCLOUDAPP/greeting?name=" + name, String.class);
    }
}
