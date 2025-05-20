package com.automationpractice.utils;

import io.github.cdimascio.dotenv.Dotenv;

public abstract class Config {

    private static final Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

    public static final String URL = dotenv.get("URL") != null ? dotenv.get("URL") : System.getenv("URL");

    public static final String BROWSER = dotenv.get("BROWSER") != null ? dotenv.get("BROWSER") : System.getenv("BROWSER");

    public static final String EMAIL = dotenv.get("EMAIL") != null ? dotenv.get("EMAIL") : System.getenv("EMAIL");

    public static final String PASSWORD = dotenv.get("PASSWORD") != null ? dotenv.get("PASSWORD") : System.getenv("PASSWORD");

}
