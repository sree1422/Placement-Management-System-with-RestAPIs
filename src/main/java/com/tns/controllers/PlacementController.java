package com.tns.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import com.tns.entity.Placement;

import com.tns.service.PlacementService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
public class PlacementController {
	@Autowired
	private PlacementService placementService;

	@PostMapping("/addPlacement")
	public ResponseEntity<String> addPlacement(@RequestBody Placement placement) {
		String status = placementService.upsertCandiate(placement);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	@GetMapping("/allPlacements")
	public ResponseEntity<List<Placement>> getAllPlacements() {
		List<Placement> allPlacements = placementService.allPlacements();
		return new ResponseEntity<>(allPlacements,HttpStatus.OK);
	}
	@GetMapping("/findplacement/{id}")
	public ResponseEntity<Optional<Placement>> getCandidate(@PathVariable("id") String param) {
		Optional<Placement> placement = placementService.findPlacement(param);
		//Placement placement=(Placement)placement;
		return new ResponseEntity<>(placement, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePlacement/{id}")
	public ResponseEntity<String> deletePlacement(@PathVariable("id") String id){
		String deleteCandidate = placementService.deleteCandidate(id);
		return new ResponseEntity<>(deleteCandidate,HttpStatus.OK);
	}
	
	
	

}
