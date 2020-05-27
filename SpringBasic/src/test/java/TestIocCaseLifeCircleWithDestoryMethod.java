import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.ProductWithDestoryMethod;

public class TestIocCaseLifeCircleWithDestoryMethod {
	AbstractApplicationContext ctx;
	ProductWithDestoryMethod bean;
	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-destoryMethod.xml");
		System.out.println("execute one");
		bean=(	ProductWithDestoryMethod)ctx.getBean("beanId");
		System.out.println("execute two");
		bean=(	ProductWithDestoryMethod)ctx.getBean("beanId");
		ctx.registerShutdownHook();
	}
}