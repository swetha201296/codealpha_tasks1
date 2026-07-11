package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Cart;
import com.ecommerce.ecommerce.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
}