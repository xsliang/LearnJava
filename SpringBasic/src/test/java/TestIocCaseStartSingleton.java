import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

public class TestIocCaseStartSingleton {
	ApplicationContext ctx;

	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
		Product product = (Product) ctx.getBean("beanId");
		Product product2 = (Product) ctx.getBean("beanId");
		System.out.println("product==product2 is " + (product == product2));
	}
}
