package com.iam.service;

 import java.util.List;

 import com.iam.entity.Role;

 public interface RoleService {

    
    Role createRole(Role role);


    List<Role> getAllRoles();

  
    Role getRoleById(Long id);


    Role updateRole(Long id, Role role);

    void deleteRole(Long id);

    Role getRoleByRoleName(String roleName);

}