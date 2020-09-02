public class SeniorDeveloper extends Developer{
    private double salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private int advanceSalary;
    public boolean appointed;
    public boolean terminated;
    
    public SeniorDeveloper(String platform, String interviewerName, int workingHour, double salary, int contractPeriod){
        super(platform, interviewerName, workingHour);
        this.salary=salary;
        this.advanceSalary=0;
        this.contractPeriod=contractPeriod;
        this.joiningDate="";
        this.staffRoomNumber="";
        this.appointed=false;
        this.terminated=false;
       
    }
    
    public int getContractPeriod(){
        return contractPeriod;
    }
    public int getAdvanceSalary(){
        return advanceSalary;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getStaffRoomNumber(){
        return staffRoomNumber;
    }
    public boolean getAppointed(){
        return appointed;
    }
    public boolean getTerminated(){
        return terminated;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    public void setContractPeriod(int contractPeriod){
        this.contractPeriod=contractPeriod;
    }
    public void hire(String developerName, String joiningDate, int advanceSalary, String staffRoomNumber){
        if (appointed==true){
            System.out.println("Developer is already Hired");
            System.out.println("Name of Developer: "+getDeveloperName());
            System.out.println("Room Number: "+getStaffRoomNumber());
        }else{
            setDeveloperName(developerName);
            this.advanceSalary=advanceSalary;
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            this.appointed=true;
            System.out.println("Senior Developer is appointed");
        }
       
    }
    public void print(){
    System.out.println("Name of the Interviewer: "+getInterviewerName());
    System.out.println("Platform: "+getPlatform());
    System.out.println("Developer Name: "+getDeveloperName());
    }
    public void termination(){
        if (terminated==true){
            System.out.println("Previous developer is already terminated, you can now hire new developer");
        }else{
            developerName="";
            advanceSalary=0;
            joiningDate="";
            appointed=false;
            terminated=true;
        }
    }
    public void display(){
        super.display();
        System.out.println("Joined Date: "+joiningDate);
        System.out.println("Advance Salary: "+advanceSalary);
        System.out.println("Staff Room Number: "+staffRoomNumber);
    }
        
}    