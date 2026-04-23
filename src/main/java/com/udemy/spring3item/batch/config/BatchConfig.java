package com.udemy.spring3item.batch.config;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {

	private final JobLauncher joblauncher;
	private final JobRepository jobRepository;
	private final PlatformTransactionManager platformTransactionManager;
	
	public BatchConfig(JobLauncher joblauncher, JobRepository jobRepository,
			
			PlatformTransactionManager platformTransactionManager) {
		this.joblauncher = joblauncher;
		this.jobRepository = jobRepository;
		this.platformTransactionManager = platformTransactionManager;
	}
}
