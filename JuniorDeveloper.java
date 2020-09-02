public class JuniorDeveloper extends Developer{
    private double salary;
    private String joiningDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String appointedDate;
    private String specialization;
    private String appointedBy;
    public boolean joined;
    public JuniorDeveloper(String platform, String interviewerName, int workingHour, double salary, String appointedBy, String terminationDate){
    super(platform, interviewerName, workingHour);
    this.salary=salary;
    this.appointedBy=appointedBy;
    this.terminationDate=terminationDate;
    this.appointedDate="";
    this.evaluationPeriod="";
    this.specialization="";
    this.joined=false;
    
    }
    public double getSalary(){
        
        return salary;
    }
    public String getAppointedDate(){
        return appointedDate;
    }
    public String getEvaluationPeriod(){
        return evaluationPeriod;
    }
    public String getTerminationDate(){
        return terminationDate;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }
    public void setSalary(double salary){
        if(joined==false){
            this.salary=salary;
        }
        else{
            System.out.println("The developer is already hired");
        }
    
    }
    public void appointDeveloper(String developerName,String appointedBy, String appointedDate,String terminationDate,String specialization){
        if(joined==false){
            super.setDeveloperName(developerName);
            joined=true;
            
            this.appointedBy=appointedBy;
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            
            System.out.println("Junior Developer is appointed");
        }
        else{
            System.out.println("The Developer is already Appointed in "+appointedDate);
        }
    }
    public void display(){
        super.display();
        System.out.println("Interviewer Name: "+interviewerName);
        System.out.println("Platform: "+platform);
        System.out.println("Junior Developer Name: "+developerName);
        System.out.println("Appointed By: "+appointedBy);
        System.out.println("Appointed Date: "+appointedDate);
        System.out.println("Evaluation Period: "+evaluationPeriod);
        System.out.println("Termination Date: "+terminationDate);
    }
    
}