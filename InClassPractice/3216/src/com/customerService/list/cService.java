package com.customerService.list;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/list") // service call mapping 
public class cService {
    @GET // Http verb 
    @Produces(MediaType.APPLICATION_JSON)// media type
    public ArrayList<customer> returnTitle()
    {
        customer s= new customer();
        s.setName("John");
        s.setID("1234");
        
        customer d = new customer();
        d.setID("4321");
        d.setName("Phil");
        
        ArrayList<customer> ar = new ArrayList<>();
        ar.add(d);
        ar.add(s);
        return ar;
    }
}