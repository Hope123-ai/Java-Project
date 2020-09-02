public class Developer{
    public String platform;
    public String interviewerName;
    public String developerName;
    public int workingHour;
    public Developer(String platform, String interviewerName, int workingHour){
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.developerName="";
        this.workingHour=workingHour;
    }
    //setting the developer value
    public void setDeveloperName(String developerName){
    this.developerName=developerName;
    } 
    public String getPlatform(){
    return platform;
    }
    public String getInterviewerName(){
    return interviewerName;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public String getDeveloperName(){
        return developerName;
    }
    public void display(){
        System.out.println("Platform Name: "+platform);
        System.out.println("Name of the Interviewer: "+interviewerName);
        System.out.println("Name of Developer: "+developerName);
        
        
        System.out.println("Total Working Hour: "+workingHour);
    }
}