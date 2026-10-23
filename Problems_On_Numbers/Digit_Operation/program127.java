import java.util.Scanner;
class Digit
{
    public int CountDigit(int iNo)
    {
        int iCount = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0){
                     
            iNo = iNo/10;                           
            iCount++;

        }
       return iCount;
    }
}

class program127
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter Number = ");
        
        int iValue = 0;
        iValue = scanner.nextInt();

         Digit digit = new Digit();
         
        iRet = digit.CountDigit(iValue);
        System.out.println("Number of Digits : "+iRet);
    }
}