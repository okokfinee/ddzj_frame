package com.mgr.learn.web.home;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.learn.api.IUsersService;
/**
 * 前端首页
 * @author zhouchangwei
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class);
	@Autowired(required = false)
	private IUsersService usersServiceImpl;
	/**
	 * 前端首页
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "index")
	public String index(Model model) {
		log.info("==index page");
		model.addAttribute("info", "info");
		return "/home/index";
	}	
}
