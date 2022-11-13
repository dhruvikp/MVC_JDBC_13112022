package com.simplilearn.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.EProduct;
import com.simplilearn.service.EProductService;

@Controller
public class EProductController {
	@Autowired
	private EProductService eProductService;

	// STEP 1: handle request
	@GetMapping("/products")
	public String getEmployees(Model model) {

		// STEP 2: Invoke Service to execute business logic
		Collection<EProduct> products = eProductService.getProducts();

		// STEP 3: Populate model (Adding data on Model)
		model.addAttribute("prodlist", products);

		// STEP 4: Invoke View
		return "prod-list";
	}
}
