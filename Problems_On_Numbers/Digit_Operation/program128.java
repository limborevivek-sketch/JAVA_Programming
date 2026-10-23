import java.util.Scanner;
class Digit
{
    public int SumDgit(int iNo)
    {
        
    
        int iSum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0){
              
            iSum = iSum + (iNo % 10);        
            iNo = iNo/10;                           
            

        }

        return iSum;
    }
}

class program128
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter Number = ");
        
        int iValue = 0;
        iValue = scanner.nextInt();

         Digit digit = new Digit();
         
        iRet = digit.SumDgit(iValue);

        System.out.println("Number of Digits : "+iRet);
    }
}