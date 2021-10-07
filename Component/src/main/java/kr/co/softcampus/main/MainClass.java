package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans2.TestBean3;
import kr.co.softcampus.beans2.TestBean4;
import kr.co.softcampus.beans3.TestBean5;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		System.out.println("======================================================");
		
		TestBean1 xml1 = ctx1.getBean(TestBean1.class);
		System.out.printf("xml1 : %s\n", xml1);
		
		
		TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml2 : %s\n", xml2);
		
		System.out.println("======================================================");
		
		TestBean3 xml3 = ctx1.getBean(TestBean3.class);
		System.out.printf("xml3 : %s\n", xml3);
		
		System.out.println("======================================================");
		
		TestBean4 xml5 = ctx1.getBean("bean4", TestBean4.class);
		System.out.printf("xml5 : %s\n", xml5);
		
		
		TestBean5 xml6 = ctx1.getBean(TestBean5.class);
		System.out.printf("xml6 : %s\n", xml6);
		
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		System.out.println("======================================================");
		
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.printf("java1 : %s\n", java1);
		
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java2 : %s\n", java2);
		
		System.out.println("======================================================");
		
		TestBean3 java3 = ctx2.getBean(TestBean3.class);
		System.out.printf("java3 : %s\n", java3);
		
		TestBean4 java4 = ctx2.getBean("bean4", TestBean4.class);
		System.out.printf("java4 : %s\n", java4);
		
		TestBean5 java5 = ctx2.getBean(TestBean5.class);
		System.out.printf("java5 : %s\n", java5);
		
		ctx2.close();

	}

}
