package com.koreait.facebook.security;

import com.koreait.facebook.user.model.UserEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class AuthenticationFacadeImpl implements IAuthenticationFacade {
    @Override
    public UserEntity getLoginUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl)auth.getPrincipal();
        return userDetails.getUser();
    }

    @Override
    public int getLoginUserPk() {
        return getLoginUser().getIuser();
    }
}
