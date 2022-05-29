package com.marwa.voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.marwa.voitures.entities.Role;
@RepositoryRestResource(path = "role")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular
public interface RoleRepository extends JpaRepository<Role, Long>  {
	@Query("SELECT r FROM Role r WHERE r.role =?1")
	public Role findByRole(String role );

}
