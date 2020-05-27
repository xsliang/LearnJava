import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.ProductWithDisposableBean;

public class TestIocCaseLifeCircleWithDisposableBean {
    AbstractApplicationContext ctx;
	ProductWithDisposableBean bean;
	@Test
	public void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-disposable.xml");
		System.out.println("execute one");
		bean=(ProductWithDisposableBean)ctx.getBean("beanId");
		System.out.println("execute two");
		bean=(ProductWithDisposableBean)ctx.getBean("beanId");
		ctx.registerShutdownHook();
	}
}