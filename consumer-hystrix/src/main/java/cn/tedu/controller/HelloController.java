package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.feign.HelloFeign;

@RestController
public class HelloController {
	@Autowired	//注入Feign接口
	private HelloFeign helloFeign;
	
	
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFallback")
	public String hello(@PathVariable String name){
		//调用提供者
		return helloFeign.hello(name);
	}
	
	public String helloFallback(String name){
		return "tony";
	}
}
