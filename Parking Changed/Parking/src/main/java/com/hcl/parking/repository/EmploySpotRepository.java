package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.EmploySpot;

@Repository
public interface EmploySpotRepository extends JpaRepository<EmploySpot, Integer>{

}
