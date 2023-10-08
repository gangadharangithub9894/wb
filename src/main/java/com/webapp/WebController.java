package com.webapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping(path="/msg")
	public String getMessage() {
		return "Hello World";
	}
	
	@RequestMapping(path="/name")
	public String getName() {
		return "Gangadharan";
	}
	
	@GetMapping(path="/wel/{name}")
	public String getWel(@PathVariable String name) {
		return "Welcome"+name;
	}
	
	@GetMapping(path="/getAge/{year}")
	public int getAge(@PathVariable("year") int y) {
		return 2023-y;
		
	}
	
	@GetMapping(path="/oddOrEven/{num}")
	public String oddOrEven(@PathVariable("num") int n) {
		if(n%2==0) {
			return "even";
			
		}
		else {
			return "odd";
		}
	}
	
	@GetMapping(path="/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	
	@GetMapping(path="/check")
	public String check(@RequestParam("username") String name, @RequestParam("password") String pswd) {
		if(name.equals("ganga")&&pswd.equals("12345")) {
			return "Authorised Person";
		}
		else {
			return "Not Authorised Person";
		}
		
	}
	
	@GetMapping(value="/getPen")
	public Pen getPen(@RequestBody Pen pen) {
		return pen;
	}
	@GetMapping(value="/getPens")
	public List<Pen> getPens(@RequestBody List<Pen> pens){
		return pens;
	}
}	


