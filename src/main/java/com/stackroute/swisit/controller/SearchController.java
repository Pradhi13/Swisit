package com.stackroute.swisit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.swisit.domain.SwisitBean;
import com.stackroute.swisit.repository.SearchRepository;
import com.stackroute.swisit.searchservice.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public SwisitBean save(SwisitBean sb)
	{
		return searchService.save(sb);
	}
	
	
}
