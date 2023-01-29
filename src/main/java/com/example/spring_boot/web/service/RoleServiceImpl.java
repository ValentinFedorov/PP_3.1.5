package com.example.spring_boot.web.service;

import com.example.spring_boot.web.dao.RoleDao;
import com.example.spring_boot.web.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public void createRole(Role role) {
        roleDao.createRole(role);
    }

    @Override
    public List<Role> getListRoles() {
        return roleDao.getListRoles();
    }

    @Override
    public Role finedRoleByRoleName(String roleName) {
        return roleDao.finedRoleByRoleName(roleName);
    }

    @Override
    public Role finedRoleById(long id) {
        return roleDao.finedRoleById(id);
    }
}
