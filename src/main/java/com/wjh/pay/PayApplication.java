package com.wjh.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wjh.pay.dao")
public class PayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayApplication.class, args);
	}

}
