package com.compositepk.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compositepk.api.Entity.CompositePkEntity;
import com.compositepk.api.Repository.CompositePkRepository;

@Service
public class CompositePkService {

	@Autowired
	private CompositePkRepository repository;

	public CompositePkEntity saveData(CompositePkEntity pkEntity) {

		return repository.save(pkEntity);
	}

}
