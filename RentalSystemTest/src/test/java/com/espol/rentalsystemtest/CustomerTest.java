/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marck
 */
public class CustomerTest {
    
    public CustomerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = null;
        Customer instance = null;
        instance.addMovieRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = null;
        Customer instance = null;
        instance.addVideoGameRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of statement method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = null;
        String expResult = "";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
