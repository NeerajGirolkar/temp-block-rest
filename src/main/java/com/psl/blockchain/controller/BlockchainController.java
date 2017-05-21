package com.psl.blockchain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.psl.blockchain.service.BlockchainService;
import com.psl.blockchain.to.Subsidy;

@RestController
public class BlockchainController {
	@Autowired
	private BlockchainService blockchainService;

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" }, path = "/subsidies")
	public List<Subsidy> getAllSubsidies() {
		return blockchainService.getAllSubsidies();
	}

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" }, path = "/subsidies/{subsidyId}")
	public Subsidy getSubsidy(@PathVariable String subsidyId) {
		return blockchainService.getSubsidy(subsidyId);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/subsidies")
	public void addSubsidy(@RequestBody Subsidy subsidy) {
		blockchainService.addSubsidy(subsidy);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/subsidies/{id}")
	public void updateSubsidy(@RequestBody Subsidy subsidy, @PathVariable String id) {
		blockchainService.updateSubsidy(subsidy, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/subsidies/{id}")
	public void deleteSubsidy(@PathVariable String id) {
		blockchainService.deleteSubsidy(id);
	}
}
