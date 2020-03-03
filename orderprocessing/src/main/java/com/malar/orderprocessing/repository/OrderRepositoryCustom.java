package com.malar.orderprocessing.repository;

import java.util.List;
//c ustom repository based on Spring data

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.malar.orderprocessing.entity.Order;
@Repository
public interface OrderRepositoryCustom {

	@Query("SELECT o FROM Order o where o.orderDate = :orderDate") 
    List<Order> findAllOrdersByOrderDate(@Param("orderDate") String orderDate);
	
	@Query("SELECT o FROM Order o where o.shipDate = :shipDate") 
    List<Order> findAllOrdersByShipDate(@Param("shipDate") String shipDate);
	
	@Query("SELECT o FROM Order o where o.toCity = :toCity") 
    List<Order> findAllOrdersByCity(@Param("toCity") String toCity);
	
	@Query("SELECT o FROM Order o where o.toState= :toState") 
    List<Order> findAllOrdersByState(@Param("toState") String toState);
	
	
}
