package io.sandeep.rest.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import org.springframework.stereotype.Service; 
@Service
public class AssignService {
	public List<AssignModel> assign = new ArrayList<>( Arrays.asList(
			new AssignModel("AK","ANCHORAGE","US","99501") 	
			));
	public AssignModel getDetails(String id)
	{
		return	assign.stream().filter(t -> t.getPin().equals(id)).findFirst().get();	
	}

}
