package Template;

import java.util.Scanner;

public class TemplatePatternDemo {  
	  
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Game name:");
          String cls=sc.nextLine();
         Class c=Class.forName(cls);  
         Game game=(Game) c.newInstance();  
         game.play();     
       }  
}