package datastructure;

import java.io.*;

public class Instructor {


    
    String FirstName;
    String LastName;
    String InstructorID;
    
    public static void main(String[] args) throws IOException {
     
    
    }
  

 
    
    //SettersAndGetters
    public  String getLastName()  {
        return LastName;
    }

    public void setLastName(String LastName) {  
        this.LastName = LastName;
    }
    
    public String getFirstName(){ 
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getInstructorID() {
        return InstructorID;
    }

    public void setInstructorID(String InstructorID) {
        this.InstructorID = InstructorID;
    }
    
   
}