package com.portfolio;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	@Bean
	public CorsFilter corsFilter() {
	CorsConfiguration corsConfiguration = new CorsConfiguration();
	corsConfiguration.setAllowCredentials(true);
	corsConfiguration.setAllowedOrigins(Arrays.asList("https://portfolio-53d21.web.app"));
	corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
	"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
	"Access-Control-Requested-Method", "Access-Control-Allow-Credentials"));
	corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Control-Type", "Accept", "Authorization",
	"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
	corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE","OPTIONS"));
	UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	return new CorsFilter ( urlBasedCorsConfigurationSource);
	}

}
