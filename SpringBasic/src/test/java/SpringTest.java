import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javadevmap.dao.ProductBeanMapper;
import com.javadevmap.domain.ProductBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-base.xml", "classpath:spring-mybatis.xml" })
public class SpringTest {
    @Autowired
    private ProductBeanMapper productBeanMapper;

    @Test
    public void insert() {
        ProductBean record = new ProductBean();
        record.setPrice(99);
        record.setProductName("java dev map");
        record.setProductDesc("产品描述，产品描述");
        int affectsNums = productBeanMapper.insert(record);
        System.out.println("insert affects row num is"+affectsNums);
    }
    
    @Test
    public void selectByPrimaryKey() {
        int id=4;
        ProductBean record = productBeanMapper.selectByPrimaryKey(id);
        System.out.println(record.getProductDesc());
    }
}
