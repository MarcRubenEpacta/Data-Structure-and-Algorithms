
package datastructure;


public class Students {
    
    //Data Types
    public String StudentFirstName;
    public String StudentLastName;
    public String StudentID
;    
    
    
    public static void main(String[] args) {
       
        
        
    }
  
    //SettersAndGetters
    public String getLastName() {
        return StudentLastName;
    }

    public void setLastName(String LastName) {
        this.StudentLastName = LastName;
    }
    
    public String getFirstName() {
        return StudentFirstName;
    }

   
    public void setFirstName(String FirstName) {
        this.StudentFirstName = FirstName;
    }

    public String getInstructorID() {
        return StudentID;
    }

    public void setInstructorID(String InstructorID) {
        this.StudentID = InstructorID;
    }

    
    
}
