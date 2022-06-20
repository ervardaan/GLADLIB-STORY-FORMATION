
/**
 * Write a description of max_counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.ArrayList;
public class max_counter {
private ArrayList<String> myWords;
private ArrayList<Integer> myFreqs;
max_counter()
{
    myWords=new ArrayList<String>();
    myFreqs=new ArrayList<Integer>();
}

public void findUnique()
{
    myWords.clear();
    myFreqs.clear();
    FileResource fr=new FileResource();
    for(String s:fr.words())
    {
        /* either lowercase or uppercase will count as one word*/
        
        if(! myWords.contains(s))
        {
            myWords.add(s);
            myFreqs.add(1);
        }
        else
        {
            int c=myWords.indexOf(s);
            int counter=myFreqs.get(c);
            myFreqs.set(c,counter+1);
        }
}
for(int i=0;i<myWords.size();i++)
{
    System.out.println(myWords.get(i)+" "+myFreqs.get(i));
}
System.out.println(myWords.size()+" "+myFreqs.size());

}
public void testfindUnique()
{
    findUnique();
    int index=findmaxindex();
    System.out.println(myWords.get(index) +" "+myFreqs.get(index));
}
public int findmaxindex()
{
    int l=0;String w="";
    for(int i:myFreqs)
    {
        if(myFreqs.get(l)<myFreqs.get(i))
        {
            l=i;w=myWords.get(l);
        }
            
}
return l;
}
}
