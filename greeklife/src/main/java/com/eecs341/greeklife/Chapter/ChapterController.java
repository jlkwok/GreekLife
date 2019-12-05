package com.eecs341.greeklife.Chapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller // This means that this class is a Controller
@RequestMapping(path="/chapter") // This means URL's start with /demo (after Application path)
public class ChapterController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private ChapterRepository chapterRepository;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewChapter (@RequestBody Chapter c) {
		c.setChapterName(c.getChapterName());
		chapterRepository.save(c);
		return "Saved";
	}

	@GetMapping(path="/{chapterName}")
	public @ResponseBody Optional<Chapter> findById(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.findById(chapterName);
	}
	
	@GetMapping(path="/governingBody/{chapterName}")
	public @ResponseBody GoverningBody getGoverningBody(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getGoverningBody(chapterName);
	}

	@GetMapping(path="/localFoundingDate/{chapterName}")
	public @ResponseBody String getLocalFoundingDate(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getLocalFoundingDate(chapterName);
	}

	@GetMapping(path="/nationalFoundingDate/{chapterName}")
	public @ResponseBody String getNationalFoundingDate(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getNationalFoundingDate(chapterName);
	}

	@GetMapping(path="/nationalDesignation/{chapterName}")
	public @ResponseBody Double getNationalDesignation(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getNationalDesignation(chapterName);
	}

	@GetMapping(path="/dues/{chapterName}")
	public @ResponseBody Double getDues(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getDues(chapterName);
	}
	
	@GetMapping(path="/avgGpa/{chapterName}")
	public @ResponseBody Double getAvgGpa(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getAverageGpa(chapterName);
	}
	
	@GetMapping(path="/memberCount/{chapterName}")
	public @ResponseBody Integer getMemberCount(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getMemberCount(chapterName);
	}
	
	@GetMapping(path="/members/{chapterName}")
	public @ResponseBody List<String> getMembers(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getMembers(chapterName);
	}

	@GetMapping(path="/philanthropy/{chapterName}")
	public @ResponseBody List<String> getPhilanthropy(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getPhilanthropy(chapterName);
	}
	
	@GetMapping(path="/house/{chapterName}")
	public @ResponseBody String getHouse(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getHouse(chapterName);
	}
	
	@GetMapping(path="/exec/{chapterName}")
	public @ResponseBody List<String> getExec(@PathVariable("chapterName") String chapterName) {
		return chapterRepository.getExecBoard(chapterName);
	}
	
	@GetMapping(path="/chaptersWithMinGpa/{gpa}")
	public @ResponseBody List<String> getChaptersWithMinGpa(@PathVariable("gpa") Double gpa) {
		return chapterRepository.getChaptersWithMinGpa(gpa);
	}
	
	@GetMapping(path="/chaptersWithAvgGpa/{gpa}")
	public @ResponseBody List<String> getChaptersWithAvgGpa(@PathVariable("gpa") Double gpa) {
		return chapterRepository.getChaptersWithAverageGpa(gpa);
	}
	
	@GetMapping(path="/chaptersWithAllInHouse")
	public @ResponseBody List<String> getChaptersWithAllInHouse() {
		return chapterRepository.getChaptersWithAllMembersInHouse();
	}
	
	@GetMapping(path="updateDues/{chapterName}/{updatedValue}")
	public @ResponseBody String updateDues(@PathVariable("chapterName") String chapterName, @PathVariable("updatedValue") double value) {
		Chapter c = chapterRepository.findById(chapterName).get();
		c.setDues(value);
		chapterRepository.save(c);
		return "Chapter updated";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Chapter> getAll() {
		// This returns a JSON or XML with the users
		return chapterRepository.findAll();
	}
}
