package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.println("data1 : " + data1);
		System.out.printf("data2 : %s\n", data2);
		System.out.printf("data33 : %s\n", data33);
		
		for(String a : data3) {
			System.out.println("data3 : " + a);
		}
		
		return "result";
	}
	
	@GetMapping("/test2")
//	public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean bean2) {
	public String test2(DataBean bean1, DataBean bean2) {
		
		System.out.println("data1 : " + bean1.getData1());
		System.out.println("data2 : " + bean1.getData2());
		
		for(int a : bean1.getData3()) {
			System.out.println("data3 : " + a);
		}
		
		System.out.println("bean2.data1 : " + bean2.getData1());
		System.out.println("bean2.data2 : " + bean2.getData2());
		
		return "result";
	}
}
