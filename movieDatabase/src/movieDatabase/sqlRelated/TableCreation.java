package movieDatabase.sqlRelated;

import movieDatabase.databaseRelated.*;

public class TableCreation {

    public static void createTable(String s) {

    DatabaseConnection.getInstance().connect();
    DatabaseConnection.getInstance().stringSender(s);

    }
}