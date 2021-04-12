package com.jakebakewell.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	@RequestMapping("/time")
	public String time(Model model) {
		Date currdate = new Date();
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm a");
		String time = timeformat.format(currdate);
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
