package com.example.RetailSale;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.batch.core.launch.support.CommandLineJobRunner;

//@SpringBootApplication
public class RetailSaleApplication {

	public static void main(String[] args) throws Exception {

		//SpringApplication.run(RetailSaleApplication.class, args);
		CommandLineJobRunner.main(args);
	}

}
