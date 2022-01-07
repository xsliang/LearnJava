import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog4jCase {
    private Logger logger = LoggerFactory.getLogger(TestLog4jCase.class);
    ApplicationContext context = null;

    @Test
    public void testCase() {
        context = new ClassPathXmlApplicationContext("spring-bean.xml");
        for (int i = 0; i < 10000; i++) {
            logger.debug("debug" + i);
            logger.info("test");
            logger.warn("warn" + i);
            logger.error("error" + i);
        }

    }

}
