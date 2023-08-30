import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceTest {
    @Test
    public void test1 () throws PropertyVetoException, SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource)app.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
