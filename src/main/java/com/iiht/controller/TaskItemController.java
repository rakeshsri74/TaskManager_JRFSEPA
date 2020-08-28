package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.TaskItem;
import com.iiht.service.TaskItemService;

@Controller
public class TaskItemController {

	@Autowired
	TaskItemService taskItemService;
	
	@RequestMapping("/taskitemform")
	public String addTaskItem(Model model){
		return null;
	}
	
	@RequestMapping(value="/savetaskitem",method = RequestMethod.POST)
	public String saveTaskItem(@ModelAttribute("taskitem") TaskItem taskItem,Model model){
		return null;
	}
	
}
