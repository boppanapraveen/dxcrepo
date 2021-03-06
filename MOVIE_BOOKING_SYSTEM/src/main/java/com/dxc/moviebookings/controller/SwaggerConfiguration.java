package com.dxc.moviebookings.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	
	@Bean
	public Docket  docket() {
		
		return  new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();
		
	}
	
	
	private ApiInfo apiInfo() {
		
		return new ApiInfo("MOVIE BOOKING API", "This is MVIE api for crud actions", "v1.1", "serviceurl", "praveen", "available", "na");  		
	}
	
	

}



