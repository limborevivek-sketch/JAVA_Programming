import java.util.Scanner;

public class OperationOnDigits6
{
    static int DisplayDigit(int iNo)
    {
        int iDigit = 0;
        int iOriginal = iNo;

        System.out.println("Actual Number is = " + iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println("Number is " + iDigit);
            iNo = iNo / 10;
        }

        return iOriginal;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        iRet = DisplayDigit(iValue);

        System.out.println("Output is of this number : " + iRet);

        sobj.close();
    }
}