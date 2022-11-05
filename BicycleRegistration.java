class BicycleRegistration{
   public static void main(String[]args){
       Bicycle bike3,bike4;
       String owner3,owner4;
    
       bike3 =new Bicycle(); //Create and assign values to bike3
       bike3.setOwnerName("Adam Smith");
    
       bike4 = new Bicycle(); //Create and assing values to bike4
       bike4.setOwnerName("Ben Jones");
       //Output the information
       owner1 = bike3.getOwnerName( );
       owner2 = bike4.getOwnerName( );
       system.out.println(owner1 + " owns a bicycle.");
       system.out.println9owner2 + " also owns a bicycle.");
   }
}  
