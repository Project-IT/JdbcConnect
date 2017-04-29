/**
 * Created by jeppe on 2017-02-18.
 */

public class Driver {
    public static void main(String args[]) {
            eventParameters dbp=new eventParameters();

            dbp.setUser("tcomkproj2017");
            dbp.setPassword("tcomkproj2017");
            dbp.setdbUrl("localhost:3306/confluence");
            dbp.setAll_day("1");                //all day 1
            dbp.setCreated("1493235152154");   //created
            dbp.setDescription("");                //description
            dbp.setEnd("1493251200000");   //End
            dbp.setLast_modified("1493251200000");   //Last_Modified
            dbp.setLocation("");      //Location
            dbp.setOrganiser("4028b8815babae10015babb056780000");//Organiser
            dbp.setRecurrence_id_timestamp(0);            //rec. Id Timestamp
            dbp.setRecurrence_rule("");            //Rec. Rule
            dbp.setReminder_setting_id("");           //Reminder_SETTING_ID
            dbp.setSequence("0");              //SEQUENCE
            dbp.setStart("1493164800000");  //START
            dbp.setSub_calendar_id("dfa1eb25-ef12-42c8-abcf-71dec96b58ac");//SUB_CALENDAR_ID
            dbp.setSummary("messagetobereceived");                //SUMMARY
            dbp.setUrl("NULL");           //URL
            dbp.setUtc_end("1493244000000");  //UTC_END
            dbp.setUtc_start("1493157600000");  //UTC_START
            dbp.setVevent_uid("20170426T193232Z--2091550207@localhost");//VEVENT UID
            //System.out.println("INSERT INTO confluence.ao_950dc3_tc_events (ALL_DAY, CREATED, DESCRIPTION, END, LAST_MODIFIED, LOCATION, ORGANISER, RECURRENCE_ID_TIMESTAMP, RECURRENCE_RULE, REMINDER_SETTING_ID, SEQUENCE, START, SUB_CALENDAR_ID, SUMMARY, URL, UTC_END, UTC_START, VEVENT_UID) VALUES ('1', '1493380314777', '', '1492646400000', '1493380314777', '', '4028b8815babae10015babb056780000', NULL, NULL, NULL, '0', '1492560000000', 'dfa1eb25-ef12-42c8-abcf-71dec96b58ac', '"+trying+"', NULL, '1492639200000', '1492552800000', '20170428T115154Z--510219566@130.229.188.219')");

            eventInserter ei=new eventInserter();
            ei.insert(dbp);
    }
}

