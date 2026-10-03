package com.customer.demo;

import com.customer.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.customer.demo.repositories.CustomerRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("Achraf").email("achraf@gmail.com").build());
			customerRepository.save(Customer.builder().name("Taha").email("taha@gmail.com").build());
			customerRepository.save(Customer.builder().name("Amine").email("amine@gmail.com").build());
		};
	}

}
