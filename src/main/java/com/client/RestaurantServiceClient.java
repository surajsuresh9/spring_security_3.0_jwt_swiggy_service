package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.dto.OrderResponseDTO;

@Component
public class RestaurantServiceClient {

	@Autowired
	private RestTemplate restTemplate;

	public OrderResponseDTO fetchOrderStatus(String orderId) {
		return restTemplate.getForObject("http://localhost:8083/restaurant/orders/status/" + orderId,
				OrderResponseDTO.class);
	}
}
