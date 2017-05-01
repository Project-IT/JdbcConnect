/**
 * ConfluenceCreated by jeppe on 2017-04-29.
 */
public class ConfluenceCreated extends ConfluenceEventProperty{
    protected String created=null;
    public void set(String s){
        if(verify(s))this.created=s;
    }
    public String toString(){
        return created;
    }

    public boolean verify(){
        //verify the input
        if(created!=null)return true;
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
        return created.toString();
    }
}
