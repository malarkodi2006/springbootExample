package com.malar.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.malar.orderprocessing.entity.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>,JpaRepository<Order,Integer>,OrderRepositoryCustom{
	int a;
	String name="malar";
	

}
