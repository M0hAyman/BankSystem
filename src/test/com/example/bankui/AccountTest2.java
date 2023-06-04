package com.example.bankui;

import org.junit.*;

import static org.junit.Assert.*;

public class AccountTest2 {
    static Account my_software;

    @BeforeClass
    public static void ClassSetup(){

        System.out.println("Start All");
        my_software = new Account();

    }
    @Before
    public void startTest(){
        System.out.println("Start Test");
    }

    @Test
    public void getbalance(){
        assertEquals(0,my_software.getBalance(),0);
    }

    @Test
    public void withdraw(){
        assertEquals(-200.0,my_software.withdraw(100),0);
    }

    @Test
    public void deposit(){
        assertEquals(1000,my_software.deposit(100.0),0);
    }
    @After
    public void endTest(){
        System.out.println("End Test");
    }

    @AfterClass
    public static void ClassTearDown(){
        System.out.println("End All");
    }



}