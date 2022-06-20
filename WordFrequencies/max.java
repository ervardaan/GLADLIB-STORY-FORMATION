
/**
 * Write a description of max here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import edu.duke.*;
public class max {
private ArrayList<String> name;
private ArrayList<Integer> namecount;
max()
{
    name=new ArrayList<String>();
    namecount=new ArrayList<Integer>();
}
public void update()
{
}
public void findallchar()
{
    int cn=0;String n="";
    FileResource fr=new FileResource();
    for(String s:fr.lines())
    {
        if(s.charAt(0)!=' ')//character line
        {
            cn=0;// when every character is found,make counter =0 and then keep on counting the no of dialogues
            int c=s.indexOf('.');
            n=s.substring(0,c);//get name of character
        }
        else
        {
         cn+=1;   //keep adding no of dialogues after one character is encountered
        }
        System.out.println(n+" "+cn);
    }
            
}
}
