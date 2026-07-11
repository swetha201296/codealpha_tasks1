package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.ecommerce.entity.Cart;
import com.ecommerce.ecommerce.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCartItems() {
        return cartService.getAllCartItems();
    }

    @PostMapping
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }
}