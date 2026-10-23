import java.util.Scanner;
class Digit
{
    public void displayDigit(int iNo)
    {
    
        int iDigit = 0;

        while(iNo != 0){
            iDigit = iNo % 10;          
            iNo = iNo/10;                           
            System.out.println(iDigit);

        }
       
    }
}

class program124
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number = ");
        
        int iValue = 0;
        iValue = scanner.nextInt();

         Digit digit = new Digit();
         
         digit.displayDigit(iValue);
    }
}