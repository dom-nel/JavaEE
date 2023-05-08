// a class that represents a user-defined exception
public class ApartmentException extends Exception
{
   public ApartmentException()
   {
      System.out.println("MyException Was Caught!!");
      System.out.println("Operation unsuccessful");
   }

   public ApartmentException(String s)
   {
      // call constructor of parent Exception
      super(s);
   }
}