package com.example.spring_boot.web.util;

import com.example.spring_boot.web.model.Role;
import com.example.spring_boot.web.model.User;
import com.example.spring_boot.web.service.RoleService;
import com.example.spring_boot.web.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {

    private UserService userService;
    private RoleService roleService;

    public Init(UserService userService, RoleService roleService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        Role admin = new Role();
        admin.setRoleName("ROLE_ADMIN");
        roleService.createRole(admin);
        Role user = new Role();
        user.setRoleName("ROLE_USER");
        roleService.createRole(user);

        User userAdmin = new User();
        userAdmin.setUsername("admin");
        userAdmin.setPassword("admin");
        userAdmin.setName("Ксения");
        userAdmin.setSurname("Болдырева");
        userAdmin.setAge(24);
        userAdmin.setEmail("ksboldyreva@bk.ru");
        userService.addUser(userAdmin);
        userAdmin.addRolesToUser(admin);
        userAdmin.addRolesToUser(user);
        userService.updateUser(userAdmin, userAdmin.getId());

        User userUser = new User();
        userUser.setUsername("user");
        userUser.setPassword("user");
        userUser.setName("Валентин");
        userUser.setSurname("Федоров");
        userUser.setAge(24);
        userUser.setEmail("grind33@mail.ru");
        userService.addUser(userUser);
        userUser.addRolesToUser(user);
        userService.updateUser(userUser, userUser.getId());

    }
}
