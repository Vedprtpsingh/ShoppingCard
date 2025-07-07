package com.ved.shoppingcard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ved.shoppingcard.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

	List<ProductOrder> findByUserId(Integer userId);

	ProductOrder findByOrderId(String orderId);

}
