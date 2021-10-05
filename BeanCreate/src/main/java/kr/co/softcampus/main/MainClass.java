package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// id가 test1인 bean 객체의 주소값을 받아온다.
		TestBean test1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("test1 : %s\n", test1);
		
		TestBean test2 = ctx.getBean("test1", TestBean.class);
		System.out.printf("test2 : %s\n", test2);
		
		// id가 test2인 bean 객체의 주소값을 받아온다.
		TestBean test3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("test3 : %s\n", test3);
		
		TestBean test4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("test4 : %s\n", test4);
		
		TestBean test5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("test5 : %s\n", test5);
		TestBean test6 = ctx.getBean("test3", TestBean.class);
		System.out.printf("test6 : %s\n", test6);
		
		//빈객체 소멸
		ctx.close();
	}

}
