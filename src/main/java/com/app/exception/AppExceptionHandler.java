package com.app.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String nullPointerExce(Model model)
	{
	
		model.addAttribute("err", "some problem accured due to null pointer exception");
		
		
		return "error";
	}

}
