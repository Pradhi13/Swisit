package com.stackroute.swisit.searchservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.swisit.domain.SwisitBean;
import com.stackroute.swisit.repository.SearchRepository;


@Service
public class SearchService implements SearchServiceInterface {
	
	@Autowired
	private SearchRepository searchRepository;

	@Override
	public List<SwisitBean> getAll() {
	
		return searchRepository.findAll();
	}

	@Override
	public SwisitBean save(SwisitBean obj) {
		
		return searchRepository.save(obj);
	}
	


}
