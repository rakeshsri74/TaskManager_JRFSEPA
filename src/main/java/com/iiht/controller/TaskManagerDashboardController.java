package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.TaskManagerDashboard;
import com.iiht.service.TaskManagerDashboardService;

@Controller
public class TaskManagerDashboardController {

	@Autowired
	TaskManagerDashboardService taskManagerDashboardService;
	
	@RequestMapping("/taskmanagerdashboard")
	public String addTaskManagerDashboard(Model model){
		return null;
	}
	
	@RequestMapping(value="/savetaskmanagerdashboard",method = RequestMethod.POST)
	public String saveTaskManagerDashboard(Model model,@ModelAttribute("taskmanagerdashboard") TaskManagerDashboard taskManagerDashboard){
		return null;
	}
	
	@RequestMapping("/viewtaskmanagerDashboard")
	public String viewTaskManagerDashboard(Model model){
		return null;
	}
	
	@RequestMapping(value="/edittaskmanagerDashboard/{taskManagerId}")
	public String editTaskMangerDashboard(@PathVariable int id,Model model){
		return null;
	}
	
	@RequestMapping(value="/edittaskmanagerdashboardsave",method = RequestMethod.POST)
	public String updateTaskManagerDashboard(@ModelAttribute("taskmanagerdashboard") TaskManagerDashboard taskManagerDashboard,Model model){
		return null;
	}
}
