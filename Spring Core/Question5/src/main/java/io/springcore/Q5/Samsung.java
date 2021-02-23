package io.springcore.Q5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Samsung {
      //1.A mobile has a Processor(Processors we are considering are Snapdragon and Mediatek)
	
	@Inject
	@Qualifier("snapdragon")
	Processors processors;
	public void config() {
		System.out.println("8gb ram, 128gb memory");
		processors.process();
	}
	
}
