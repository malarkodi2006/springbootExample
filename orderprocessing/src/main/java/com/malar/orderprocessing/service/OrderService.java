package com.malar.orderprocessing.service;
import java.util.List;
import com.malar.orderprocessing.entity.Order;
import com.malar.orderprocessing.exception.OrderNotFoundException;
public interface OrderService {
	public Order addOrder(Order order) throws OrderNotFoundException;
	public Object findOrderById(int id) throws OrderNotFoundException;
	public List<Order> findAllOrders() ;
	public void deleteOrderById(int id) throws OrderNotFoundException;
	
	public List<Order> findAllOrdersByShipDate(String shipDate) ;
	public List<Order> findAllOrdersByOrderDate(String orderDate) ;
	public List<Order> findAllOrdersByCity(String city) ;
	public List<Order> findAllOrdersByState(String state) ;
	
}
