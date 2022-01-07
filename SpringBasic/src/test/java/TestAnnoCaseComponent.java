import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevmap.dao.IProductDao;
import com.javadevmap.dao.ProductDaoImpl;

class TestAnnoCaseComponent {

	IProductDao productDao;
	ApplicationContext ctx;
	@Test
	void testCase() {
		ctx=new ClassPathXmlApplicationContext("spring-bean-scan.xml");
		productDao=(IProductDao)ctx.getBean("productDaoImpl");
		System.out.println("productDao is"+productDao);
		String result=productDao.addProduct("2", "javaDevmap anno");
		System.out.println(result);
	}

}
