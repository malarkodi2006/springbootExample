package com.malar.orderprocessing.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malar.orderprocessing.entity.Order;
import com.malar.orderprocessing.exception.OrderNotFoundException;
import com.malar.orderprocessing.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired(required=true)
	OrderRepository orderRepository;
	
	@Override
	public Order addOrder(Order order) throws OrderNotFoundException {
		if (order.getCustomerId() ==0)
		{
			throw new OrderNotFoundException("Customer id not Found");
		}else
		{
			Order resultOrder = orderRepository.save(order);
			return resultOrder;
		}
		
	}

	@Override
	public Optional<Order> findOrderById(int id) throws OrderNotFoundException {
		return orderRepository.findById(id);
	}

	@Override
	public List<Order> findAllOrders() {
		List<Order> list = new ArrayList<Order>();
		list =  orderRepository.findAll();
return list;
	}

	@Override
	public void deleteOrderById(int id) throws OrderNotFoundException {
		 orderRepository.deleteById(id);
	
		
	}

	@Override
	public List<Order> findAllOrdersByShipDate(String shipDate) {
		List<Order> list = new ArrayList<Order>();
		list =  orderRepository.findAllOrdersByShipDate(shipDate);
		return list;
	}

	@Override
	public List<Order> findAllOrdersByOrderDate(String orderDate) {
		List<Order> list = new ArrayList<Order>();
		list =  orderRepository.findAllOrdersByOrderDate(orderDate);
		return list;
	}

	@Override
	public List<Order> findAllOrdersByCity(String city) {
		List<Order> list = new ArrayList<Order>();
		list =  orderRepository.findAllOrdersByCity(city);
		return list;
	}

	@Override
	public List<Order> findAllOrdersByState(String state) {
		List<Order> list = new ArrayList<Order>();
		list =  orderRepository.findAllOrdersByState(state);
		return list;
	}

}
