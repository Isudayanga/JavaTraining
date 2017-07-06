package com.suresh.eventManeger.controlers;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suresh.eventManeger.model.Activity;

@Controller
public class ActivityControler {
	
	@RequestMapping(value="/greeting")
	public String getGreeting(Model model){
		model.addAttribute("msg","Wow Spring You Are Awesome");
		return "welcome";
	}

	@RequestMapping(value="/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("Activity is "+ activity.getActivityName());
		return "redirect:addSubActivity.html";
	}
	
	@RequestMapping(value="/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("Sub Activity is "+ activity.getActivityName());
		return "addActivity";
	}
}
