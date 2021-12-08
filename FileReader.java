import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Write a description of class FileIO here.
 *
 * @author Anwarul Patwary
 * @version (a version number or a date)
 */
public class FileReader
{
 
    private String fileName;
    private ArrayList<String> lines; 
   

    /**
     * Constructor for objects of class FileIO
     */
    public FileReader(String fileName)
    {

        this.fileName = fileName;
          try{ 
              FileInputStream fileStream = new FileInputStream(fileName);
              BufferedReader input = new BufferedReader(new InputStreamReader(fileStream));
              lines = new ArrayList<String>();
          while (input.ready()) {
              
              lines.add(input.readLine());
            
          }  
          
        }catch(Exception e) {
        System.out.println("The File : " +fileName+ "could not find or error reading");
        }
        
   
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
 
    public ArrayList<String> getLines(){
    return lines; 
    }
    
}
