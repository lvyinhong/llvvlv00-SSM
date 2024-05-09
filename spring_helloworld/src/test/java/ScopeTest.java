import com.llvvlv00.spring.pojo.Student;
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

public class ScopeTest {
    @Test
    public void testScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student studentOne = ioc.getBean(Student.class);
        Student studentTwo = ioc.getBean(Student.class);
        System.out.println("studentOne = " + studentOne);
        System.out.println("studentOne.equals(studentTwo) = " + studentOne.equals(studentTwo));
    }
}
