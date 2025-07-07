package com.ved.shoppingcard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.ved.shoppingcard.model.Cart;
import com.ved.shoppingcard.model.UserDtls;

import jakarta.transaction.Transactional;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByProductIdAndUserId(Integer productId, Integer userId);

	public Integer countByUserId(Integer userId);

	public List<Cart> findByUserId(Integer userId);
	
	@Transactional
	@Modifying
	public void deleteByUser(UserDtls user);

}
