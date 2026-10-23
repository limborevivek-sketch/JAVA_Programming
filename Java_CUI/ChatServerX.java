import java.io.*;
import java.net.*;

public class ChatServerX
{
    public static void main(String[] args) 
    {
        try{
       ServerSocket ssobj = new ServerSocket(5100);
       System.out.println("Server is running at port number 5100");
       Socket sobj = ssobj.accept();
       System.out.println("Client Request gets Accepted Successfully");

       PrintStream pobj = new PrintStream(sobj.getOutputStream());          
       BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
       BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Marvellous Server is running");
       String str1 = null, str2 = null;

       while((str1 = bobj1.readLine()) != null)
       {
            System.out.println("Client Says : "+ str1);
            System.out.println("Enter Message For Client : ");
            str1 = bobj2.readLine();
            pobj.println(str2);
       }
    
            pobj.close();
            bobj1.close();
            bobj2.close();
            sobj.close();
            ssobj.close();
    }//end of try
     catch(Exception eobj)
     {
        System.out.printf("eobj");
     }//end of catch
    }//end of main
}//end of class