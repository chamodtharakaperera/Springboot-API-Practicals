package com.nibm.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@RequestMapping("/index")
	public String index( )
	{
		//model.put("uName",uname);
		return "index";
	}
	@RequestMapping("/LoginRe")
	public ModelAndView LoginRe(@RequestParam(name="uname",required=true) String uname,
			@RequestParam(name="pass",required=true) String pass, Model model)
	{
		if("admin".equals(uname) && "123".equals(pass))
		{
			
			model.addAttribute("Message","Hello welcome " + uname);
			return new ModelAndView("Login");
			
		}
		else
		{
			model.addAttribute("Message","Incorrect user name or password");
		return new ModelAndView("LoginFail");
			
			
		}
	}
}
