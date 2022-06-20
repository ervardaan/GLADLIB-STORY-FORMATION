
/**
 * Write a description of unique_Frequency here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
import java.util.*;

public class unique_Frequency {
public ArrayList<String> getwords()
{
    ArrayList<String> al=new ArrayList<String>();
    FileResource fr=new FileResource();
    for(String w:fr.words())
    {
        if(! al.contains(w.toLowerCase())  || ! al.contains(w.toUpperCase()))
        {
            al.add(w);
        }
    }
    return al;
}
public void tester()
{
    ArrayList<String> s=getwords();
    for(int i=0;i<s.size();i++)
    {
        System.out.println(s.get(i));
    }
    System.out.println(getsizeofarraylist(s));
}
public String getsizeofarraylist(ArrayList<String> al)
{
    Random r=new Random();
    int c=r.nextInt(al.size());
    return al.get(c);
}}
