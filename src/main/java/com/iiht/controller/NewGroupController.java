package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.NewGroup;
import com.iiht.service.NewGroupService;

@Controller
public class NewGroupController {

	@Autowired
	NewGroupService newGroupService;
	
	@RequestMapping("/newgroup")
	public String addNewGroup(Model model){
		return null;
	}
	
	@RequestMapping(value="/savenewgroup",method = RequestMethod.POST)
	public String saveNewGroup(@ModelAttribute("newgroup") NewGroup newGroup,Model model){
		return null;
	}
}
