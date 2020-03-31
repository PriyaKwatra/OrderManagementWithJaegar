package com.nagp.order.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.nagp.order.entities.Order;
import com.nagp.order.persistence.inmemory.OrderInMemoryRepository;

@Service
public class OrderHandler {

	@Autowired
	OrderInMemoryRepository orderRepository;

	public List<Order> getOrdersByUserId(@NonNull String userId) {
		return orderRepository.getOrdersUserId(userId);

	}

}
