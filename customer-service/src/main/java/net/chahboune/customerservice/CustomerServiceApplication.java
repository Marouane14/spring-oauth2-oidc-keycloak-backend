package net.chahboune.customerservice;

import net.chahboune.customerservice.entities.Customer;
import net.chahboune.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner start(CustomerRepository customerRepository){
		return args ->{
			customerRepository.save(Customer.builder()
							.name("marouane")
							.email("marouane@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("manal")
							.email("manal@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("ilyass")
							.email("ilyass@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("fadwa")
							.email("fadwa@gmail.com")
					.build());
		};
	}
}
