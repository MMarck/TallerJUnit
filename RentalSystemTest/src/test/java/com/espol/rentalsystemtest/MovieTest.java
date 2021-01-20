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
 * @author Djurado
 */
public class MovieTest {
    
    public MovieTest() {
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
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        //Creación de instancias para la prueba
        Movie instance = new Movie("Over the moon", Movie.CHILDRENS);
        int expResult = Movie.CHILDRENS;
        int result = instance.getPriceCode();
        //Prueba
        assertEquals(expResult, result);
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        //Creación de instancias para la prueba
        int arg = Movie.NEW_RELEASE;
        Movie instance = new Movie("Lo que sea", Movie.REGULAR);
        instance.setPriceCode(arg);
        //Prueba
        assertEquals(arg, instance.getPriceCode());
    }
    
}


