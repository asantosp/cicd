package com.example.definitivo.cicd.restcontrollers;

import java.io.File;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.definitivo.cicd.components.PortListener;



@RestController
public class IndexRestController {

	 // read application.properties
    private Environment env;

    @Autowired
    private PortListener portListener;


    // constructors
    @Autowired
    IndexRestController(Environment env){
        this.env=env;
    }

    

    @GetMapping("/")
    public String getData(){
       try
        {
            return "Veamos el cambiazo junto al Jenkins guapi";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }

}
