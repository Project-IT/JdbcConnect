/**
 * Created by jeppe on 2017-02-18.
 */
import java.sql.*;
public class Driver {
    public static void main(String args[]) {
        try {
            //1. Get connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/confluence", "root", "projit");
            //2. Create a statement
            Statement myStm = myConn.createStatement();
            //3. Execute sql query
            //ResultSet myRs = myStm.executeQuery("SELECT * FROM confluence.ao_950dc3_tc_events;");
            myStm.executeUpdate("INSERT INTO confluence.ao_950dc3_tc_events (ALL_DAY, CREATED, DESCRIPTION, END, ID, LAST_MODIFIED, LOCATION, ORGANISER, RECURRENCE_ID_TIMESTAMP, RECURRENCE_RULE, REMINDER_SETTING_ID, SEQUENCE, START, SUB_CALENDAR_ID, SUMMARY, URL, UTC_END, UTC_START, VEVENT_UID)\n" +
                    "VALUES ('1', '1493235152154', '', '1493251200000', '5', '1493235152154', '', '4028b8815babae10015babb056780000', NULL, NULL, NULL, '0', '1493164800000', 'dfa1eb25-ef12-42c8-abcf-71dec96b58ac', 'Java-pushed event', NULL, '1493244000000', '1493157600000', '20170426T193232Z--2091550207@localhost')");

            /*while (myRs.next()) {
                System.out.println(myRs.getString("SUMMARY"));
                //see sql queries for more info
            }*/
            myConn.close(); //closing connection

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}

