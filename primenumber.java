import java.util.Scanner;

public class primenumber{

    public static int primenumbers(int number){

        int count = 0;
        if (number == 0 || number == 1){

            count = 1;
        }
        else {

            for (int i = 2; i <= number/2; i++){ 

                if(number % i == 0) {

                    count = 1;
                    break;
    
                }
            }
        }
        return count;
    }
    public static void main(String [] args) {

        int count;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        count = primenumbers(number);

        if (count == 0) {

            System.out.println(number+" is a prime number"); 
           
         } else 
            System.out.println(number+" is not a prime number");
 


    }


}