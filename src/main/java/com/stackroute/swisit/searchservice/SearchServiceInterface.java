package com.stackroute.swisit.searchservice;

import java.util.List;

import com.stackroute.swisit.domain.SwisitBean;

public interface SearchServiceInterface {
	
	public List<SwisitBean> getAll();
	public SwisitBean save(SwisitBean obj);

}
