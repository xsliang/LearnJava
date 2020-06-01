import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.bean.ProductService;

class TestAutowired {
	ProductService orderService;
	
	@Test
	public void testCase() {
		 //容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-scan.xml");
        //从容器中获得bean
        orderService=(ProductService)ctx.getBean(ProductService.class);
        String name = "spring basic book";
		orderService.addProduct("003", name);

}
	}
