package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImpTest {

    public Calculator calculatorImp;

    @Before
    public void setUp() throws Exception {
        calculatorImp = new CalculatorImp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void multiply() {

        calculatorImp = new CalculatorImp();
        int result = calculatorImp.multiply(3,100);
        Assert.assertEquals(300, result);
    }
}