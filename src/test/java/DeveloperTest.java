import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        this.developer = new Developer("Bob", "1234CD", 950);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("John");
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("1234CD", developer.getNiNumber());
    }

    @Test
    public void canChangeNiNumber(){
        developer.setNiNumber("5678AB");
        assertEquals("5678AB", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(950, developer.getSalary());
    }

    @Test
    public void canChangeSalary() {
        developer.setSalary(800);
        assertEquals(800, developer.getSalary());
    }
}
