/**
 * ConfluenceCreated by jeppe on 2017-04-29.
 */
public class ConfluenceDescription extends ConfluenceEventProperty{
    protected String description=null;
    public void set(String s){
        if(verify(s))this.description=s;
    }
    public String toString(){
        return description;
    }

    public boolean verify(){
        //verify the input
        if(description!=null)return true;
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
        return description.toString();
    }
}
