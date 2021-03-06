package com.eecs341.greeklife.Philanthropy;

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

import com.eecs341.greeklife.Chapter.Chapter;
import com.eecs341.greeklife.Hosts.Hosts;
import com.eecs341.greeklife.Hosts.HostsRepository;

@CrossOrigin
@Controller
@RequestMapping(path="/philanthropy")
public class PhilanthropyController {
	@Autowired
	private PhilanthropyRepository philRepository;
	
	@Autowired
	private HostsRepository hostsRepository;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewPhilanthropy (@RequestBody Philanthropy p) {
		
		System.out.println(p.getId());
		philRepository.save(p);
		return "Saved";
	}
	
	@PostMapping(path="/addHosts") // Map ONLY POST Requests
	public @ResponseBody String addNewHosts (@RequestBody Hosts h) {
		System.out.println(h.getId());
		hostsRepository.save(h);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody List<Philanthropy> getAll() {
		return philRepository.findAll();
	}

	@GetMapping(path="/cause/{eventName}/{eventDate}")
	public @ResponseBody String getCause(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getCause(eventName, eventDate);
	}
	
	@GetMapping(path="/partner/{eventName}/{eventDate}")
	public @ResponseBody String getPartner(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getPartner(eventName, eventDate);
	}
	
	@GetMapping(path="/moneyRaised/{eventName}/{eventDate}")
	public @ResponseBody Double getMoneyRaised(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getMoneyRaised(eventName, eventDate);
	}
	
	@GetMapping(path="/ticketPrice/{eventName}/{eventDate}")
	public @ResponseBody Double getTicketPrice(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getTicketPrice(eventName, eventDate);
	}
	
	@GetMapping(path="/totalAttendance/{eventName}/{eventDate}")
	public @ResponseBody Integer getTotalAttendance(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getTotalAttendance(eventName, eventDate);
	}
	
	@GetMapping(path="/budget/{eventName}/{eventDate}")
	public @ResponseBody Double getBudget(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getBudget(eventName, eventDate);
	}
	
	@GetMapping(path="/location/{eventName}/{eventDate}")
	public @ResponseBody String getLocation(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getLocation(eventName, eventDate);
	}
	
	@GetMapping(path="/hostChapters/{eventName}/{eventDate}")
	public @ResponseBody List<String> getHostChapters(@PathVariable("eventName") String eventName, @PathVariable("eventDate") String eventDate) {
		return philRepository.getHostChapters(eventName, eventDate);
	}
}
