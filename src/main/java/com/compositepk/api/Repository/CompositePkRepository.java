package com.compositepk.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compositepk.api.Entity.CompositePkEntity;
import com.compositepk.api.Entity.CompositePkId;

@Repository
public interface CompositePkRepository extends JpaRepository<CompositePkEntity, CompositePkId> {

}
