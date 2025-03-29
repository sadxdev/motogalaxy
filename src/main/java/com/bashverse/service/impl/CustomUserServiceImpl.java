package com.bashverse.service.impl;

import com.bashverse.model.User;
import com.bashverse.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserServiceImpl implements UserDetailsService {

    private UserRepository userRepository;
    private static final String SELLER_PREFIX = "seller_";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.startsWith(SELLER_PREFIX)) {

        }else{
            User user = userRepository.findByEmail(username);
            if(user! == null) {
                return buildUserDetails(user.getEmail());
            }
        }
        return null;
    }
}
