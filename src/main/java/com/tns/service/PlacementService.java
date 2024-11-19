package com.tns.service;


import java.util.List;
import java.util.Optional;
import com.tns.entity.Placement;
public interface PlacementService{
	
	//find a user based on id
	public Optional<Placement> findPlacement(String id) ;
	
	//show all candidates details
	public List<Placement> allPlacements();
    
    // add a candidate who got placed
	public String upsertCandiate(Placement candidate) ;
	
	//add a list of candidate details who got place
	public List<Placement> saveCandidates(List<Placement> candidates);
	
	//delete candidate details
	public String deleteCandidate(String id );
	
	
}
