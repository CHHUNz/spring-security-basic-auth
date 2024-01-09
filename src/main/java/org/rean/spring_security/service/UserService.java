package org.rean.spring_security.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.rean.spring_security.model.Role;
import org.rean.spring_security.model.User;
import org.rean.spring_security.model.request.AuthenticationRequest;
import org.rean.spring_security.repository.RoleRepository;
import org.rean.spring_security.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveUserRoles(){
        Role userRole = Role
                .builder()
                .name("ROLE_USER")
                .build();
        Role adminRole = Role
                .builder()
                .name("ROLE_ADMIN")
                .build();
        roleRepository.save(userRole);
        roleRepository.save(adminRole);

        Set<Role> roles = roleRepository.findAllByName("ROLE_ADMIN");
        User user = User
                .builder()
                .fullName("mengchhun")
                .username("chhun")
                .password(passwordEncoder.encode("123"))
                .roles(roles)
                .build();
        userRepository.save(user);
    }
}
