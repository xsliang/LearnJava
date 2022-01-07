
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.service.ProductServiceBoth;

class TestAutowiredBoth {
ProductServiceBoth productServiceBoth;
	
	@Test
	public void testCase() {
		 //容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-scan.xml");
        //从容器中获得bean
        productServiceBoth=(ProductServiceBoth)ctx.getBean(ProductServiceBoth.class);
        String name = "spring basic book";
        productServiceBoth.addProduct("003", name);

}
	}
