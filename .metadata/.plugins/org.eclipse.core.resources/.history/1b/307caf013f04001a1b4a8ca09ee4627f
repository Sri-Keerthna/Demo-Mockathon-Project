package com.hcl.trade.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.trade.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {

	List<Cart> findByUserId(Integer userId);
}
