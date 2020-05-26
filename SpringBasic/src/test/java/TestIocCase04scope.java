import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

class TestIocCase04scope {
	Product productOne;
	Product productTwo;
	ApplicationContext ctx;

	@Test
	void testCase() {
		ctx = new ClassPathXmlApplicationContext("spring-bean-scope.xml");	
		//从容器中获得id为beanNoScope的bean
		productOne = (Product) ctx.getBean("beanNoScope");
		productTwo = (Product) ctx.getBean("beanNoScope");
		System.out.println("scope default productOne==productTwo is " + (productOne == productTwo));
		//从容器中获得id为beanPrototype的bean
		productOne = (Product) ctx.getBean("beanPrototype");
		productTwo = (Product) ctx.getBean("beanPrototype");
		System.out.println("scope prototype productOne==productTwo is " + (productOne == productTwo));
	}

}
