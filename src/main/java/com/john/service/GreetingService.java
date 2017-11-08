/* 
 * 项目名：	com.john.service
 * 文件名：	GreetingService
 * 模块说明：	
 * 修改历史：
 * 2017/11/8 - ihui - 创建。
 */

package com.john.service;

/**
 * @author ihui
 * @date 2017/11/8
 */
public interface GreetingService {
    /**
     * 调用注册服务的 greeting
     * @param name
     * @return
     */
    public String greeting(String name);
}
