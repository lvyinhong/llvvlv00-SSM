import com.llvvlv00.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package PACKAGE_NAME
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class AutowireByXMLTest {
    @Test
    public void testAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController controller = context.getBean("userController", UserController.class);
        controller.saveUser();
    }
}
