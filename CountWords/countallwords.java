
/**
 * Write a description of countallwords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/* to count all words in a text file-
 * 1)get file as fileresource
 * 2)get all its words as an iterable
 * 3)transfer each word into a storage resource object
 * 4)get size of sr object
 */
import edu.duke.*;
public class countallwords {
public int get_All_words()
{
    FileResource fr=new FileResource();
    StorageResource sr=new StorageResource();
    for(String w:fr.words())
    {
      if(w.startsWith("<") && w.endsWith(">"))
      {
          sr.add(w);  
    }
}
    return sr.size();
}
}


