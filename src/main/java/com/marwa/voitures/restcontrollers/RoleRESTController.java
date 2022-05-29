package com.marwa.voitures.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.marwa.voitures.entities.Role;
import com.marwa.voitures.repos.RoleRepository;
@RestController
@RequestMapping("/api/role")
@CrossOrigin("*")
public class RoleRESTController {
	@Autowired
	RoleRepository roleRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Role> getAllRoles()
	{
	return roleRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Role getRoleById(@PathVariable("id") Long id) {
	return roleRepository.findById(id).get();
	}
}
