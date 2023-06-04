package com.example.bankui;

import static org.junit.Assert.*;

import org.junit.*;

public class UserTest {
    static User my_software;
    static Account my_software1;
    static Account my_software2;
    static User my_softwareUser2;
    @BeforeClass
    public static void ClassSetup(){
        System.out.println("Start All");
        my_software1 = new Account();
        my_software2 = new Account();
        my_software = new User("mohamed","male",my_software1,"ssssss","1234");
        my_softwareUser2 = new User("mohamed","male",my_software2,"ssssss","w13231");
    }

    @Before
    public void startTest(){
        System.out.println("Start Test");
    }

    @Test
    public void paybills(){
        assertEquals(-300.0,my_software.pay_bills(100.0),0);
    }

    @Test
    public void buyitem(){
        assertEquals(-200.0,my_software.buy_item(100.0),0);
    }
    @Test
    public void Transferemoneyto(){
        assertEquals(-100.0,my_software.Transfere_money_to(my_softwareUser2,100),0);
    }
    @Test
    public void Transferemoneyfrom(){
        assertEquals(200,my_softwareUser2.Transfere_money_from(100),0);
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