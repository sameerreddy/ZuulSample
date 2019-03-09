package com.sameer.zuul.example.gateway.zuulStudentGateway;

import com.sameer.zuul.example.gateway.zuulStudentGateway.filters.ErrorFilter;
import com.sameer.zuul.example.gateway.zuulStudentGateway.filters.PostFilter;
import com.sameer.zuul.example.gateway.zuulStudentGateway.filters.PreFilter;
import com.sameer.zuul.example.gateway.zuulStudentGateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulStudentGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulStudentGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
