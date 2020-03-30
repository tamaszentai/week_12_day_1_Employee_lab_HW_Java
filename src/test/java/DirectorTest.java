import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        this.director = new Director("Bob", "1234CD", 950, "HR", 10000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("John");
        assertEquals("John", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("1234CD", director.getNiNumber());
    }

    @Test
    public void canChangeNiNumber(){
        director.setNiNumber("5678AB");
        assertEquals("5678AB", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(950, director.getSalary());
    }

    @Test
    public void canChangeSalary() {
        director.setSalary(800);
        assertEquals(800, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(20);
        assertEquals(970, director.getSalary());
    }

    @Test
    public void checkPayBonus(){
        assertEquals(9.5, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget(){
        assertEquals(10000, director.getBudget(), 0.1);
    }

    @Test
    public void testDirectorBonus(){
        assertEquals(19, director.payBonus(), 0.1);
    }
}


