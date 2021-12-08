
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EmployeeTest.
 *
 * @author  Anwarul patwary
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    // TODO,  
    // its Incomplete
    private  Employee e; 
    private Employee e1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        // TODO,  
        // its Incomplete
        e = new Employee("Newton 0988 45 5 4 0011");
    }

    @Test
    public void testgetName()
    {
        // TODO,  
        // its Incomplete
        assertEquals("Newton",e.getName());

    }

    @Test
    public void testgetEmployeeRank()
    {
        //To do
    }

    @Test
    public void testgetEmployeeExperience(){
        //To do       
    }

    @Test
    public void testgetEmployeeAge(){
        //To do       
    }

}

