package com.tns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tns.entity.Placement;
import com.tns.repository.PlacementRepo;
@Service
public class PlacementServiceImpl implements PlacementService{
	private PlacementRepo placementRepo;
	public PlacementServiceImpl(PlacementRepo pr) {
		this.placementRepo=pr;
	}
	@Override
	public Optional<Placement> findPlacement(String id) {
		return placementRepo.findById(id);
	}
	
	@Override
	public List<Placement> allPlacements() {
		return placementRepo.findAll();
	}
	
	@Override
	public List<Placement> saveCandidates(List<Placement> candidates) {
	
		return placementRepo.saveAll(candidates);
	}

	@Override
	public String upsertCandiate(Placement candidate) {
		if(placementRepo.findById(candidate.getid())==null) {
			placementRepo.save(candidate);
			return "placement details saved";
		}
		 placementRepo.save(candidate);
		 return "Placement details updated Succesully";
	}

	@Override
	public String deleteCandidate(String id) {
		Optional<Placement> byId = placementRepo.findById(id);
		if(byId.isEmpty()) {
			return "Placement details are not fount";
		}
		placementRepo.deleteById(id);
		return "Successfully Placement details are deleted";
	}

}
