package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("===setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(){
        System.out.println("===closing browser using cucumber @After");
        System.out.println("Scenario ended/ Take screen shot id failed!");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("---------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("----------> applying tearDown using @AfterStep");
    }

}
