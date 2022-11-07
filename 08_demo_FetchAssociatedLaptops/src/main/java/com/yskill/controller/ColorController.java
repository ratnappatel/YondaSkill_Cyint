package com.yskill.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yskill.entity.Color;
import com.yskill.repository.ColorRepository;
import com.yskill.requests.ColorResponse;

@RestController
public class ColorController {
	
	@Autowired
	private ColorRepository cRepo;
	
	@GetMapping("/colors")
	public List<ColorResponse> getColors () {
		List<Color> list = cRepo.findAll();
		List<ColorResponse> responseList = new ArrayList<>();
		list.forEach(c -> {
			ColorResponse response = new ColorResponse();
			response.setId(c.getId());
			response.setLaptop(c.getLaptop().getName());
			response.setBrand(c.getLaptop().getBrand());
			response.setPrice(c.getLaptop().getPrice());
			response.setColor(c.getColor());
			responseList.add(response);
		});
		return responseList;
	}
}