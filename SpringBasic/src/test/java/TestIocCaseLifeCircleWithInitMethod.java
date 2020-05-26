import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;
import com.javadevmap.bean.ProductWithInitMethod;
import com.javadevmap.bean.ProductWithInitializingBean;

public class TestIocCaseLifeCircleWithInitMethod {
	ApplicationContext ctx;
	ProductWithInitMethod bean;
	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-initMethod.xml");
		System.out.println("execute one");
		bean=(ProductWithInitMethod)ctx.getBean("beanId");
		System.out.println("execute two");
		bean=(ProductWithInitMethod)ctx.getBean("beanId");
	}
}