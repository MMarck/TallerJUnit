/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

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
public class MovieRentalTest {
    
    public MovieRentalTest() {
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
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        //Creación de instancias
        int dias=3;
        Movie movie=new Movie("DragonBall",Movie.NEW_RELEASE);
        MovieRental instance = new MovieRental(movie,dias);
        int result = instance.getDaysRented();
        //Prueba
        assertEquals(dias, result);
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        //Creación de instancias
        int dias=3;
        Movie movie=new Movie("DragonBall",Movie.NEW_RELEASE);
        MovieRental instance = new MovieRental(movie,dias);
        Movie result = instance.getMovie();
        //Prueba
        assertEquals(movie, result);

    }

    /**
     * Test of getPriceCode method, of class MovieRental.
     */
    @Test
    public void testGetPriceCode() {
       //Creación de instancias
        int dias=3;
        Movie movie=new Movie("DragonBall",Movie.NEW_RELEASE);
        MovieRental instance = new MovieRental(movie,dias);
        int result = instance.getPriceCode();
        //Prueba
        assertEquals(Movie.NEW_RELEASE, result);

    }
    
}
