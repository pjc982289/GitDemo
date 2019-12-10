package com.zeroten.flow;

import org.testng.annotations.Test;

public class IfElseTest {
    int age =18;
    @Test
    public void testIfElse() {

        if(age>=18){
            System.out.println("是成年人");
        }
    }

}
