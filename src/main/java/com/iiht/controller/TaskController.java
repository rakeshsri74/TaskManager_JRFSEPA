package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.Task;
import com.iiht.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@RequestMapping("/task")
	public String addNewTask(Model model){
		return null;
	}
	
	@RequestMapping(value="/savetask",method = RequestMethod.POST)
	public String saveNewTask(@ModelAttribute("task") Task task,Model model){
		return null;
	}
	
	@RequestMapping("/viewtask")
	public String viewTask(Model model){
		return null;
	}
	
	@RequestMapping("/viewalltask")
	public String viewAllTask(Model model){
		return null;
	}
	
	@RequestMapping(value="/edittask/{taskId}")
	public String editTask(@PathVariable int id,Model model){
		return null;
	}
	
	@RequestMapping(value="/edittasksave",method = RequestMethod.POST)
	public String updateTask(@ModelAttribute("task") Task task,Model model){
		return null;
	}
	
}
