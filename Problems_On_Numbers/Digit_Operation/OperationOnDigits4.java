public class OperationOnDigits4
{
    static void DisplayDigit()
    {
        int iNo = 1345700;

        System.out.println("Actual Number is = " + iNo);

        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Number is = " + iNo);
        System.out.println(iNo % 10);
        iNo = iNo / 10;

        System.out.println("Final Value is = " + iNo);
    }

    public static void main(String[] args)
    {
        DisplayDigit();
    }
}