package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTest {

    Football football;

    @Before
    public void setUp() throws Exception {
        football = new Football("Messi");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {

        football = new Football("Messi");
        boolean result = football.equals(football);
        Assert.assertEquals(true, result);
    }
}