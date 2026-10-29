import java.util.Scanner;

public class OperationOnDigits8
{
    static int CountDigit(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);

            iNo = iNo / 10;
            iCount++;
        }

        return iCount;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        iRet = CountDigit(iValue);

        System.out.println("Output is of this number : " + iRet);

        sobj.close();
    }
}