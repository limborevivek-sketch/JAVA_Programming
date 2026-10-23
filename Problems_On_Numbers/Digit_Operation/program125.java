import java.util.Scanner;
class Digit
{
    public void displayDigit(int iNo)
    {
    
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0){
            iDigit = iNo % 10;          
            iNo = iNo/10;                           
            System.out.println(iDigit);

        }
       
    }
}

class program125
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