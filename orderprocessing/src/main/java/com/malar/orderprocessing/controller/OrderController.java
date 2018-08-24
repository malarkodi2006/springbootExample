package com.malar.orderprocessing.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.malar.orderprocessing.entity.Order;
import com.malar.orderprocessing.exception.OrderNotFoundException;
import com.malar.orderprocessing.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST ,value = "/orders", produces = {MediaType.APPLICATION_JSON_VALUE})
	//@ResponseBody
	public Order addOrder(@Valid @RequestBody Order order) throws OrderNotFoundException
	{
		return orderService.addOrder(order);
	}
	@RequestMapping(method = RequestMethod.GET , value ="/orders/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Optional<Order> findOrderById(@PathVariable("id") int id) throws OrderNotFoundException
	{
		return (Optional<Order>) orderService.findOrderById(id);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/orders/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public void deleteOrderById(@PathVariable("id") int id) throws OrderNotFoundException
	{
		orderService.deleteOrderById(id);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/orders", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Order> findAllOrders(@RequestParam(name = "orderDate" ,required = false) String orderDate,@RequestParam(name = "shipDate" ,required = false) String shipDate,@RequestParam(name = "city" ,required = false) String city,@RequestParam(name = "state" ,required = false) String state)throws OrderNotFoundException
	{
		if (orderDate != null)
		{
			return orderService.findAllOrdersByOrderDate(orderDate);
		
		}else if (shipDate != null)
		{
			return orderService.findAllOrdersByShipDate(shipDate);
		}
		else
			if(city != null)
			{
				return orderService.findAllOrdersByCity(city);
			}else
				if (state != null)
				{
					return orderService.findAllOrdersByState(state);
				}
				else
					
		{
			return orderService.findAllOrders();
			
		}
	}
	
}
