package pl.jgreen.inception.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.jgreen.inception.service.UserService;

@RestController
@RequestMapping(value="/")
public class HelloController {
	
	@Autowired
	UserService UserService;
	
	@RequestMapping("/getUser")
	public String hello(@RequestParam("id") long id) {
		return UserService.getUserName(id);
	}
}
