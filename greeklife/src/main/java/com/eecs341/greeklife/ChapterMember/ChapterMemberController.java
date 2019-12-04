package com.eecs341.greeklife.ChapterMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/chapterMember") // This means URL's start with /demo (after Application path)
public class ChapterMemberController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private ChapterMemberRepository chapterMemberRepository;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewChapter (@RequestBody ChapterMember m) {
		chapterMemberRepository.save(m);
		return "Saved";
	}

	@GetMapping(path="/name/{sid}")
	public @ResponseBody String getName(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getName(sid);
	}

	@GetMapping(path="/year/{sid}")
	public @ResponseBody Standing getYear(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getYear(sid);
	}

	@GetMapping(path="/joinDate/{sid}")
	public @ResponseBody String getJoinDate(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getJoinDate(sid);
	}

	@GetMapping(path="/badgeNumber/{sid}")
	public @ResponseBody Integer getNationalDesignation(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getBadgeNumber(sid);
	}

	@GetMapping(path="/major/{sid}")
	public @ResponseBody String getMajor(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getMajor(sid);
	}
	
	@GetMapping(path="/gpa/{sid}")
	public @ResponseBody Double getGPA(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getGPA(sid);
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<ChapterMember> getAll() {
		return chapterMemberRepository.findAll();
	}


}