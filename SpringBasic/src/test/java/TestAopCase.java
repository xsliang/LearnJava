import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.service.ProductService;

public class TestAopCase{
    ProductService proService;
    ApplicationContext ctx;
    @Test
    public void testCase() {
        ctx =new ClassPathXmlApplicationContext("spring-bean-aop.xml");
        // 重容器中获得bean
        proService = (ProductService)ctx.getBean(ProductService.class);
        proService.addProduct("4001", "java dev map");
        proService.doThrowException();
    }
}