
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class HumanResourceTest.
 *
 * @author  Anwarul Patwary
 * @version (a version number or a date)
 */
public class HumanResourceTest
{
    /**
     * Default constructor for test class HumanResourceTest
     */
    private HumanResource hr;

    public HumanResourceTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        hr = new HumanResource("employee0.txt");

    }

    @Test
    public void testgetnextPayable(){
        //TODO   
    }

    @Test
    public void testcalculateSalary(){
        //To do

    }
    @Test
    public void testgetTotalEmployee()
    {
        assertTrue  (hr.getTotalEmployees() != 0);
        assertEquals  (4,hr.getTotalEmployees());
    }

    @Test
    public void testfindManager()
    {
        //TODO
        //its incomplete 
        assertEquals("Darwin's manager is Charles and the rank is 4" , hr.findManager("Darwin"));

    }
    @Test
    public void testretirementTime(){
        //TODO, 
        //its incomplete 
        assertEquals("Darwin will retire in 42 years",hr.retirementTime("Darwin"));

    }

    @Test
    public void testfindEmployee(){
        //TODO
        //its incomplete 
        // For rank 4    
        ArrayList<String> name = new ArrayList<>();
        name.add("Charles");
        name.add("Bradman");
        assertEquals(name,hr.findEmployee(4)); 

    }
}

