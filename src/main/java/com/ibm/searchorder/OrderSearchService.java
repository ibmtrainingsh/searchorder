package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderSearchService {
	@Autowired
	OrderSearchRepository orderSearchRepository;

	public List<Order> getOrders() {
		return orderSearchRepository.findAll();
	}
	/**
	 * method to return zero matching order
	 * @param orderId
	 * @return
	 */

	public Optional<Order> getOrder(String orderId) {
		return orderSearchRepository.findById(orderId);
	}

}
