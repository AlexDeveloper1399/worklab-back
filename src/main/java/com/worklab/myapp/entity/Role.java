package com.worklab.myapp.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    COORDINATOR,
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
