import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

class TestIocCase03Property {
	ApplicationContext ctx;
	@Test
	void testCase() {
		ctx=new ClassPathXmlApplicationContext("spring-bean-property.xml");
		Product pro=(Product)ctx.getBean("beanProperty");
		System.out.println("beanNoConstructorArg="+pro +"   " +pro.getId());
	}

}
