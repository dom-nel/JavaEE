import java.sql.*;
import java.io.*;

public class DBConnect2
{
   public static void main(String[] args)
   {
      try
      {
         // 1. create the connection to the database
         Class.forName("org.postgresql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/IceCreamDemo", "postgres", "Doughboy33!");
         System.out.println("Connected to the database successfully!");
         // 2. check to see if the database table exists, if so, drop the table
         dropTable(conn);
         
         // 3. build (or rebuild) the IceCream table and add rows
         buildIceCreamTable(conn);
         
         // 4. display all of the rows of data from the ice cream table
         displayAllRows(conn);
         
         // 5. calculate the total cost of all of the ice cream in the database table
         totalIceCreamCost(conn);
         // 6. close the connection
         
      }
      catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }
   }//end main method
   
   /*
      dropTable method drops existing IceCream table, in case the database table already exist
   */
   public static void dropTable(Connection conn)
   {
       // message to check for tables
       System.out.println("Checking for existing IceCream table in the IceCream Database...");
       
       try
       {
         // statement object 
         Statement stmt = conn.createStatement();
         
         // execute statement to drop the table 
         //use DROP TABLE IF EXIST to drop a postgres table
         stmt.execute("DROP TABLE IF EXISTS IceCream");
         // print confirmation message that the table was dropped 
         System.out.println("IceCream table dropped");
       }
       catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }
   } // end dropTable method
   
   // method to build the IceCream table 
   public static void buildIceCreamTable(Connection conn)
   {
      // message to attempt to build the IceCream table
       System.out.println("Building the IceCream table in the IceCream Database...");
       
       try
       {
         // statement object 
         Statement stmt = conn.createStatement();
         
         // 1. create the table
         /*
            SQL Syntax to create a table:
               CREATE TABLE 'tableName' (fieldName dataType, fieldName dataType(size (if not numerical)), etc)
         */
         stmt.execute("CREATE TABLE IceCream (iceCreamID Serial PRIMARY KEY," +
                     "flavor VARCHAR, " +
                     "cost DECIMAL);");
                     
         // 2. add rows to the table
         /*
            SQL Syntax to insert a row into a table:
            INSERT INTO 'tableName' (fields, fields, etc.) VALUES(fieldValue, fieldValue,etc.)
        */
         stmt.execute("INSERT INTO IceCream (flavor, cost) VALUES ('Vanilla', 0.55);");
         stmt.execute("INSERT INTO IceCream (flavor, cost) VALUES ('Chocalate', 0.60);");
         stmt.execute("INSERT INTO IceCream (flavor, cost) VALUES ('Strawberry', 0.55);");
         
         // once the rows are inserted into the table, give a successful message
         System.out.println("IceCream table created.");
       }
       catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }


   }// end buildIceCreamTable method
   
   // method to display the rows from the table
   public static void displayAllRows(Connection conn)
   {
      // message to attempt to build the IceCream table
       System.out.println("Displaying all rows in the IceCream table in the IceCream Database...");

      try
      {
         
         // statement object 
         Statement stmt = conn.createStatement();
         
         //SQL statement to execute the query
         String sqlStatement = "SELECT * FROM IceCream;";
         
         // Statement to be sent to the DBMS
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         //Display the results of the query
         while(result.next())
         {
         System.out.println("Hello World");
            //System.out.println(result.getInt("iceCreamID"));
            //System.out.println(result.getString("flavor"));
            //System.out.println(result.getDouble("cost"));
           //System.out.println();
           System.out.printf("%d \t %s \t\t $%.2f \n", result.getInt("iceCreamID"), result.getString("flavor"), result.getDouble("cost"));
            
         }
         
         

      }
      catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }

   }//end displayAllRows method
   
   // method to display the total ice cream cost 
   public static void totalIceCreamCost(Connection conn)
   {
      // give message for the query
      System.out.print("\nTotal Ice Cream Cost: ");
      
      try
      {
         // statement object 
         Statement stmt = conn.createStatement();
         
         //SQL statement to execute the query
         String sqlStatement = "SELECT SUM(cost) FROM IceCream;";
         
         //Statement to be sent to the DBMS
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // display results of the query
         result.next(); //call .next method to get the result from the result set
         System.out.printf("$%.2f \n", result.getDouble(1));
      }
      catch(Exception e)
      {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
      }
   }
}