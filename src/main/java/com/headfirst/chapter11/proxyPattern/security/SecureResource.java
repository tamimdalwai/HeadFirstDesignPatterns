package com.headfirst.chapter11.proxyPattern.security;

/**
 * Real Subject for accessing a secure resource.
 */
public class SecureResource implements Resource {
    @Override
    public void access() {
        System.out.println("Accessing secure resource...");
    }
}
