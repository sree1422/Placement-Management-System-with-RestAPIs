package com.tns.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Placement;

public interface PlacementRepo extends JpaRepository<Placement, Serializable>{

}
