package springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	@ResponseBody
	String helloSpringBoot ()
	{
		return "Hello World Spring Boot...";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	String Welcome ()
	{
		return "Welcome Spring Boot...";
	}
	@RequestMapping("/udeesha")
	@ResponseBody
	String contact ()
	{
		return "udeesha's home page";
	}
	
	@RequestMapping("/home")
	@ResponseBody
	String home ()
	{
		return "This is home page...";
	}
}
