package com.alan.developer;

import com.alan.developer.model.Fruit;
import io.jaegertracing.internal.metrics.Tag;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("/hello")
@Traced
@RequestScoped
public class ExampleResource {

    private static final Logger LOG = Logger.getLogger(ExampleResource.class.getCanonicalName());
    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Tag("fruit-e")
    public Response json() {
        LOG.info("entering fruit");
        return Response.ok(new Fruit("Orange", 0.8F)).build();
    }
}