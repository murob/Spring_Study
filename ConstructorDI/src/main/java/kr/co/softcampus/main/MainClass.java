package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = new TestBean();
		t1.printData();
		
		TestBean t2 = new  TestBean(100);
		t2.printData();
		
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		
		TestBean t4 = new TestBean("문자열");
		t4.printData();
		
		TestBean t5 = new TestBean(200, 22.22, "안녕하세요");
		t5.printData();
		
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		
		System.out.println("-----------------------------------");
		
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean2 t200 = new TestBean2(d1, d2);
		t200.printData();
		
		System.out.println("-----------------------------------");
		
		TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
		
		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();
		
		ctx.close();
	}

}
