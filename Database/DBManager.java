package Database;

import java.io.*;
import java.net.ServerSocket;

public class DBManager {
    final String dbpath = "db";

    public DBManager() {
        try {
            new File("db").mkdir();
            ServerSocket socket = new ServerSocket(12);
        } catch (IOException ex) {
            System.out.println("IOExeption in DBManager.Constructor");
        }
    }
}