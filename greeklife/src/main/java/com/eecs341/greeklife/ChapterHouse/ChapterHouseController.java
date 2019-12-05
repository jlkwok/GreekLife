package com.eecs341.greeklife.ChapterHouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eecs341.greeklife.ChapterMember.ChapterMember;
import com.eecs341.greeklife.HouseOf.HouseOf;
import com.eecs341.greeklife.HouseOf.HouseOfRepository;

@CrossOrigin
@Controller
@RequestMapping(path="/chapterHouse")
public class ChapterHouseController {
	@Autowired
	private ChapterHouseRepository houseRepository;
	
	@Autowired
	private HouseOfRepository houseOfRepository;


	@PostMapping(path="/add")
	public @ResponseBody String addNewChapterHouse (@RequestBody ChapterHouse c) {
		houseRepository.save(c);
		return "Saved";
	}

	@GetMapping(path="/address/{chapterName}")
	public @ResponseBody String getAddress(@PathVariable("chapterName") String chapterName) {
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
	public @ResponseBody String getMealPlanService(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getMealPlanService(chapterName);
	}

	@GetMapping(path="/summer/{chapterName}")
	public @ResponseBody boolean isAvailableInSummer(@PathVariable("chapterName") String chapterName) {
		return houseRepository.isAvailableInSummer(chapterName);
	}
	
	@GetMapping(path="/membersIn/{chapterName}")
	public @ResponseBody List<String> getMembersLivingIn(@PathVariable("chapterName") String chapterName) {
		return houseRepository.getMembersLivingIn(chapterName);
	}

	@GetMapping(path="/all")
	public @ResponseBody List<ChapterHouse> getAllUsers() {
		return houseRepository.findAll();
	}
	
	@PostMapping(path="/addHouseOf") // Map ONLY POST Requests
	public @ResponseBody String addNewHouseOf (@RequestBody HouseOf h) {
		houseOfRepository.save(h);
		return "Saved";
	}
}
