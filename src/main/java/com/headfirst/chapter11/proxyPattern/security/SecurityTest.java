package com.headfirst.chapter11.proxyPattern.security;


/**
 * Client to demonstrate Protection Proxy for secure resources.
 */
public class SecurityTest {
    public static void main(String[] args) {
        Resource adminResource = new SecurityProxy(new SecureResource(), "ADMIN");
        Resource userResource = new SecurityProxy(new SecureResource(), "USER");

        System.out.println("Admin trying to access resource:");
        adminResource.access();

        System.out.println("\nUser trying to access resource:");
        userResource.access();
    }
}