package test.manyfield;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//实例化spring容器及bean
		ApplicationContext act = new ClassPathXmlApplicationContext("beans_person.xml");
		
		Person p = (Person) act.getBean("person");
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(Arrays.toString(p.getPhone()));
		System.out.println(p.getBoke().getHost());
		
		System.out.println(p.getBirthday());
		
		List<String> h = p.getHobby();
		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i));
		}
		System.out.println(p.getScores());
	}
}
