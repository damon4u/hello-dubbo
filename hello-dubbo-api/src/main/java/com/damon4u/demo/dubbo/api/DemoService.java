package com.damon4u.demo.dubbo.api;

/**
 * Description:
 *  对外暴露的Service接口，provider和consumer都引入该包
 * @author damon4u
 * @version 2017-12-20 14:33
 */
public interface DemoService {

    /**
     * sayHello
     */
    String sayHello(String name);
}
