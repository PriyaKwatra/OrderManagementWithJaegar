package com.nagp.order.persistence.inmemory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nagp.order.entities.Order;

@Repository
public class OrderInMemoryRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderInMemoryRepository.class);
	protected final Map<String, List<Order>> orders = new HashMap<>();

	public OrderInMemoryRepository() {
		Order order1 = new Order("1", 250.0, Date.from(Instant.now()));
		Order order2 = new Order("2", 450.0, Date.from(Instant.now()));
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orders.put("1", orderList);
	}

	public List<Order> getOrdersUserId(String userId) {
		return orders.get(userId);
	}

}
