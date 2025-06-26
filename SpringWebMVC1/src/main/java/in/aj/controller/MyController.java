package in.aj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController  {
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello.jsp");
		return mv;
		
	}

}
