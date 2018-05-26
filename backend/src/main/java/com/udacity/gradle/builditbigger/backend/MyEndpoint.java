package com.udacity.gradle.builditbigger.backend;

import com.example.jokeprovidinglibrary.JokeProvidingClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "getJokesAPI")
    public MyBean getJokesAPI() {
        MyBean response = new MyBean();
        JokeProvidingClass jokeProvidingClass = new JokeProvidingClass();

        String jokeProvided = jokeProvidingClass.getJokes();
        response.setData(jokeProvided);

        return response;
    }

}
