import java.sql.*;

/**
 * Created by jeppe on 2017-04-28.
 */
public class dbParameters {
    protected final String TABLENAME="confluence.ao_950dc3_tc_events";
    protected String DbDriver="jdbc:mysql://";

    protected String dbUrl=     null;
    protected String user=      null;
    protected String password=  null;

    protected String insertQuery="INSERT INTO " + TABLENAME +
            " (ALL_DAY, CREATED, DESCRIPTION, END, LAST_MODIFIED, LOCATION, ORGANISER, RECURRENCE_ID_TIMESTAMP, RECURRENCE_RULE, REMINDER_SETTING_ID, SEQUENCE, START, SUB_CALENDAR_ID, SUMMARY, URL, UTC_END, UTC_START, VEVENT_UID)" +
            " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    protected String all_day=                null;
    protected String created=                null;
    protected String description=            null;
    protected String end=                    null;
    protected String last_modified=          null;
    protected String location=               null;
    protected String organiser=              null;
    protected int    recurrence_id_timestamp=0;
    protected String recurrence_rule=        null;
    protected String reminder_setting_id=    null;
    protected String sequence=               null;
    protected String start=                  null;
    protected String sub_calendar_id=        null;
    protected String summary=                null;
    protected String url=                    null;
    protected String utc_end=                null;
    protected String utc_start=              null;
    protected String vevent_uid=             null;

    //defensive method to check the input. What do we need here?
    public boolean verifyParameters(){

        if(dbUrl==null)                  return false;
        if(user==null)                   return false;
        if(password==null)               return false;
        if(all_day==null)                return false;
        if(created==null)                return false;
        if(description==null)            return false;
        if(end==null)                    return false;
        if(last_modified==null)          return false;
        if(location==null)               return false;
        if(organiser==null)              return false;
        //if(recurrence_id_timestamp==1337)return false;
        if(recurrence_rule==null)        return false;
        if(reminder_setting_id==null)    return false;
        if(sequence==null)               return false;
        if(sub_calendar_id==null)        return false;
        if(summary==null)                return false;
        if(url==null)                    return false;
        if(utc_end==null)                return false;
        if(utc_start==null)              return false;
        if(vevent_uid==null)             return false;

        //Testing connection
        try{
            Connection myConn = DriverManager.getConnection(dbUrl, user, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }


    public void setDbDriver(String s){
        this.DbDriver=s;
    }
    public void setdbUrl(String s){
        this.dbUrl=DbDriver + s;
    }
    public void setPassword(String s){
        this.password=s;
    }
    public void setUser(String s){
        this.user=s;
    }
    public void setAll_day(String s){
        this.all_day=s;
    }
    public void setCreated(String s){
        this.created=s;
    }
    public void setDescription(String s){
        this.description=s;
    }
    public void setEnd(String s){
        this.end=s;
    }
    public void setLast_modified(String s){
        this.last_modified=s;
    }
    public void setLocation(String s){
        this.location=s;
    }
    public void setOrganiser(String s){
        this.organiser=s;
    }
    public void setRecurrence_id_timestamp(int i){
        this.recurrence_id_timestamp=i;
    }
    public void setRecurrence_rule(String s){
        this.recurrence_rule=s;
    }
    public void setReminder_setting_id(String s){
        this.reminder_setting_id=s;
    }
    public void setSequence(String s){
        this.sequence=s;
    }
    public void setStart(String s){
        this.start=s;
    }
    public void setSub_calendar_id(String s){
        this.sub_calendar_id=s;
    }
    public void setSummary(String s){
        this.summary=s;
    }
    public void setUrl(String s){
        this.url=s;
    }
    public void setUtc_end(String s){
        this.utc_end=s;
    }
    public void setUtc_start(String s){
        this.utc_start=s;
    }
    public void setVevent_uid(String s){
        this.vevent_uid=s;
    }

    public String getInsertQuery(){
        return insertQuery;
    }
    public String getDbDriver(){
        return DbDriver;
    }
    public String getDbUrl(){
        return dbUrl;
    }
    public String getPassword(){
        return password;
    }
    public String getUser(){
        return user;
    }
    public String getAll_day(){
        return all_day;
    }
    public String getCreated(){
        return created;
    }
    public String getDescription(){
        return description;
    }
    public String getEnd(){
        return end;
    }
    public String getLast_modified(){
        return last_modified;
    }
    public String getLocation(){
        return location;
    }
    public String getOrganiser(){
        return organiser;
    }
    public int getRecurrence_id_timestamp(){
        return recurrence_id_timestamp;
    }
    public String getRecurrence_rule(){
        return recurrence_rule;
    }
    public String getReminder_setting_id(){
        return reminder_setting_id;
    }
    public String getSequence(){
        return sequence;
    }
    public String getStart(){
        return start;
    }
    public String getSub_calendar_id(){
        return sub_calendar_id;
    }
    public String getSummary(){
        return summary;
    }
    public String getUrl(){
        return url;
    }
    public String getUtc_end(){
        return utc_end;
    }
    public String getUtc_start(){
        return utc_start;
    }
    public String getVevent_uid(){
        return vevent_uid;
    }
}
