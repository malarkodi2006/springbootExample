/*package com.malar.orderprocessing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.malar.orderprocessing.entity.Order;
import com.malar.orderprocessing.exception.OrderNotFoundException;
import com.malar.orderprocessing.service.OrderService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = OrderService.class, secure = false)
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;

	@Test
	public void addOrderTest() throws OrderNotFoundException {
		Order order = new Order();
		order.setCutomerId(2);
		order.setOrderDate("April 23 2018");
		order.setShipDate("April 24");;
		order.setToCity("Aurora");
		order.setToState("VA");
		order.setToStreet("blurberry");
		order.setToZipcode("60504");
		Order returnOrder = orderService.addOrder(order);
		assertTrue(returnOrder.getOrderId() > 0);
		assertEquals(2, returnOrder.getCutomerId());
		assertEquals("April 23 2018", returnOrder.getOrderDate());
		assertEquals("April 24", returnOrder.getShipDate());
		assertEquals("Aurora", returnOrder.getToCity());
		assertEquals("VA", returnOrder.getToState());
		assertEquals("blurberry", returnOrder.getToStreet());
		assertEquals("60504", returnOrder.getToZipcode());
		

	}

	@Test(expected=OrderNotFoundException.class)
	public void addOrderNegativeTest() throws OrderNotFoundException {
		Order order = new Order();
		order.setCutomerId(0);
		order.setOrderDate("April 23 2018");
		order.setShipDate("April 24");;
		order.setToCity("Aurora");
		order.setToState("VA");
		order.setToStreet("blurberry");
		order.setToZipcode("60504");
		Order returnOrder = orderService.addOrder(order);
	}

	@Test
	public void findOrderByIdTest() {

	}

	@Test
	public void findOrderByIdTestNegative() {

	}

	@Test
	public void findAllOrders() {
		

	}

	@Test
	public void findAllOrdersNegative() {

	}

	@Test
	public void deleteOrderByIdTest() {

	}

	@Test
	public void deleteOrderByIdTestNegative() {

	}

	@Test
	public void findAllOrdersByShipDateTest() {

	}

	@Test
	public void findAllOrdersByCity(String city) {

	}

	@Test
	public void findAllOrdersByState(String state) {

	}
}
*/