package rythmProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Exercise {
	
	@BeforeMethod
    public void beforeEachTestMethod(){
		
        //May perform some initialization/setup before each test.
        //E.g. Initializing User whose properties may be altered by actual @Test
        System.out.println("\n@BeforeMethod:  run before each test method. Test to be executed is : ");
    }
	
	@Test
	public void LongestWordLength() {
         String words= "The cow jumped over the moon";
         String s="jumped";
         String [] word = words.split(" ");
         String maxlengthWord = "";
    for(int i = 0; i < word.length; i++){
      if(word[i].length() >= maxlengthWord.length()){
    	  maxlengthWord = word[i];
      } 
   }
       System.out.println("Length is :" + s.length());
       System.out.println("Maximum length word is :" +maxlengthWord); 
        
      
    } 
	 @AfterMethod
	    public void afterEachTestMethod(){
	        //May perform cleanup of initialization/setup after each test.
	        System.out.println("@AfterMethod:  run after each test method. Test just executed ");
	    }
}
 
	
  

