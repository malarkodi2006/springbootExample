package com.malar.orderprocessing.restclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.malar.orderprocessing.entity.Order;
// code checkin with git
public class OrderRestClient {
	
	 static final String URL_ORDERSGET = "http://localhost:8080/inventory.com/api/orders";
	 public static void main(String[] args) {
		
		 
		
		 Order order = new Order();
		order.setCustomerId(33);
		order.setOrderDate("April 23");
		order.setShipDate("xvx");
		order.setToCity("Chicago");
		order.setToState("IL");
		order.setToStreet("Van Dr");
		order.setToZipcode("60504");
		 
		 		
	      RestTemplate restTemplate = new RestTemplate();
	 
	      // Data attached to the request.
	      HttpEntity<Order> requestBody = new HttpEntity<Order>(order);
	 
	      // Send request with POST method.
	      ResponseEntity<Order> result =  restTemplate.postForEntity(URL_ORDERSGET, requestBody, Order.class);

     System.out.println("Status code:" + result.getStatusCode());

     // Code = 200.
     if (result.getStatusCode() == HttpStatus.OK) {
    	 Order o = result.getBody();
         System.out.println("(Client Side) Order Created: "+ o.getOrderId());
     }
	         
	     
	 
	   }
	 
	 }



	 
	  
	 