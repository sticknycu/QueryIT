package ro.nicolaemariusghergu.bootstrap.utils;

import java.io.File;
import java.nio.file.Files;

public class Constants {

    public static String MOVE_ANOTHER_DIRECTORY = "cd";
    public static String MOVE_BACK_DIRECTORY = MOVE_ANOTHER_DIRECTORY + " ../";
    public static String CORE_DIRECTORY = "core/";
    public static String AUTH_DIRECTORY = "auth/";
    public static String DATA_DIRECTORY = "data/";
    public static String BACKEND_DIRECTORY = MOVE_BACK_DIRECTORY + "back-end/";
    public static String FRONTEND_DIRECTORY = MOVE_BACK_DIRECTORY + "front-end/";
    public static String BACKEND_CORE_DIRECTORY = BACKEND_DIRECTORY + CORE_DIRECTORY;
    public static String FRONTEND_CORE_DIRECTORY = FRONTEND_DIRECTORY + CORE_DIRECTORY;
    public static String BACKEND_AUTH_DIRECTORY = BACKEND_DIRECTORY + AUTH_DIRECTORY;
    public static String BACKEND_DATA_DIRECTORY = BACKEND_DIRECTORY + DATA_DIRECTORY;
    public static String FRONTEND_AUTH_DIRECTORY = FRONTEND_DIRECTORY + AUTH_DIRECTORY;
    public static String JAVA_COMMAND_EXECUTED = "mvn clean package";
    public static String MOVE_TARGET_DIRECTORY = MOVE_ANOTHER_DIRECTORY + " target";
    public static String START_DOCKER_COMMAND = "docker-compose up -d";
    public static String AND = " && ";
}
