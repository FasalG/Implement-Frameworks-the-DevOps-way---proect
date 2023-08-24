package com.sportyshoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.sportyshoe.entity.shoes;
import com.sportyshoe.entity.myShoesList;
import com.sportyshoe.service.shoesService;
import com.sportyshoe.service.myShoesListService;

import java.util.*;

@Controller
public class shoesController {
	
	@Autowired
	private shoesService service;
	
	@Autowired
	private myShoesListService myShoesService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/shoes_register")
	public String shoesRegister() {
		return "shoesRegister";
	}
	
	@GetMapping("/available_shoes")
	public ModelAndView getAllShoes() {
		List<shoes>list=service.getAllShoes();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("shoesList");
//		m.addObject("shoes",list);
		return new ModelAndView("shoesList","shoes",list);
	}
	
	@PostMapping("/save")
	public String addshoes(@ModelAttribute shoes s) {
		service.save(s);
		return "redirect:/available_shoes";
	}
	@GetMapping("/my_shoes")
	public String getMyShoes(Model model)
	{
		List<shoes>list=shoesService.getAllShoes();
		model.addAttribute("shoes",list);
		return "myShoess";
	}
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		shoes s=service.getShoesById(id);
		myShoesList mls=new myShoesList(s.getId(),s.getName(),s.getAuthor(),s.getPrice());
		myShoesListService.saveMyShoes(mls);
		return "redirect:/my_shoes";
	}
	
	@RequestMapping("/editShoes/{id}")
	public String editBook(@PathVariable("id") int id,Model model) {
		shoes b=service.getShoesById(id);
		model.addAttribute("book",b);
		return "bookEdit";
	}
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/available_books";
	}
	
}