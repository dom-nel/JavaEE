public class Apartment extends Exception {
   private String address;
   private String aptNum;
   private int numOfBedrooms;
   private int rentValue;
   
   Apartment(String address, String aptNum, int numOfBedrooms, int rentValue){
   this.address = address;
   this.aptNum = aptNum;
   this.numOfBedrooms = numOfBedrooms;
   this.rentValue = rentValue;
   }
   
   //getters
   
   /*
      @return address returns the street address
   */
   public String getAddress(){
      return address;
   }
   
   /*
      @return aptNum returns the apartment number
   */
   public String getAptNum(){
      return aptNum;
   }
   
   /*
      @return numOfBedrooms returns the number of bedrooms
   */
   public String getNumOfBedrooms(){
      return numOfBedrooms;
   }
   
   /*
      @return rentValue returns the rent value
   */
   public String getRentValue(){
      return rentValue;
   }
   
   //setters
   
   /*
      @param address set the street address
   */
   public void setAddress(address){
      this.address = address;
   }
   
   /*
      @param aptNum sets the apartment number
   */
   public void setAptNum(aptNum){
      this.aptNum = aptNum;
   }
   
   /*
      @param numOfBedrooms sets the number of bedrooms
   */
   public void setNumOfBedrooms(numOfBedrooms){
      this.numOfBedrooms = numOfBedrooms;
   }
   
   /*
      @param rentValue sets the rent value
   */
   public void setRentValue(rentValue){
      this.rentValue = rentValue;
   }
   
   public String toString(){
   
   return "Address: " + address + 
          "Apartment Number: " + aptNum + 
          "Number Of Bedrooms: " + numOfBedrooms + 
          "Rent Value: " + rentValue;
   }

}