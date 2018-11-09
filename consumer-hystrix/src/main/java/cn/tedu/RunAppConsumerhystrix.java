package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//标识feign
@SpringCloudApplication
@EnableFeignClients
public class RunAppConsumerhystrix {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerhystrix.class, args);
	}

}
