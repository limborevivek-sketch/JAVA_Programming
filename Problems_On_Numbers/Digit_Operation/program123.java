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

class program123
{
    public static void main(String[] args) 
    {
         Digit digit = new Digit();
         
         digit.displayDigit(9752);
    }
}