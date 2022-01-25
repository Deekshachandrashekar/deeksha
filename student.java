package functionoverload;

public class student {
	
	
	    private int studentId;
	    private String studentName, studentAddress, collegeName;
	    
	    public void Student(int studentId, String studentName, String studentAddress)
	    {
	        this.studentAddress=studentAddress;
	        this.studentName=studentName;
	        this.studentId=studentId;
	        this.collegeName="NIT";
	    }
	    
	    public void Student(int studentId, String studentName, String studentAddress, String collegeName)
	    {
	       
	        this.collegeName=collegeName;
	    }
	    
	    public int getStudentId()
	    {
	        return this.studentId;
	    }
	    
	    public String getStudentName()
	    {
	        return this.studentName;
	    }
	    
	    public String getStudentAddress()
	    {
	        return this.studentAddress;
	    }
	    
	    public String getCollegeName()
	    {
	        return this.collegeName;
	    }
	}
