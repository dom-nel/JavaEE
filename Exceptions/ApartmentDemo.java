import java.util.Scanner;

public class ApartmentDemo{

   public static void main(String[] args) 
   {
      //declare variables to gather user input
      String repeat;
      Scanner keyboard = new Scanner(System.in);
      String address;
      String aptNum;
      int numOfBedrooms;
      int rentValue;
   do
      {
               
         try {      
               
               
               
               //gathers users address
               System.out.println("Enter Address");
               address = keyboard.nextLine();
               
               //gather users apartment number
               System.out.println("Enter Apartment number");
               aptNum = keyboard.nextLine();
               validateAptNum(aptNum);            
               
               //gather users number of bedrooms
               System.out.println("Enter number of Bedrooms");
               numOfBedrooms = keyboard.nextInt();
               validateBedNum(numOfBedrooms);
               
               //gather users rent value      
               System.out.println("Enter rent value");
               rentValue  = keyboard.nextInt();
               validateRentValue(rentValue);
                             
            
               //prints out users information
               System.out.println("\nAddress: " + address +
                                  "\nApartment Number: " + aptNum +
                                  "\nNumber of Bedrooms: " + numOfBedrooms +
                                 "\nRent Value: " + rentValue);
                                 
               //intialize while loop variable to keep the program running
               System.out.print("\nEnter 'y' or 'yes' to continue, anything else to stop: ");
               repeat = keyboard.nextLine();
            }//try end  
          catch(ApartmentException e)
            {
               System.out.println(e.getMessage());
            }//catch end
               System.out.print("Enter 'y' or 'yes' to continue, anything else to stop: ");
               repeat = keyboard.nextLine();

      }while(repeat.equalsIgnoreCase("Y") || repeat.equalsIgnoreCase("Yes"));
    }//main end
   
   
   /*
      @param aptNum users apartment number
   */
   public static void validateAptNum(String aptNum) throws ApartmentException{
            if(aptNum.length() != 3)
               {
                  // if there are not enough characters, throw an exception
                  throw new ApartmentException("Wrong number of characters.");
               }

   }
   
   /*
      @param numOfBedrooms users number of bedrooms
   */
   public static void validateBedNum(int numOfBedrooms) throws ApartmentException{
            if(numOfBedrooms < 1 || numOfBedrooms > 4)
               {
                  // if the number of bedrooms are less than or greater than 4
                  throw new ApartmentException("Wrong number of characters.");
      
               }

   }
   
   /*
      @param rentValue users rent value
   */
   public static void validateRentValue(int rentValue) throws ApartmentException{
            if(rentValue < 500 || rentValue > 2500)
               {
                  // if the rent value is less than 500 or greater than 2500
                  throw new ApartmentException("Wrong number of characters.");
      
               }

   }


   
  }//public class end