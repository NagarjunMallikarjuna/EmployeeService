package com.rest.employee.Service;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rest.employee.model.Employee;

@Path("/emp")
public class EmployeeService {

	@GET
	@Path("/get/{empId}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee(@PathParam("empId") String empId){
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setName("Sachin tendulkar");
		employee.setEmail("sachin.tendulkar@gmail.com");
		return employee;
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee createEmployee(Employee employee){
		
		return employee;
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee UpdateEmployee(Employee employee){
		employee.setName(employee.getName()+"updated");
		return employee;
	}
	
	@DELETE
	@Path("/delete/{empId}")
	public Response deleteEmployee(@PathParam("empId") int empId)throws URISyntaxException{
		System.out.println("for delete options");
		return Response.status(200).entity("Employee with "+empId+ " is deleted successfully").build();
	}
}
