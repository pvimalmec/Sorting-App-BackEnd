package org.sort.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.sort.bo.SortBO;
import org.sort.persistence.entity.Sort;
import org.sort.service.HistoryService;
import org.sort.service.SortingEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@RestController
public class SortController {

	@Autowired
	HistoryService service;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/randomnumbers")
	public Object getRandomNumbers() {

		Random rand = new Random();

		List<Integer> randomno = new ArrayList<Integer>();

		for (int i = 0; i <= 9; i++) {
			randomno.add(rand.nextInt(50));
		}

		return randomno;
	}

	@PostMapping(path = "/sort", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object getsortedNumber(@RequestBody SortBO sortbo) {

		SortingEngineService engine = new SortingEngineService();

		sortbo = engine.executeSort("MERGE", sortbo);

		service.saveHistory(sortbo);

		return sortbo;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/history")
	public Object retrieveHistory() {

		List<Sort> sortedItems = service.retrieveHistory();

		return sortedItems;

	}

	@GetMapping("/about")
	public String aboutMe() {
		return "JUnit 5 and Spring Boot Example.";
	}
}
