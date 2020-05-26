import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

public class TestIocCaseStart {
	ApplicationContext ctx;

	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
		// 从容器中获取id为beanId的bean
		Product product = (Product) ctx.getBean("beanId");
		System.out.println("ApplicationContext.getBean()=" + product);
	}
}