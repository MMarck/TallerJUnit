/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marck
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        //creacion de instancias necesaria para la prueba
        MovieRental arg = new MovieRental(new Movie("titulo", Movie.CHILDRENS), 2);
        Customer instance = new Customer("c1");
        ArrayList<MovieRental> copy = (ArrayList<MovieRental>) instance.getMovieRentals().clone();
        
        //realizacion de la prueba 
        instance.addMovieRental(arg);
        copy.add(arg);
        
        assertEquals(copy, instance.getMovieRentals());
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        //creacion de instancias necesaria para la prueba
        VideoGameRental arg = new VideoGameRental(new WiiGame("ELMARIO"), 10, true);
        Customer instance = new Customer("c1");
        ArrayList<VideoGameRental> copy = (ArrayList<VideoGameRental>) instance.getMovieRentals().clone();
        
        //realizacion de la prueba 
        instance.addVideoGameRental(arg);
        copy.add(arg);
        
        assertEquals(copy, instance.getVideoGameRental());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = null;
        String expResult = "";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of getMovieRentals method, of class Customer.
     */
    @Test
    public void testGetMovieRentals() {
        System.out.println("getMovieRentals");
        Customer instance = null;
        ArrayList<MovieRental> expResult = null;
        ArrayList<MovieRental> result = instance.getMovieRentals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVideoGameRental method, of class Customer.
     */
    @Test
    public void testGetVideoGameRental() {
        System.out.println("getVideoGameRental");
        Customer instance = null;
        ArrayList<VideoGameRental> expResult = null;
        ArrayList<VideoGameRental> result = instance.getVideoGameRental();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
