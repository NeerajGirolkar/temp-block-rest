package com.psl.blockchain.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.psl.blockchain")
@EnableJpaRepositories(basePackages = "com.psl.blockchain.repository")
@EntityScan(basePackages = "com.psl.blockchain.to")
public class BlockchainRestApplication {
	public static void main(String[] args){
		SpringApplication.run(BlockchainRestApplication.class, args);
	}	
}