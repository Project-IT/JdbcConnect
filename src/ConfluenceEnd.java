/**
 * ConfluenceCreated by jeppe on 2017-04-29.
 */
public class ConfluenceEnd extends ConfluenceEventProperty{
    protected String end=null;
    public void set(String s){
        if(verify(s))this.end=s;
    }
    public String toString(){
        return end;
    }

    public boolean verify(){
        //verify the input
        if(end!=null)return true;
        return false;
    }
    public boolean verify(String s){
        //verify the input
        if(s!=null)return true;
        return false;
    }
    public String convertToOutlookFormat(){
        //Should return an Outlook Format event of the same type
        //how to convert?
        return end.toString();
    }
}
