package com.eecs341.greeklife.ChapterHouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/chapterHouse")
public class ChapterHouseController {
	@Autowired
	private ChapterHouseRepository houseRepository;

	@PostMapping(path="/add")
	public @ResponseBody String addNewChapter (@RequestBody ChapterHouse c) {
		houseRepository.save(c);
		return "Saved";
	}

	@GetMapping(path="/address/{chapterName}")
	public @ResponseBody String getGoverningBody(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getAddress(chapterName);
	}

	@GetMapping(path="/campusLocation/{chapterName}")
	public @ResponseBody String getCampusLocation(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getCampusLocation(chapterName);
	}

	@GetMapping(path="/maxOccupancy/{chapterName}")
	public @ResponseBody Integer getMaxOccupancy(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getMaxOccupancy(chapterName);
	}

	@GetMapping(path="/mealPlanService/{chapterName}")
	public @ResponseBody String getNationalDesignation(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getMealPlanService(chapterName);
	}

	@GetMapping(path="/summer/{chapterName}")
	public @ResponseBody boolean isAvailableInSummer(@PathVariable("chapterName") String chapterName) {
		return houseRepository.isAvailableInSummer(chapterName);
	}

	@GetMapping(path="/all")
	public @ResponseBody List<ChapterHouse> getAllUsers() {
		return houseRepository.findAll();
	}
}
