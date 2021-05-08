package com.devesuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.dsvendas.dto.SellerDTO;
import com.devesuperior.dsvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerConctroller {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>>findALl(){
		
		 List<SellerDTO> list =  service.findAll();
		 return ResponseEntity.ok(list);
	}
	
}
