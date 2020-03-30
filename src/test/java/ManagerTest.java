import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        this.manager = new Manager("Bob", "1234CD", 950, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

    @Test
    public void cantChangeNameToNothing(){
        manager.setName("");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("1234CD", manager.getNiNumber());
    }

    @Test
    public void canChangeNiNumber(){
        manager.setNiNumber("5678AB");
        assertEquals("5678AB", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(950, manager.getSalary());
    }

    @Test
    public void canChangeSalary() {
        manager.setSalary(800);
        assertEquals(800, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(20);
        assertEquals(970, manager.getSalary());
    }

    @Test
    public void cantRaiseWithNegative(){
        manager.raiseSalary(-10);
        assertEquals(950, manager.getSalary());
    }

    @Test
    public void checkPayBonus(){
        assertEquals(9.5, manager.payBonus(), 0.1);
    }







}
