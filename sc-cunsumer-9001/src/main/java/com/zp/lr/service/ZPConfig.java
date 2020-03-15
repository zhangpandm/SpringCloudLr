package com.zp.lr.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ZPConfig {
	
	@Bean
	@LoadBalanced//ribbon 负载均衡器
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
    // 配置切换负载均衡规则算法
	@Bean
	public IRule getIRule(){
		return new  RandomRule();
	}
}
 
	
