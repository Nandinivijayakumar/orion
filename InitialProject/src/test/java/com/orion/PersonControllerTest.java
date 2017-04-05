package com.orion;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.orion.controller.PersonController;
import com.orion.model.Person;
import com.orion.service.PersonService;
@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest
{
        private static final String ID1 ="999";
	    private static final String ID = "123";
	    private static final String NAME = "nandy";
	    Person person =new Person();
	  private PersonController controller;
	 @Mock
	 PersonService personservice;
	 
	 @Before
	 public void setUp() throws Exception{
	        RestAssuredMockMvc.standaloneSetup(controller);
	    }

	  @Test
	  
	  public void shouldGetvalues() throws Exception{
		  when(personservice.getPerson(ID1)).thenReturn(person);
		  
		  
	        given().param("id", ID1).
            when().
            get("/all").
            then().
            statusCode(200).
            body("id", equalTo(ID)).
            body("name", equalTo(NAME));
            
}

	  }
