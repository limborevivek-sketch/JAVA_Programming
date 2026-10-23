import java.util.Scanner;

class Prime
{
    public void CheckPrime(int iNo)
    {
 int iSum = 0, iCount = 0;

 for(iCount = 1; iCount <= iNo/2; iCount++)
 {
    if((iNo % iCount) == 0)
    {
        iSum = iSum + iCount;               // Here iSum should be 1 then only it will move further or else It will give error
    }
 }

  if(iSum == 1)
    {
        System.out.println("Number is prime");
    }
    else
    {
        System.out.println("Number is not prime");
    }
}
}

class Prime_Number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        Prime prime = new Prime();

        prime.CheckPrime(iValue);

    }
}