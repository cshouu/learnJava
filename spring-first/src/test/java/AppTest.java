import dao.IUserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao1 = (IUserDao)app.getBean("userDao");
        System.out.println(userDao1);
        ((ClassPathXmlApplicationContext)app).close();
    }
}
