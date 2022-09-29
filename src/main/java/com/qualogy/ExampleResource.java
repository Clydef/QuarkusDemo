package com.qualogy;

import io.micrometer.core.annotation.Counted;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ExampleResource {

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public SimpleProperty getPropertyXML() {
        return new SimpleProperty("Lenovo", "ThinkPad");
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleProperty getPropertyJSON ()
    {
        return new SimpleProperty("Lenovo", "ThinkPad");
    }
}