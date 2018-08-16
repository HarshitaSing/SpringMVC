package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/adding")      //same name as given in form action tag should be used
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) 
	{
		
		int a = Integer.parseInt(request.getParameter("firstname"));
		int b = Integer.parseInt(request.getParameter("lastname"));
		
		int sum = a+b;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("Result", sum);
		
		return mv;
    }
}
