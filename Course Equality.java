//equality and object copying practice problem
//returns true if the department and course number are the same value
//yay this works!! 
//fix indentation

public class Course {
    private String department;
    private String courseNum; 
    private int enrollment; 
    Course(String dep, String course, int enroll) {
    //assert (department != null) && (courseNum != null) && (enrollment >= 0)
    //: "Department and course number cannot be null. Enrollment cannot be negative."; 
        this.department = dep; 
        this.courseNum = course;
        this.enrollment = enroll; 
    }
    
    public int hashCode() {
        return 0; 
    }
  
  @Override 
  public boolean equals(Object o) {
    if (o == null) {
      return false; 
    }
    //assert o != null : "The object cannot be null"; 
    if (o instanceof Course c) {
      if (c.department.equals(this.department) && c.courseNum.equals(this.courseNum)) {
        return true; 
      }
    }
    return false; 
  }

}

Course c1 = new Course("CS", "124", 24);  
Course c2 = new Course("CS", "124", 23); 
Course c3 = new Course("CS", "125", 24); 
//Course c4 = null; 