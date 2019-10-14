package com.nagarro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nagarro.services.EmpMangService;
import com.nagarro.services.SignService;

@Configuration
public class AppConfigService {

	@Bean
	public SignService getSignService() {
		return new SignService();
	}

	@Bean
	public EmpMangService getEmpMangService() {
		return new EmpMangService();
	}
	
}
