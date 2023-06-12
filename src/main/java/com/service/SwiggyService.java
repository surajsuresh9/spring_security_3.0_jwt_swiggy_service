package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.RestaurantServiceClient;
import com.dto.OrderResponseDTO;

@Service
public class SwiggyService {

	@Autowired
	private RestaurantServiceClient restaurantServiceClient;

	public String greeting() {
		return "Welcome to Swiggy App Service";
	}

	public OrderResponseDTO checkOrderStatus(String orderId) {
		return restaurantServiceClient.fetchOrderStatus(orderId);
	}

}
