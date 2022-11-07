package com.yskill.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yskill.entity.Color;
import com.yskill.entity.Laptop;
import com.yskill.repository.ColorRepository;
import com.yskill.repository.LaptopRepository;
import com.yskill.requests.LaptopRequest;
import com.yskill.requests.LaptopResponse;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopRepository lRepo;
	
	@Autowired
	private ColorRepository cRepo;
	
	@PostMapping("/laptops/save")
	public ResponseEntity<Laptop> saveData (@RequestBody LaptopRequest req) {
		
		Laptop laptop = new Laptop(req);
		laptop = lRepo.save(laptop);
		
		for (String s : req.getColors()) {
			Color c = new Color();
			c.setColor(s);
			c.setLaptop(laptop);
			cRepo.save(c);
		}
		return new ResponseEntity<>(laptop, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/laptops")
	public List<LaptopResponse> getData () {
		List<Laptop> list = lRepo.findAll();
		List<LaptopResponse> responseList = new ArrayList<>();
		
		list.forEach(l -> {
			LaptopResponse response = new LaptopResponse();
			response.setId(l.getId());
			response.setLaptop(l.getName());
			response.setBrand(l.getBrand());
			response.setPrice(l.getPrice());
			List<String> colors = new ArrayList<>();
			for (Color color : l.getColors()) {
				colors.add(color.getColor());
			}
			response.setColors(colors);
			responseList.add(response);
		});
		return responseList;
	}
}