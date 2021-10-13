package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Calculatrice;
import beans.MyObject;

public class Test01 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculatrice c = (Calculatrice) context.getBean("cal01");
		c.add();
		System.out.println(c.getResultat());
		
		MyObject oParent = (MyObject) context.getBean("myObjParent");
		MyObject oEnfant = (MyObject) context.getBean("myObjEnfant");
		System.out.println(oEnfant.getName() + " -> " + oEnfant.getParentObj().getName());
		
		for(String k : oParent.getKeywords()) {
			System.out.println(k);
		}
		
		
		
		context.close();
	}

}
