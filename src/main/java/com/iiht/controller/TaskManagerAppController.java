package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.TaskManagerApp;
import com.iiht.service.TaskManagerAppService;

@Controller
public class TaskManagerAppController {
	
	@Autowired
	TaskManagerAppService taskManagerAppService;
	
	@RequestMapping("/taskmanagerappform")
	public String addTaskManager(Model model){
		return null;
	}
	
	@RequestMapping(value="/savetaskmanagerapp",method = RequestMethod.POST)
	public String saveTaskManagerApp(@ModelAttribute("taskmanagerapp") TaskManagerApp taskManagerApp,Model model){
		return null;
	}
	
	@RequestMapping("/viewtaskmanagerapp")
	public String viewTaskManagerApp(Model model){
		return null;
	}
	
	@RequestMapping("/viewalltaskmanagerapp")
	public String viewAllTaskManagerApp(Model model){
		return null;
	}
	
	@RequestMapping(value="/edittaskmanagerapp/{taskManagerAppId}")
	public String editOrder(@PathVariable int id,Model model){
		return null;
	}
	
	@RequestMapping(value="/edittaskmanagerappsave",method = RequestMethod.POST)
	public String editTaskManagerAppSave(@ModelAttribute("taskmanagerapp") TaskManagerApp taskManagerApp,Model model){
		return null;
	}
	
	@RequestMapping(value="/deletetaskmanagerapp/{taskManagerAppId}",method = RequestMethod.GET)
	public String deleteGiftOrder(@PathVariable int taskManagerAppId,Model model){
		return null;
	}


}
