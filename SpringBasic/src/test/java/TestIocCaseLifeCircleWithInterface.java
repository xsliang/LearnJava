import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;
import com.javadevmap.bean.ProductWithInitializingBean;

public class TestIocCaseLifeCircleWithInterface {
	ApplicationContext ctx;
	ProductWithInitializingBean bean;
	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-initializingbean.xml");
		System.out.println("execute one");
		bean=(ProductWithInitializingBean)ctx.getBean("beanId");
		System.out.println("execute two");
		bean=(ProductWithInitializingBean)ctx.getBean("beanId");
	}
}