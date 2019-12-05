package com.eecs341.greeklife.ChapterMember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eecs341.greeklife.Chapter.Chapter;
import com.eecs341.greeklife.ChapterHouse.ChapterHouse;
import com.eecs341.greeklife.LivesIn.LivesIn;
import com.eecs341.greeklife.LivesIn.LivesInRepository;
import com.eecs341.greeklife.MemberOf.MemberOf;
import com.eecs341.greeklife.MemberOf.MemberOfRepository;
import com.eecs341.greeklife.NewMemberOf.NewMemberOf;
import com.eecs341.greeklife.NewMemberOf.NewMemberOfRepository;
import com.eecs341.greeklife.ServesAs.ServesAs;
import com.eecs341.greeklife.ServesAs.ServesAsRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/chapterMember") // This means URL's start with /demo (after Application path)
public class ChapterMemberController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private ChapterMemberRepository chapterMemberRepository;

	@Autowired
	private MemberOfRepository memberOfRepository;
	
	@Autowired
	private NewMemberOfRepository newMemberOfRepository;
	
	@Autowired
	private LivesInRepository livesInRepository;
	
	@Autowired
	private ServesAsRepository servesAsRepository;
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewMember (@RequestBody ChapterMember m) {
		chapterMemberRepository.save(m);
		return "Saved";
	}
	
	@PostMapping(path="/addMemberOf") // Map ONLY POST Requests
	public @ResponseBody String addMemberOf (@RequestBody MemberOf m) {
		memberOfRepository.save(m);
		return "Saved";
	}
	
	@PostMapping(path="/addNewMemberOf") // Map ONLY POST Requests
	public @ResponseBody String addNewMemberOf (@RequestBody NewMemberOf m) {
		newMemberOfRepository.save(m);
		return "Saved";
	}
	
	@PostMapping(path="/addLivesIn") // Map ONLY POST Requests
	public @ResponseBody String addNewLivesIn (@RequestBody LivesIn l) {
		livesInRepository.save(l);
		return "Saved";
	}

	@PostMapping(path="/addServesAs") // Map ONLY POST Requests
	public @ResponseBody String addNewServesAs(@RequestBody ServesAs s) {
		servesAsRepository.save(s);
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
	
	@GetMapping(path="/livingLocation/{sid}")
	public @ResponseBody String getLivingLocation(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getLivingLocation(sid);
	}
	
	@GetMapping(path="/execPositions/{sid}")
	public @ResponseBody List<ServesAs> getExecPositions(@PathVariable("sid") Integer sid) {
		return chapterMemberRepository.getExecPositions(sid);
	}
	
	@GetMapping(path="updateName/{sid}/{updatedValue}")
	public @ResponseBody String updateName(@PathVariable("chapterName") Integer sid, @PathVariable("updatedValue") String value) {
		ChapterMember c = chapterMemberRepository.findById(sid).get();
		c.setName(value);
		chapterMemberRepository.save(c);
		return "Member updated";
	}
	
	@GetMapping(path="updateMajor/{sid}/{updatedValue}")
	public @ResponseBody String updateMajor(@PathVariable("chapterName") Integer sid, @PathVariable("updatedValue") String value) {
		ChapterMember c = chapterMemberRepository.findById(sid).get();
		c.setMajor(value);
		chapterMemberRepository.save(c);
		return "Member updated";
	}
	
	@GetMapping(path="updateGpa/{sid}/{updatedValue}")
	public @ResponseBody String updateGpa(@PathVariable("chapterName") Integer sid, @PathVariable("updatedValue") Double value) {
		ChapterMember c = chapterMemberRepository.findById(sid).get();
		c.setGpa(value);
		chapterMemberRepository.save(c);
		return "Member updated";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<ChapterMember> getAll() {
		return chapterMemberRepository.findAll();
	}
}
