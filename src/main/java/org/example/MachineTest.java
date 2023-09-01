package org.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MachineTest {

    @Test
    public void discountWith0Points() {
        Discount service = new Discount();
        assertEquals(1, service.calculate(0));
    }

    @Test
    public void discountWith50Points() {
        Discount service = new Discount();
        assertEquals(1, service.calculate(50));
    }

    @Test
    public void discountWith99Points() {
        Discount service = new Discount();
        assertEquals(1, service.calculate(99));
    }

    @Test
    public void discountWith100Points() {
        Discount service = new Discount();
        assertEquals(3, service.calculate(100));
    }

    @Test
    public void discountWith150Points() {
        Discount service = new Discount();
        assertEquals(3, service.calculate(150));
    }

    @Test
    public void discountWith199Points() {
        Discount service = new Discount();
        assertEquals(3, service.calculate(199));
    }

    @Test
    public void discountWith200Points() {
        Discount service = new Discount();
        assertEquals(5, service.calculate(200));
    }

    @Test
    public void discountWith350Points() {
        Discount service = new Discount();
        assertEquals(5, service.calculate(350));
    }

    @Test
    public void discountWith499Points() {
        Discount service = new Discount();
        assertEquals(5, service.calculate(499));
    }

    @Test
    public void discountWith500Points() {
        Discount service = new Discount();
        assertEquals(10, service.calculate(500));
    }

    @Test
    public void discountWith501Points() {
        Discount service = new Discount();
        assertEquals(10, service.calculate(501));
    }

    @Test
    public void discountWith1000Points() {
        Discount service = new Discount();
        assertEquals(10, service.calculate(1000));
    }
}
