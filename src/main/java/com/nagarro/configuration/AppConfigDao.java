package com.nagarro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nagarro.dao.HRManagerDao;
import com.nagarro.daoImp.HRManagerDaoImp;

@Configuration
public class AppConfigDao {

	@Bean
	public HRManagerDao getHRManager() {
		return new HRManagerDaoImp();
	}
}
