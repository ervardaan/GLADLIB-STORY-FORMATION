
/**
 * Write a description of CharactersInPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.ArrayList;
public class CharactersInPlay {
private ArrayList<String> namech;
private ArrayList<Integer> namecount;
CharactersInPlay()
{
    namech=new ArrayList<String>();
    namecount=new ArrayList<Integer>();
}
public void update(String person)
{
    if(! namech.contains(person))
    {
        namech.add(person);
        namecount.add(1);
    }
    else{
        int n=namech.indexOf(person);
        int counter=namecount.get(n);
        namecount.set(n,1+counter);
    }
}
/* PROBLEM FLAWS-
 * IN OUR PROGRAM,IF CHARACTER 1 HAS 5 LINES OF SPEECH AND ONLY THE LAST LINE HAS A FULL STOP,THEN ONLY THE LAST LINE IS CONSIDERED A SPEAKING LINE WHILE OTHR ABOVE 4 LINES WHICH MIGHT CONTAIN NO PUNCTUATION OR OTHER PUNCTUATIONS,
 * WILL NOT BE CONSIDERED SPEAKING LINES
 */        
  
public void findAllCharacters()
{
    namech.clear();
  namecount.clear();
  FileResource fr=new FileResource();
  for(String s:fr.lines())
  {
      int c=s.indexOf('.');
      if(c!=-1)
      {
          
      String name=s.substring(0,c);
      update(name);
    }
    }
    for(int j=0;j<namech.size();j++)
    {
        System.out.println(namech.get(j)+" "+namecount.get(j));
    }
}
}
