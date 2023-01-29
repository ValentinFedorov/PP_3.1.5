package com.example.spring_boot.web.dao;

import com.example.spring_boot.web.model.Role;

import java.util.List;

public interface RoleDao {

    void createRole(Role role);

    List<Role> getListRoles();

    Role finedRoleByRoleName(String roleName);

    public Role finedRoleById(long id);
}
