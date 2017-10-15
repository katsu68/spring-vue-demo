package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class ProductsController {

	@GetMapping("/api/products")
	public List<Product> productList() {
		return Arrays.asList(new Product("foo"), new Product("bar"));
	}
}