package com.asrevo.cacheerror;

import org.cache2k.extra.spring.SpringCache2kCacheManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class CacheErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheErrorApplication.class, args);
	}

	@Bean
	public CacheManager cacheManager() {
		return new SpringCache2kCacheManager();
	}
}
