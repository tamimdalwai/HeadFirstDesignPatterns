package com.headfirst.chapter11.proxyPattern.security;

/**
 * Proxy for role-based access control.
 */
public class SecurityProxy implements Resource {
    private final Resource secureResource;
    private final String userRole;

    public SecurityProxy(Resource secureResource, String userRole) {
        this.secureResource = secureResource;
        this.userRole = userRole;
    }

    @Override
    public void access() {
        if ("ADMIN".equals(userRole)) {
            secureResource.access();
        } else {
            System.out.println("Access denied! Admin role required.");
        }
    }
}
