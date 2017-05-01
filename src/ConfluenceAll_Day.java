/**
 * ConfluenceCreated by jeppe on 2017-04-29.
 */
public class ConfluenceAll_Day extends ConfluenceEventProperty{
    protected String all_day=null;
    public void set(String s){
        if(verify(s))this.all_day=s;
    }
    public String toString(){
        return all_day;
    }

    public boolean verify(){
        //verify the input
        if(all_day!=null)return true;
        return false;
    }
    public boolean verify(String s){
        //verify the input
        if(s!=null)return true;
        return false;
    }
    public String convertToOutlookFormat(){
        //Should return an Outlook Format Event of the same type
        //how to convert?
        return all_day.toString();
    }


}
