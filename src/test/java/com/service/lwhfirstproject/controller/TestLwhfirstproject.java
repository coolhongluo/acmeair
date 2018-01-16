package com.service.lwhfirstproject.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLwhfirstproject {

        LwhfirstprojectDelegate lwhfirstprojectDelegate = new LwhfirstprojectDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lwhfirstprojectDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}