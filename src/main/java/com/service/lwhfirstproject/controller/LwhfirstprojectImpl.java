package com.service.lwhfirstproject.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-16T03:26:20.691Z")

@RestSchema(schemaId = "lwhfirstproject")
@RequestMapping(path = "/lwhfirstproject", produces = MediaType.APPLICATION_JSON)
public class LwhfirstprojectImpl {

    @Autowired
    private LwhfirstprojectDelegate userLwhfirstprojectDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLwhfirstprojectDelegate.helloworld(name);
    }

}
