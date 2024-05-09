import com.llvvlv00.spring.pojo.Clazz;
import com.llvvlv00.spring.pojo.HelloWorld;
import com.llvvlv00.spring.pojo.Person;
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
public class IOCByXMLTest {
    @Test
    public void testHelloWorld() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld bean = ioc.getBean(HelloWorld.class);
        bean.sayHello();
        HelloWorld bean1 = ioc.getBean("helloWorld", HelloWorld.class);
        bean1.sayHello();
    }

    @Test
    public void testGetStudentOne() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentOne = ioc.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void testGetStudentOneByPerson() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person studentOne = ioc.getBean(Person.class);
        System.out.println(studentOne);
    }

    @Test
    public void testGetStudentTestDI() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person studentThree = ioc.getBean("studentThree", Student.class);
        System.out.println("studentThree = " + studentThree);

        Student studentFour = ioc.getBean("studentFour", Student.class);
        System.out.println("studentFour = " + studentFour);

        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println("studentFive = " + studentFive.getGender());

        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println("studentSix = " + studentSix.getGender());

        Student studentEight = ioc.getBean("studentEight", Student.class);
        System.out.println("studentEight = " + studentEight);

        Student studentTen = ioc.getBean("studentTen", Student.class);
        System.out.println("studentTen = " + studentTen);
    }

    @Test
    public void testClazzOneContainerStudent() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz classThree = ioc.getBean("clazzThree", Clazz.class);
        System.out.println("clazzThree = " + classThree);
    }

}
