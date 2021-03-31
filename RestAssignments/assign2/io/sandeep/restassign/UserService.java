package io.sandeep.restassign;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> list = new ArrayList<>();


public String setPass(User u) {
	list.add(new User("yash","1234"));
	boolean a=false;
    for(User t: list) {
    	if(t.equals(u)){
    		a=true;
    		break;
    	}
    }
    if(a) {
    	return "success";
    }
    return "not matched";
}

}