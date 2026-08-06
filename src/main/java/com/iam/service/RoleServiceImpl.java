package com.iam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iam.entity.Role;
import com.iam.repository.RoleRepository;

 @Service
public class RoleServiceImpl implements RoleService {

     @Autowired
    private RoleRepository roleRepository;

  
     @Override
    public Role createRole(Role role) {

        if (roleRepository.existsByRoleName(role.getRoleName())) {
            throw new RuntimeException("Role already exists");
        }

        return roleRepository.save(role);
    }

  
   @Override
    public List<Role> getAllRoles() {

        return roleRepository.findAll();
    }

    
     @Override
    public Role getRoleById(Long id) {

        return roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

   
   @Override
    public Role updateRole(Long id, Role role) {

        Role existingRole = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        existingRole.setRoleName(role.getRoleName());
        existingRole.setDescription(role.getDescription());

        return roleRepository.save(existingRole);
    }

 
      @Override
    public void deleteRole(Long id) {

        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        roleRepository.delete(role);
    }

  
    @Override
    public Role getRoleByRoleName(String roleName) {

        return roleRepository.findByRoleName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }
    
}