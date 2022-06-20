
/**
 * Write a description of genefinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import edu.duke.*;
import java.util.*;
public class genefinder {
private HashMap<String,Integer> hm1;
public genefinder()
{
    hm1=new HashMap<String,Integer>();
}
public void buildCodonMap(int Start,String dna)
{
    hm1.clear();
    for(int i=Start;i<dna.length();i+=3)
    {
        String g=dna.substring(Start,i+3);
        if(hm1.containsKey(g))
        {
            hm1.put(g,hm1.get(g)+1);
        }else{
            hm1.put(g,1);
        }}
        System.out.println(hm1);
    }
}
        
