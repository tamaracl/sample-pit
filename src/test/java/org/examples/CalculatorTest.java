package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void sumTest(){
        Calculator cs = new Calculator();
        assertEquals(2D, cs.sum(1D,1D));
    }

    @Test
    public void mulTest(){
        Calculator cs = new Calculator();
        assertEquals(1D,cs.mul(1D,1D));
    }

    @Test
    public void mulBiggerTest(){
        Calculator cs = new Calculator();
        assertEquals(500D,cs.mul(5D,100D));
    }

    @Test
    public void subTest(){
        Calculator cs = new Calculator();
        assertEquals(2D,cs.sub(3D,1D));
    }

    @Test
    public void divTest(){
        Calculator cs = new Calculator();
        assertEquals(10D,cs.divide(100D,10D));
    }

    @Test
    public void divTestNull(){
        Calculator cs = new Calculator();
        Double a = null;
        Double b= null;
        assertThrows(NullPointerException.class,() -> cs.divide(a,b)  );
    }

    @Test
    public void subTestZero(){
        Calculator cs = new Calculator();
        Double a= 0D;
        Double b= 0D;
        assertEquals(0,cs.sub(a,b));
    }
}
