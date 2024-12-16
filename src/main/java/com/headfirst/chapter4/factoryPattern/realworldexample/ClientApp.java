package com.headfirst.chapter4.factoryPattern.realworldexample;


public class ClientApp {
    public static void main(String[] args) {
        Dialog dialog;

        // Simulate OS-specific behavior
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new MacDialog();
        }

        dialog.renderWindow();
    }
}