package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.employee.service.RolesAndResponsibilitiesService;

@RestController
public class RolesAndResponsibilitesController {
	
	@Autowired
	private RolesAndResponsibilitiesService responsibilitiesService;
	
	@PostMapping("/rolesandresponsibilities")
	public HttpStatus AddRolesAndResponsibilities(@RequestBody RolesAndResponsibilites rolesAndResponsibilites) {
		boolean test=responsibilitiesService.addRolesAndResponsibilites(rolesAndResponsibilites);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/rolesandresponsibilities")
	public ResponseEntity<List<RolesAndResponsibilites>>GetRolesAndResponsibilities(){
		List<RolesAndResponsibilites> rolesAndResponsibilites= responsibilitiesService.getRolesAndResponsibilites();
		ResponseEntity<List<RolesAndResponsibilites>> responseEntity=new ResponseEntity<>(rolesAndResponsibilites , HttpStatus.OK);
		return responseEntity;
	}
	@PutMapping("/rolesandresponsibilities/{id}")
	public HttpStatus ModifyRolesAndResponsibilities(@RequestBody RolesAndResponsibilites rolesAndResponsibilites, @PathVariable Integer id) {
		boolean test=responsibilitiesService.editRolesAndResponsibilites(rolesAndResponsibilites, id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/rolesandresponsibilities/{id}")
	public HttpStatus DeleteRolesAndResponsibilities( @PathVariable Integer id) {
		boolean test=responsibilitiesService.deleteRolesAndResponsibilites(id);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
