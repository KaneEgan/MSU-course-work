/*
   Student and Grade Item inputs for MSU Denver Program.
   @author Kane Egan
   Project #1, CS 2050
   IDE:jGRASP 
   
   Complaciency: 
*/

public class Student{

   private String id;
   private String firstName;
   private String lastName;
   private String emailAddress;
   
   
   public Student (String id, String firstName, String lastName,
                  String emailAddress){
                  
      if ((id == null) || ( id.length() == 0)) {
         throw new IllegalArgumentException("Student ID is not correct or blank");
      }
      
      if ((firstName == null) || ( firstName.length() == 0)) {
         throw new IllegalArgumentException("First name is not correct or blank");
      }
      
      if ((lastName == null) || (lastName.length() == 0)) {
         throw new IllegalArgumentException("Last name is not correct or blank");
      }
   
      if ((emailAddress == null) || (emailAddress.length() == 0)) {
         throw new IllegalArgumentException("Last name is not correct or blank");
      }
      
      if (!(emailAddress.contains("@"))) {
         throw new IllegalArgumentException("Email does not contain @");
      }   
      
   }   

   
   // *************************************************************************
   
   public boolean equals (Student other) {
      
      if ((id.equals(other.id)) && (firstName.equals(other.firstName)) &&
         (lastName.equals(other.lastName)) && 
         (emailAddress.equals(other.emailAddress))) {
         
         return true;
      }
      
      else {
         
         return false;
      }
   }
   
   // *************************************************************************
   
   public String getId() {
      return id;
   }
   
   // *************************************************************************
      
   public String getFirstName() {
      return firstName;
   }
   
   // *************************************************************************
   
   public String getLastName() {
      return lastName;
   }
   
   // *************************************************************************
   
   public String getEmailAddress() {
      return emailAddress;
   }
   
   // *************************************************************************
   
   public String toString() {
      String studentString = "";
   
      return studentString;
   }
}
