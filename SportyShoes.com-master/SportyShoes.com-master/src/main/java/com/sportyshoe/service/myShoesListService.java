package com.sportyshoe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoe.entity.myShoesList;
import com.sportyshoe.repository.myShoesRepository;

@Service
public class myShoesListService {
	
	@Autowired
	private myShoesRepository myshoes;
	
	public void saveMyShoes(myShoesList shoes) {
		myshoes.save(shoes);
	}
	
	public List<myShoesList> getAllMyShoes(){
		return myshoes.findAll();
	}
	
	public void deleteById(int id) {
		myshoes.deleteById(id);
	}
}