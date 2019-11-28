package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.RequestSpot;

@Repository
public interface RequestSpotRepository extends JpaRepository<RequestSpot, Integer>{

}
