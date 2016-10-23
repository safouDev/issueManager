package com.safou.issueManager.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/appSetting")
public interface AppSettingResource {

    @GET
    @Produces("application/json")
    Response findAll();

    @GET
    @Produces("application/json")
    @Path("/{name}")
    Response findByName(@PathParam("name") String name);

}
