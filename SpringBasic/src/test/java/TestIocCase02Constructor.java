import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.Product;

class TestIocCase02Constructor {
	ApplicationContext ctx;
	@Test
	void testCase() {
		ctx=new ClassPathXmlApplicationContext("spring-bean-constructor.xml");
		//从容器中获得bean
		Product product=(Product)ctx.getBean("beanNoConstructorArg");
		System.out.println("beanNoConstructorArg="+product);
		Product productCon=(Product)ctx.getBean("beanHasConstructorArg");
		System.out.println("beanNoConstructorArg="+productCon +"   " +productCon.getId());
	}

}
