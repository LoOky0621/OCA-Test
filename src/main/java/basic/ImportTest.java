package basic;

import java.util.Date;

public class ImportTest {

    public static void main(String[] args) {

        Date now = new Date(); // verwendet das importiere java.until.Date

        java.sql.Date nowSql = new java.sql.Date(System.currentTimeMillis()); // Kann fully qualified verwendet werden

        nowSql.toInstant(); // Instanzmethode
    }
}
