package boilerplate.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;

import boilerplate.AppConfig;
import boilerplate.DbResource;
import boilerplate.entity.Employee;

public class EmployeeDaoTest {

    @Rule
    public final DbResource dbResource = new DbResource();

    private final EmployeeDao dao = getDao("EmployeeDaoImpl");

    @Test
    public void testSelectById() {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            Employee employee = dao.selectById(1);
            assertNotNull(employee);
            assertEquals("ALLEN", employee.name);
            assertEquals(Integer.valueOf(30), employee.age);
            assertEquals(Integer.valueOf(0), employee.version);
        });
    }

    @Test
    public void testSelect() {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            List<Employee> employees = dao.select(new String[]{"ALLEN", "JOHN"});
//            List<Employee> employees = dao.select(Arrays.asList("ALLEN", "JOHN");
            assertEquals("ALLEN", employees.get(0).name);
        });
    }

    static <T> T getDao(String className) {
        try {
            Class<?> c = Class.forName("boilerplate.dao." + className);
            return (T) c.getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
