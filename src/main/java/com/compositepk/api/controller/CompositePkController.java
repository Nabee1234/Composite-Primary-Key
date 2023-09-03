package com.compositepk.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compositepk.api.Entity.CompositePkEntity;
import com.compositepk.api.Service.CompositePkService;

@RestController
@RequestMapping("/composite")
public class CompositePkController {

	@Autowired
	private CompositePkService pkService;
	
	@PostMapping
	public CompositePkEntity saveData( @RequestBody CompositePkEntity pkEntity) {
		return pkService.saveData(pkEntity);
	}
}
