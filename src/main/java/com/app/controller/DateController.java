package com.app.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/date")
	public String getDisplay(Model model)
	{
		model.addAttribute("dateMsg", "Today date is"+ new Date());
		String name=null;
		name.length();
		return "dateDisplay";
	}
}
