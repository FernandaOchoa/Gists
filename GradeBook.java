public class GradeBook{
	private String courseName;

	//Instance instructor's name
	private String courseInstructor;
	
	//Add second param for instructor
	public GradeBook(String name, String instructor){
	  courseName = name;
	  courseInstructor= instructor;
	}
	
	public void setCourseName(String name){
	  courseName = name;
	}
	

	public void getCourseName(){
	  return courseName;
	}

	//Add setters and getters for instructor's name
	public void setCourseInstructor(String instructor){
	  courseInstructor = instructor;
	}
	

	public void getCourseInstructor(){
	  return courseInstructor;
	}

	
	public void displayMessage(){
	 System.out.printf("Welcome to the grade su chingadamadre for \n",getCourseName(),"y el chingado instructor is: ",getInstructor);
	}
}