import java.sql.*;
import java.io.*;

public class DBConnect1
{
  public static void main(String[] args)
   {
      try
      {
         // 1. create the connection to the database
         Class.forName("org.postgresql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/IceCreamDemo", "postgres", "Dougboy33!");
         System.out.println("Connected to the database successfully!");
         // 2. check to see if the database table exists, if so, drop the table
         
         // 3. build (or rebuild) the IceCream table and add rows
         
         // 4. display all of the rows of data from the ice cream table
         
         // 5. calculate the total cost of all of the ice cream in the database table
         
         // 6. close the connection
      }
      catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }
   }
}