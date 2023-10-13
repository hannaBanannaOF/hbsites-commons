package com.hbsites.hbsitescommons.commons.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserUtils {

    public static UUID getUserUUID() {
        return UUID.fromString(((Jwt)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getSubject());
    }

}
