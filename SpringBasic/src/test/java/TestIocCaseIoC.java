import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

class TestIocCaseIoC {
	ApplicationContext ctx;

	@Test
	void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-ioc.xml");
		// 从容器中获得id为Product的bean
		//Product proClass = (Product) ctx.getBean(Product.class);
		//System.out.println("不指定id，只配置必须的全限定类名=" + proClass);
		Product pro = (Product) ctx.getBean("beanId");
		System.out.println("指定id获取=" + pro);
		pro = (Product) ctx.getBean("beanName");
		System.out.println("指定name属性获取=" + pro);
		pro = (Product) ctx.getBean("beanId01");
		System.out.println("指定id和name属性获取=" + pro);
	}

}
