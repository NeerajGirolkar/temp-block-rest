package com.psl.blockchain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.blockchain.repository.SubsidyRepository;
import com.psl.blockchain.to.Subsidy;

@Service
public class BlockchainService {
	
	@Autowired
	private SubsidyRepository subsidyRepository;
	
	public List<Subsidy> getAllSubsidies(){
		List<Subsidy> subsidies = new ArrayList<Subsidy>();
		subsidyRepository.findAll().forEach(subsidies::add);
		return subsidies;
	}
	
	public Subsidy getSubsidy(String id){
		return subsidyRepository.findOne(Integer.valueOf(id));	
	}
	
	public void addSubsidy(Subsidy subsidy) {
		subsidyRepository.save(subsidy);
	}
	
	public void updateSubsidy(Subsidy subsidy, String id) {
//		subsidyRepository.delete(Integer.valueOf(id));
//		subsidy.setSubsidyId(Integer.valueOf(id));
		subsidy.setSubsidyId(Integer.valueOf(id));
		subsidyRepository.save(subsidy);
	}
	
	public void deleteSubsidy(String id) {
		subsidyRepository.delete(Integer.valueOf(id));
	}
}
