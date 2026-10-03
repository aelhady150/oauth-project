package com.inventory.investory_service;

import com.inventory.investory_service.Repositories.ProductRepository;
import com.inventory.investory_service.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InvestoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
							.id(UUID.randomUUID().toString())
							.name("computer")
							.quantity(12)
							.price(4500)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("imprimante")
					.quantity(8)
					.price(1200)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("monitor")
					.quantity(19)
					.price(5000)
					.build());
		};
	}
}
