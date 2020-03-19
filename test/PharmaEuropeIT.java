import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class de test unitaire
 * de l'application
 * @author François
 */
public class PharmaEuropeIT {
    
    /**
     *
     */
    public PharmaEuropeIT() {
    }
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class PharmaEurope.
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    @Test
    public void testMain() throws ClassNotFoundException, SQLException {
        System.out.println("main");
        String[] args = null;
        PharmaEurope.main(args);
        fail("The test case is a prototype.");
    }
    
}
