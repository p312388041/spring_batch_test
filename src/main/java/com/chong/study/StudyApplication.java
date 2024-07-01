package com.chong.study;

import java.util.Collection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.batch.core.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan({ "com.chong.study.mapper" })
@SpringBootApplication
// @RestController
public class StudyApplication implements CommandLineRunner {
	@Autowired
	private Collection<Job> jobs;
	@Autowired
	private ConfigurableApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("--------" + string); 
		}
 
		for (String string : names) {
			System.out.println("--------" + string);
		}
		System.out.println("-----" + jobs);
	}
}
