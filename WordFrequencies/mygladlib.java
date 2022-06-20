
/**
 * Write a description of gladlib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.ArrayList;
import java.util.*;
public class mygladlib {
private ArrayList<String> adjective;
private ArrayList<String> animal;
private ArrayList<String> color;
private ArrayList<String> country;
private ArrayList<String> fruit;
private ArrayList<String> noun;
private ArrayList<String> name;
private ArrayList<String> timeframe;
private ArrayList<String> verb;
private Random r;
public ArrayList<String> initializeal(String ss)
{
     ArrayList<String> nn=new ArrayList<String>();
    String fullname="..\\GladLib\\datalong\\"+ss+".txt";
    FileResource fr=new FileResource(fullname);
  nn.clear();
    for(String s:fr.words())
    {
       nn.add(s);
       
    }
    /*
    for(int i=0;i<nn.size();i++)
    {
        System.out.println(nn.get(i));
    }
    */
   return nn;
}
 public mygladlib()
{
   r=new Random(); 
      adjective=initializeal("adjective");
      
    color=initializeal("color");
    
    
    animal=initializeal("animal");
    country=initializeal("country");
    fruit=initializeal("fruit");
    noun=initializeal("noun");
    name=initializeal("name");
    timeframe=initializeal("timeframe");
    verb=initializeal("verb");
    System.out.println(adjective+" "+color+" "+verb);
  
    
   
}
public int randominteger(int leng)
{
    return r.nextInt(leng);
}
public void gettemplate()
{
    FileResource fr1=new FileResource();
    String finals="";
    for(String s:fr1.words())
    {
       int r1=s.indexOf('<');int r2=s.indexOf('>',r1);
       if(r1 !=-1 && r2 !=-1)
       {
           
            System.out.println(s+" "+s.length());
           String w=s.substring(r1+1,r2);//get only word
           System.out.println(w+" "+w.length());
           String rep=getcategory(w);
           finals+=rep;
           
        }
        else
        {
            finals+=s;
        }
        finals+=" ";}
        System.out.println( finals);
    }
           
           
public String getcategory(String ct)
{
    int l=0;int rnd=0;String wd="";
    if(ct=="adjective")
    {
         l=adjective.size();
        rnd=randominteger(l);
        wd=adjective.get(rnd);
    }
    else if(ct=="color")
    {
        l=color.size();
        rnd=randominteger(l);
        wd=color.get(rnd);
    }
    else if(ct=="animal")
    {
        l=animal.size();
        rnd=randominteger(l);
        wd=animal.get(rnd);
    }
    else if(ct=="country")
    {
        l=country.size();
        rnd=randominteger(l);
        wd=country.get(rnd);
    }
     else if(ct=="fruit")
     {
        l=fruit.size();
        rnd=randominteger(l);
        wd=fruit.get(rnd);
    }
    else if(ct=="noun")
    {
        l=noun.size();
        rnd=randominteger(l);
       wd=noun.get(rnd);
        
    }
    else if(ct=="name")
    {
        l=name.size();
        rnd=randominteger(l);
        wd=name.get(rnd);
    }
    else if(ct=="timeframe")
    {
        l=timeframe.size();
        rnd=randominteger(l);
        wd=timeframe.get(rnd);
    }
    else {
        l=verb.size();
        rnd=randominteger(l);
        wd=verb.get(rnd);
    }
    
    return wd;
        
}
}
