package com.app.RestApp;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	HashMap <String,String>hm=new HashMap<String,String>();
	
	@GetMapping("/welcome")
	@ResponseBody
	public String printWelcome()
	{
		return "Welcome to Rest.";
	}
	
	@GetMapping("/register")
	public String registerPage()
	{
		return "register.jsp";
	}
	
	@PostMapping("/registervalidate")
	public String registerValidate(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd)
	{
		hm.put(uname, pwd);
		return "login.jsp";
	}
	
	@GetMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@PostMapping("/loginvalidate")
	//@ResponseBody
	public String loginValidate(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd)
	{
		String username,password;
		if(hm.containsKey(uname))
		{
			username=uname;
			password=hm.get(username);
			if(uname.equals(username) && password.equals(pwd))
				return "home.jsp";
			else
				return "loginfail.jsp";
			
		}
		else
		{
			return "loginfail.jsp";
		}
									
		
	}
	
}
