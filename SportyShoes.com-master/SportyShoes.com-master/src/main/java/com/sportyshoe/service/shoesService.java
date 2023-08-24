package com.sportyshoe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoe.entity.shoes;
import com.sportyshoe.repository.shoesRepository;

@Service
public class shoesService {
	
	@Autowired
	private static shoesRepository sRepo;
	
	public void save(shoes S) {
		sRepo.save(S);
	}
	
	public static List<shoes> getAllShoes(){
		return sRepo.findAll();
	}
	
	public shoes getShoesById(int id) {
		return sRepo.findById(id).get();
	}
	public void deleteById(int id) {
		sRepo.deleteById(id);
	}
}