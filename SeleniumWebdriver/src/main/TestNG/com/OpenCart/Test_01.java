package com.OpenCart;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_01 {


    @Test(groups = "Smoke")
    public void loginMethod(){
        System.out.println("This is the login method");
    }


    @Test(enabled = false)
    public void registerMethod(){
        System.out.println("This is the register method");
    }


    @Test(groups = "Smoke")
    public void forgotPasswordMethod(){
        System.out.println("This is the forgot password method");
    }

@Parameters("URL")
    @Test
    public void SearchBoxMethod(String urlName){
        System.out.println("This is the search box method");
    System.out.println(urlName);
    }


    @Test(groups = "Smoke")
    public void addToCartMethod(){
        System.out.println("This is the add to cart method");
    }
}
