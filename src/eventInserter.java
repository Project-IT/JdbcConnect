import java.sql.*;

/**
 * Created by jeppe on 2017-04-28.
 */
public class eventInserter {
    protected PreparedStatement ps=null;
    public void insert(dbParameters dbInfo) {
        if (dbInfo.verifyParameters()) {
            try {
                Connection myConn = DriverManager.getConnection(dbInfo.getDbUrl(), dbInfo.getUser(), dbInfo.getPassword());
                //Statement myStm = myConn.createStatement();

                ps = myConn.prepareStatement(dbInfo.getInsertQuery());
                ps.setString(1,  dbInfo.getAll_day());
                ps.setString(2,  dbInfo.getCreated());
                ps.setString(3,  dbInfo.getDescription());
                ps.setString(4,  dbInfo.getEnd());
                ps.setString(5,  dbInfo.getLast_modified());
                ps.setString(6,  dbInfo.getLocation());
                ps.setString(7,  dbInfo.getOrganiser());
                ps.setInt   (8,  dbInfo.getRecurrence_id_timestamp());
                ps.setString(9,  dbInfo.getRecurrence_rule());
                ps.setString(10, dbInfo.getReminder_setting_id());
                ps.setString(11, dbInfo.getSequence());
                ps.setString(12, dbInfo.getStart());
                ps.setString(13, dbInfo.getSub_calendar_id());
                ps.setString(14, dbInfo.getSummary());
                ps.setString(15, dbInfo.getUrl());
                ps.setString(16, dbInfo.getUtc_end());
                ps.setString(17, dbInfo.getUtc_start());
                ps.setString(18, dbInfo.getVevent_uid());
                System.out.println(ps.toString());
                ps.executeUpdate();
                myConn.close();
            } catch (Exception exc) {
                exc.printStackTrace();
            }

        }
    }
}
