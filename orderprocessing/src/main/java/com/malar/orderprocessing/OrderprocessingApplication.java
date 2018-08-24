package com.malar.orderprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.malar.orderprocessing.controller.OrderController;

@SpringBootApplication
public class OrderprocessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderprocessingApplication.class, args);
	}
}
