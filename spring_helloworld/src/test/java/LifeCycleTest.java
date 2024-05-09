import com.llvvlv00.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package PACKAGE_NAME
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class LifeCycleTest {
    @Test
    public void testLifeCycle() {
        // ConfigurableApplicationContext 是 ApplicationContext的子接口，扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = context.getBean(User.class);
        System.out.println("user = " + user);
        context.close();
    }
}
