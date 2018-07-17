package com.kpn.killbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class KillbillApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KillbillApiGatewayApplication.class, args);
	}
}
