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
            // URL to dummy data file
            //String fileName=env.getProperty("file.dummy.path");

            // Get the context (i.e., /java/resources...) and append fileName
            //ClassLoader classLoader = new IndexRestController(env).getClass().getClassLoader();
            //File file = new File(classLoader.getResource(fileName).getFile());

            //Read File Content
            //String theBody = new String(Files.readAllBytes(file.toPath()));

            // Return the content in String format with OK
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
