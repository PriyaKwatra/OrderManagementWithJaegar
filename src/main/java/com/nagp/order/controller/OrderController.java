package com.nagp.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.order.core.OrderHandler;
import com.nagp.order.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	OrderHandler orderHandler;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

	@GetMapping(value = "/{userId}")
	List<Order> getOrdersByUserId(@PathVariable(name = "userId") String userId) {
		return orderHandler.getOrdersByUserId(userId);
	}

}
