package kr.co.eultra.pipline.rancher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MController {

	
	@RequestMapping("/")
	public String hello(){
		return "hello/hello";
	}
}
