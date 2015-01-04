package org.hello.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldContorl2 {
	@RequestMapping("/helloWorld2")
	public String helloWorld(Model model) {
		// org.springframework.jd
		// org/aspectj/weaver/reflect/ReflectionWorld$ReflectionWorldException
		model.addAttribute("name", "Hello World!");
		return "helloWorld2";
	}
}
