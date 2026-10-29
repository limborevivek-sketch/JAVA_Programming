import java.util.Scanner;

public class OperationOnDigits5
{
    static void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        System.out.println("Actual Number is = " + iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println("Number is " + iDigit);
            iNo = iNo / 10;
        }

        System.out.println("Final Value is = " + iNo);
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        DisplayDigit(iValue);

        sobj.close();
    }
}