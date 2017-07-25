package com.mrscottmcallister.apps.resources;

import com.codahale.metrics.annotation.Timed;
import com.mrscottmcallister.apps.views.HomeView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by scottmcallister on 2017-07-24.
 */
@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {
    @GET
    @Timed
    public HomeView sayHello() {
        return new HomeView();
    }
}
