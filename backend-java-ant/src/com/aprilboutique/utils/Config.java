package com.aprilboutique.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.configure()
            .directory("../") 
            .load();

    public static String getEnv(String key) {
        String value = System.getenv(key);
        return (value != null) ? value : dotenv.get(key);
    }
}