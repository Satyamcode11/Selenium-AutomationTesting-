package com.OpenCart;

import org.testng.annotations.Test;

public class Test_02 {

    @Test(groups = "Smoke")
    public void logOutMethod(){
        System.out.println("This is logout method");
    }



    @Test(dependsOnMethods = "submitMethod")
    public void cancelMethod(){
        System.out.println("This is cancel method");
    }



    @Test(groups = "Smoke")
    public void buttonMethod(){
        System.out.println("This is the button method");
    }



    @Test
    public void submitMethod(){
        System.out.println("This is the submit method");
    }
}
