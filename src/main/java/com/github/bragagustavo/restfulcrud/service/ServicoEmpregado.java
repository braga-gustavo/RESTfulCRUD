//É o web service RESTful, que suporta os formatos JSON e XML
package com.github.bragagustavo.restfulcrud.service;

import com.github.bragagustavo.restfulcrud.dao.EmpregadoDAO;
import com.github.bragagustavo.restfulcrud.model.Empregado;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/empregados")
public class ServicoEmpregado {

    //URI:
    //contextPath/servletPath/empregados
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Empregado> getEmpregados_JSON(){

        List<Empregado> listOfCountries = EmpregadoDAO.getAllEmpregados();
        return listOfCountries;
    }


    //URI:
    // /contextPath/servletPath/empregados/{empNo}
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empregado getEmpregado(@PathParam("empNo") String empNo){
        return EmpregadoDAO.getEmpregado(empNo);

    }

    //URI:
    // /contextPath/servletPath/empregados
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Empregado addEmpregado(Empregado emp){
        return EmpregadoDAO.addEmpregado(emp);
    }

    //URI:
    // /contextPath/servletPath/empregados
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public  Empregado updateEmpregado(Empregado emp){
        return EmpregadoDAO.updateEmpregado(emp);
    }

    @DELETE
    @Path("/{empNo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteEmpregado (@PathParam("empNo") String empNo){
        EmpregadoDAO.deleteEMpregado(empNo);
    }
}