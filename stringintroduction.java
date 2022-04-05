import java.util.*;
import java.util.jar.Attributes.Name;

public  class stringintroduction {
    
 

    public static void main(String[] args) {

        String Name = "Faith";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 2 Cities");
        String City1 = sc.nextLine();
        String City2 = sc.nextLine();

        System.out.println("The Cities are " +City1+ " and " +City2);
        System.out.println("The length of this string is " +City1.length());//Welcome to Capenexis
        System.out.println("The character at index 2 is " +City1.charAt(2));
        System.out.println(City1.concat(City2));
        System.out.println(City2.toUpperCase());//String Name = "Faith"         char initial = 'a' 
        System.out.print(Name+ "in reverse order is: "); 

        char[] temp = Name.toCharArray();

        for ( int i = temp.length - 1; i >= 0; i-- ){

            System.out.print(temp[i]);
        }
        /* equals() e.g City1.equals(City2): It returns true if the Strings are equal
         equalsIgnoreCase: It is case insensitive
         compareTo: City1.compareTo(City2)  
         startsWith: City1.startsWith(D)
         endWith: 
         contains: City1.contains(Cap)
         
         subString:
         substring(beginIndex): e.g City1.subString(4) Cape Town
         substring(beginIndex,endIndex)
         
         */
        System.out.println("");          

         if (City1.compareTo(City2) > 0){

            System.out.println("The cities in Alphabetical order are " +City2+" "+City1);
         } else if (City1.compareTo(City2) < 0){

            System.out.println("The cities in Alphabetical order are " +City1+" "+City2);

         } else if (City1.compareTo(City2) == 0){

            System.out.println("You entered the same city");

         }


        
    }
    


}
