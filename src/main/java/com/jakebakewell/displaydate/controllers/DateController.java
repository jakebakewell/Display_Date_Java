package com.jakebakewell.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/date")
	public String date(Model model) {
		Date currdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEEEEEE, dd MMMMMMMMM, YYYY");
		String date = dateformat.format(currdate);
		model.addAttribute("date", date);
		return "date.jsp";
	}
}
