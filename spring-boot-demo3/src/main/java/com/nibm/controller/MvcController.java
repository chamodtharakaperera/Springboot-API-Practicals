package com.nibm.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/next")
	public String next(@RequestParam(name="FName",required=true) String fname,
			@RequestParam(name="LName",required=true) String lname
			, Map<String,Object>model 
			)
	{
		model.put("FullName",fname);
		model.put("LastName", lname);
		return "next";
	}
}
