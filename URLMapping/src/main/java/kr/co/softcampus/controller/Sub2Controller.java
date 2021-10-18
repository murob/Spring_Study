package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sub2")
public class Sub2Controller {

	@GetMapping("test5")
//	@RequestMapping(value="test5", method=RequestMethod.GET)
	public String sub2Test5() {
		return "sub2/test5";
	}
}
