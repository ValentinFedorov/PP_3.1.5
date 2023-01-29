package com.example.spring_boot.web.service;

import com.example.spring_boot.web.model.Role;

import java.util.List;

public interface RoleService {

    void createRole(Role role);

    List<Role> getListRoles();

    Role finedRoleByRoleName(String roleName);

    Role finedRoleById(long id);
}
