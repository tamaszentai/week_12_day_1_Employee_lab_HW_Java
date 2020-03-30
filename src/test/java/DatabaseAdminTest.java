import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        this.databaseAdmin = new DatabaseAdmin("Bob", "1234CD", 950);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("John");
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("1234CD", databaseAdmin.getNiNumber());
    }

    @Test
    public void canChangeNiNumber(){
        databaseAdmin.setNiNumber("5678AB");
        assertEquals("5678AB", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(950, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeSalary() {
        databaseAdmin.setSalary(800);
        assertEquals(800, databaseAdmin.getSalary());
    }
}


