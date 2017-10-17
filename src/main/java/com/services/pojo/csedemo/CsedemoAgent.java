package com.services.pojo.csedemo;

import org.springframework.stereotype.Component;

import com.netflix.config.DynamicPropertyFactory;
import com.services.pojo.csedemo.model.Person;

@Component
public class CsedemoAgent {

	
    public Integer add(Integer a, Integer b){

        // Do Some Magic Here!
        return null;
    };


    public String sayHei(String name){
        return  DynamicPropertyFactory.getInstance().getStringProperty("acmeair.person.sex", "men").get();
    };


    public String sayHello(String name){

        // Do Some Magic Here!
        return null;
    };


    public String sayHi(String name){

        // Do Some Magic Here!
        return null;
    };


    public String saySomething(String prefix, Person user){

        // Do Some Magic Here!
        return null;
    };

}
