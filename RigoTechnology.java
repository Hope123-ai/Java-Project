
/**
 * Write a description of class RigoTechnology here.
 *
 * @author Aasha Bhandari
 * @version 1.1
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;


public class RigoTechnology implements ActionListener
{
    
    JFrame frame;
    JLabel lblSenior, lblPlatformSenior, lblInterviewerName, lblSalary, lblWorkingHour, lblContractPeriod, lblDeveloperName, lblJoiningDate, lblAdvanceSalary,lblStaffRoomNo ,lblSeniorPlatformNo;
    JTextField txtPlatformSenior, txtSeniorPlatformno, txtInterviewerName, txtSalary, txtWorkingHour, txtContractPeriod, txtDeveloperName, txtJoiningDate, txtAdvanceSalary,txtStaffRoomNo;
    JLabel lblJunior, lblPlatformJunior, lblInterviewerNameJunior, lblWorkingHourJunior, lblJuniorSalary, lblJuniorTerminationDate,lblDeveloperJunior, lblAppointedBy, lblAppointedDate,  lblTerminationDate, lblSpecilization, lblJuniorPlatformno;
    JTextField txtPlatformJunior, txtInterviewerNameJunior, txtJuniorTerminationDate, txtJuniorSalary, txtWorkingHourJunior, txtDeveloperNameJunior, txtAppointedBy, txtAppointedDate, txtTerminationDate, txtSpecilization, txtJuniorPlatformno;  
    JButton btnAdd, btnHire, btnTerminate , btnDisplay, btnClear;
    JButton btnAddJunior, btnAppointJunior;
    
    ArrayList<Developer> list = new ArrayList<Developer>(); 
    public void appointSystem(){
    frame = new JFrame("Appointment System");
    
    lblSenior=new JLabel("<html><u>Senior Developer</u></html>");
    lblSenior.setBounds(30,-5,290,50);
    lblSenior.setFont (lblSenior.getFont ().deriveFont (16.0f));
    lblSenior.setForeground (Color.blue);
    frame.add(lblSenior);
    
        
    lblPlatformSenior = new JLabel("Platform:");
    lblPlatformSenior.setBounds(30,50,90,20);
    frame.add(lblPlatformSenior);    
    txtPlatformSenior = new JTextField();
    txtPlatformSenior.setBounds(130,50,200,20);
    frame.add(txtPlatformSenior);
    
    lblInterviewerName = new JLabel("Interviewer's Name:");
    lblInterviewerName.setBounds(30,95,120,20);
    frame.add(lblInterviewerName);
    txtInterviewerName = new JTextField();
    txtInterviewerName.setBounds(190,95,450,20);
    frame.add(txtInterviewerName);
    
    lblSalary = new JLabel("Salary:");
    lblSalary.setBounds(30,135,90,20);
    frame.add(lblSalary);
    txtSalary = new JTextField();
    txtSalary.setBounds(120,135,190,20);
    frame.add(txtSalary);
    
    lblWorkingHour = new JLabel("Working Hours:");
    lblWorkingHour.setBounds(380,135,140,20);
    frame.add(lblWorkingHour);
    txtWorkingHour = new JTextField();
    txtWorkingHour.setBounds(490,135,190,20);
    frame.add(txtWorkingHour);
    
    lblContractPeriod = new JLabel("Contract Period:");
    lblContractPeriod.setBounds(30,175,140,20);
    frame.add(lblContractPeriod);
    txtContractPeriod = new JTextField();
    txtContractPeriod.setBounds(120,175,190,20);
    frame.add(txtContractPeriod);
    
    btnAdd= new JButton("Add");
    btnAdd.setBounds(590,175,90,25);
    frame.add(btnAdd); 
    
      
    lblDeveloperName = new JLabel("Developer's Name:");
    lblDeveloperName.setBounds(30,215,140,20);
    frame.add(lblDeveloperName);    
    txtDeveloperName = new JTextField();
    txtDeveloperName.setBounds(190,215,490,20);
    frame.add(txtDeveloperName);

    lblJoiningDate = new JLabel("Joining Date:");
    lblJoiningDate.setBounds(30,255,90,20);
    frame.add(lblJoiningDate);
    txtJoiningDate = new JTextField();
    txtJoiningDate.setBounds(120,255,190,20);
    frame.add(txtJoiningDate);
    
    lblAdvanceSalary = new JLabel("Advance Salary:");
    lblAdvanceSalary.setBounds(380,255,140,20);
    frame.add(lblAdvanceSalary);
    txtAdvanceSalary = new JTextField();
    txtAdvanceSalary.setBounds(490,255,190,20);
    frame.add(txtAdvanceSalary);    
     
    lblStaffRoomNo = new JLabel("Staff Room No:");
    lblStaffRoomNo.setBounds(30,295,90,20);
    frame.add(lblStaffRoomNo);
    txtStaffRoomNo = new JTextField();
    txtStaffRoomNo.setBounds(120,295,120,20);
    frame.add(txtStaffRoomNo);
    
    lblSeniorPlatformNo = new JLabel("Platform No:");
    lblSeniorPlatformNo.setBounds(300,295,90,20);
    frame.add(lblSeniorPlatformNo);
    txtSeniorPlatformno = new JTextField();
    txtSeniorPlatformno.setBounds(380,295,50,20);
    frame.add(txtSeniorPlatformno);
    
    btnHire= new JButton("Hire");
    btnHire.setBounds(500,295,60,25);
    frame.add(btnHire);  
    
    btnTerminate= new JButton("Terminate");
    btnTerminate.setBounds(550,295,100,25);
    frame.add(btnTerminate);
    
    
    
    lblJunior=new JLabel("<html><u>Junior Developer</u></html>");
    lblJunior.setBounds(30,315,290,50);
    lblJunior.setFont (lblSenior.getFont ().deriveFont (16.0f));
    lblJunior.setForeground (Color.blue);
    frame.add(lblJunior);
    
        
    lblPlatformJunior = new JLabel("Platform:");
    lblPlatformJunior.setBounds(30,355,90,20);
    frame.add(lblPlatformJunior);    
    txtPlatformJunior = new JTextField();
    txtPlatformJunior.setBounds(190,355,490,20);
    frame.add(txtPlatformJunior);
    
    lblInterviewerNameJunior = new JLabel("Interviewer's Name:");
    lblInterviewerNameJunior.setBounds(30,395,120,20);
    frame.add(lblInterviewerNameJunior);
    txtInterviewerNameJunior = new JTextField();
    txtInterviewerNameJunior.setBounds(200,395,140,20);
    frame.add(txtInterviewerNameJunior);
    
    
    lblJuniorTerminationDate= new JLabel("Termination Date:");
    lblJuniorTerminationDate.setBounds(30,435,140,20);
    frame.add(lblJuniorTerminationDate);
    txtJuniorTerminationDate = new JTextField();
    txtJuniorTerminationDate.setBounds(135,435,190,20);
    frame.add(txtJuniorTerminationDate);
    
    lblAppointedBy = new JLabel("Appointed By:");
    lblAppointedBy.setBounds(380,435,90,20);
    frame.add(lblAppointedBy);
    txtAppointedBy = new JTextField();
    txtAppointedBy.setBounds(460,435,190,20);
    frame.add(txtAppointedBy);
    
    lblJuniorSalary = new JLabel("Salary:");
    lblJuniorSalary.setBounds(355,395,180,20);
    frame.add(lblJuniorSalary);
    txtJuniorSalary = new JTextField();
    txtJuniorSalary.setBounds(405,395,120,20);
    frame.add(txtJuniorSalary);
    
    
    lblWorkingHourJunior = new JLabel("Working Hour");
    lblWorkingHourJunior.setBounds(550,395,150,20);
    frame.add(lblWorkingHourJunior);
    txtWorkingHourJunior = new JTextField();
    txtWorkingHourJunior.setBounds(630,395,50,20);
    frame.add(txtWorkingHourJunior);
    
            
    btnAddJunior= new JButton("Add");
    btnAddJunior.setBounds(500,465,90,20);
    frame.add(btnAddJunior); 
    
      
    lblDeveloperJunior = new JLabel("Developer's Name:");
    lblDeveloperJunior.setBounds(30,500,140,20);
    frame.add(lblDeveloperJunior);    
    txtDeveloperNameJunior = new JTextField();
    txtDeveloperNameJunior.setBounds(160,500,490,20);
    frame.add(txtDeveloperNameJunior);           
   
    lblSpecilization = new JLabel("Specilization:");
    lblSpecilization.setBounds(30,550,90,20);
    frame.add(lblSpecilization);
    txtSpecilization = new JTextField();
    txtSpecilization.setBounds(120,550,190,20);
    frame.add(txtSpecilization);
    
    lblAppointedDate = new JLabel("Appointed Date:");
    lblAppointedDate.setBounds(380,550,140,20);
    frame.add(lblAppointedDate);
    txtAppointedDate = new JTextField();
    txtAppointedDate.setBounds(490,550,190,20);
    frame.add(txtAppointedDate);   
    
    lblTerminationDate = new JLabel("Termination Date:");
    lblTerminationDate.setBounds(30,600,150,20);
    frame.add(lblTerminationDate);
    txtTerminationDate = new JTextField();
    txtTerminationDate.setBounds(140,600,180,20);
    frame.add(txtTerminationDate);
    
    lblJuniorPlatformno = new JLabel("Platform No:");
    lblJuniorPlatformno.setBounds(380,600,140,20);
    frame.add(lblJuniorPlatformno);
    txtJuniorPlatformno = new JTextField();
    txtJuniorPlatformno.setBounds(490,600,60,20);
    frame.add(txtJuniorPlatformno);
    
    btnAppointJunior= new JButton("Appoint");
    btnAppointJunior.setBounds(590,620,90,20);
    frame.add(btnAppointJunior);
    
    
    btnDisplay= new JButton("Display");
    btnDisplay.setBounds(470,650,90,20);
    frame.add(btnDisplay);
    
    
    btnClear= new JButton("Clear");
    btnClear.setBounds(590,650,90,20);
    frame.add(btnClear);
    
    //Adding Action of Buttons
    btnAdd.addActionListener(this);
    btnClear.addActionListener(this);
    btnAddJunior.addActionListener(this);
    btnHire.addActionListener(this);
    btnAppointJunior.addActionListener(this);
    btnDisplay.addActionListener(this);
    btnTerminate.addActionListener(this);
        
    //Frame layout 
    frame.setSize(700,800);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        
        //Adding PlatForm for SeniorDeveloper
        if (ae.getSource()==btnAdd){
            String SenPlat = txtPlatformSenior.getText();
            String SenInt = txtInterviewerName.getText();
            String SenSalary = txtSalary.getText();
            String SWork = txtWorkingHour.getText();
            String ConPer = txtContractPeriod.getText();
            if(SenPlat.equals("") || SenInt.equals("") || SenSalary.equals("") || SWork.equals("") || ConPer.equals("") ) {
                JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    int SenSalaryNu = Integer.parseInt(SenSalary);
                    int senWhr = Integer.parseInt(SWork);
                    int senCon = Integer.parseInt(ConPer);
                    
                    if(SenSalaryNu==0 || senWhr==0 || senCon==0){
                        JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                    SeniorDeveloper senD = new SeniorDeveloper(SenPlat, SenInt, senWhr, SenSalaryNu, senCon);
                    list.add(senD);
                    
                    JOptionPane.showMessageDialog(frame,"Data Stored Successfully.");
                }
                }
                catch(NumberFormatException exp){
                    JOptionPane.showMessageDialog(frame,"Error");
                }
                
            }
        }
        
        //Hiring a SeniorDeveloper
        if (ae.getSource()==btnHire){
            String senDev = txtDeveloperName.getText();
            String senJoin = txtJoiningDate.getText();
            String senAdS = txtAdvanceSalary.getText();
            String senSRm = txtStaffRoomNo.getText();
            String senPno = txtSeniorPlatformno.getText();
            
            if(senDev.equals("") || senJoin.equals("") || senAdS.equals("") || senSRm.equals("") || senPno.equals("")) {
                JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                int AdvanceSalary = Integer.parseInt(senAdS);
                int Pno = Integer.parseInt(senPno);
                Pno = Pno-1;
                if( Pno<0 || Pno >=list.size()){
                    JOptionPane.showMessageDialog(frame,"Data Not Found.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else if( !(list.get(Pno) instanceof SeniorDeveloper)){
                    JOptionPane.showMessageDialog(frame,"Data Not Found.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    SeniorDeveloper SD = (SeniorDeveloper) list.get(Pno);
                    if (SD.appointed==false){
                        SD.hire(senDev, senJoin, AdvanceSalary, senSRm);
                        JOptionPane.showMessageDialog(frame,"Senior Developer Hired");
                    }else{
                        JOptionPane.showMessageDialog(frame,"Developer is already appointed.");
                    }
                }
            }
            
                catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Error");
            }
            }
        }
        
        //terminating senior developer
       
        if (ae.getSource()==btnTerminate){
            String platformNo = txtSeniorPlatformno.getText();
            if (platformNo.equals("")){
                JOptionPane.showMessageDialog(frame,"Please Enter Platfrom Number.","Oops!Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int platformNum = Integer.parseInt(platformNo);
                    platformNum = platformNum-1;
                    //checking for platform
                    if (platformNum <0){
                        JOptionPane.showMessageDialog(frame,"Platform must be greater than 0.");
                    //checking for the size of array list
                    }else if(list.size()==0){
                        JOptionPane.showMessageDialog(frame,"Senior Developer has not been Hired to any platform.");
                    }else if(platformNum>=list.size()){
                        JOptionPane.showMessageDialog(frame,"Senior Developer cannot be terminated of this platform");
                    //checking for the object in the array list
                    }else if(!(list.get(platformNum) instanceof SeniorDeveloper)){
                        JOptionPane.showMessageDialog(frame,"Senior Developer cannot be terminated of this platform.");
                    }else{
                        //calling the termination method from senior developer class
                        SeniorDeveloper seDE = (SeniorDeveloper) list.get(platformNum);
                        if (seDE.terminated==true){
                            JOptionPane.showMessageDialog(frame,"Senior Developer is already Terminated");
                        }else{
                            seDE.termination();
                            JOptionPane.showMessageDialog(frame,"Developer has been terminated. You can now Hire new Developer");
                        }
                        }
                    }
                //catching number format exception error
                   catch(NumberFormatException exp){
                    JOptionPane.showMessageDialog(frame,"Platform Must be Numeric Value.");
                
            }
    }
    
   //Adding platform to Junior Developer
        if (ae.getSource()==btnAddJunior){
            String JuniorPlat = txtPlatformJunior.getText();
            String JuniorInt = txtInterviewerNameJunior.getText();
            String JuniorTerDt = txtJuniorTerminationDate.getText();
            String JuniorAppBy = txtAppointedBy.getText();
            String JuniorSa = txtJuniorSalary.getText();
            String JuniorWhr = txtWorkingHourJunior.getText();
            if(JuniorPlat.equals("") || JuniorInt.equals("") || JuniorWhr.equals("") || JuniorTerDt.equals("") || JuniorAppBy.equals("") || JuniorSa.equals("") ) {
                JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                int JuniorWorkhr = Integer.parseInt(JuniorWhr);
                double JuniorS = Double.parseDouble(JuniorSa);
                if(JuniorWorkhr==0 || JuniorS==0){
                        JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                JuniorDeveloper JuniorDe = new JuniorDeveloper(JuniorPlat, JuniorInt, JuniorWorkhr, JuniorS, JuniorAppBy, JuniorTerDt);
                list.add(JuniorDe);
                JOptionPane.showMessageDialog(frame,"Data Stored Successfully.");
            
            }   
            }
                catch(NumberFormatException exp){
                    JOptionPane.showMessageDialog(frame,"Error");
            
                }
            }
        }
       
        //Appointing a Junior Developer
        if (ae.getSource()==btnAppointJunior){
            String JuniorDev = txtDeveloperNameJunior.getText();
            String JuniorApBy = txtAppointedDate.getText();
            String JuniorAppointedDt = txtAppointedDate.getText();
            String JuniorTerD = txtTerminationDate.getText();
            String JuniorSpl = txtSpecilization.getText();
            String JuniorPno = txtJuniorPlatformno.getText();
            if(JuniorDev.equals("") || JuniorApBy.equals("") || JuniorAppointedDt.equals("") || JuniorTerD.equals("") || JuniorSpl.equals("") || JuniorPno.equals("")){
                JOptionPane.showMessageDialog(frame,"Please Enter All the Values.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
              try{
                //converting the values to required data type
                int PlatformNoJunior = Integer.parseInt(JuniorPno);
                PlatformNoJunior = PlatformNoJunior-1;
                //checking for the size of arraylist
                if( PlatformNoJunior<0 || PlatformNoJunior >=list.size()){
                    JOptionPane.showMessageDialog(frame,"Junior Developer cannot be hired to this paltform.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                //checking for the object of junior developer in the array list
                else if( !(list.get(PlatformNoJunior) instanceof JuniorDeveloper)){
                    JOptionPane.showMessageDialog(frame,"Junior Developer cannot be hired to this paltform.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    //calling the method to apppoint junior developer
                    JuniorDeveloper JuniorD = (JuniorDeveloper) list.get(PlatformNoJunior);
                    if (JuniorD.joined==true){
                        JOptionPane.showMessageDialog(frame,"Developer has been already hired to this platform.");
                    }else{
                        JuniorD.appointDeveloper(JuniorDev,JuniorApBy,JuniorAppointedDt, JuniorTerD, JuniorSpl);
                        JOptionPane.showMessageDialog(frame,"Junior Developer Succesfully Hired.");
                    }
                }
            }
        
            //catching number format exception error
        
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Platform must be in numeric value.");
            }
                
            }
        }
        
               
        //Clearing all the data 
        if(ae.getSource()==btnClear){
            txtPlatformJunior.setText("");
            txtInterviewerNameJunior.setText("");
            txtWorkingHourJunior.setText("");
            txtDeveloperNameJunior.setText("");
            txtAppointedBy.setText("");
            txtAppointedDate.setText("");
            txtJuniorSalary.setText("");
            txtJuniorTerminationDate.setText("");            
            txtTerminationDate.setText("");
            txtSpecilization.setText("");
            txtPlatformSenior.setText("");
            txtInterviewerName.setText("");
            txtSalary.setText("");
            txtWorkingHour.setText("");
            txtContractPeriod.setText("");
            txtDeveloperName.setText("");
            txtJoiningDate.setText("");
            txtAdvanceSalary.setText("");
            txtStaffRoomNo.setText("");
            txtSeniorPlatformno.setText("");
            txtJuniorPlatformno.setText("");
            

        }
        if(ae.getSource()==btnDisplay){
             if(list.size() == 0){
                JOptionPane.showMessageDialog(frame,"No Developer has been appointed.");
            }else{
                int num=1;
                for(Developer developer:list){
                    if(developer instanceof SeniorDeveloper){
                        SeniorDeveloper disDetails = (SeniorDeveloper) developer;
                        if (disDetails.appointed==true){
                            System.out.println("Senior Developer Detail "+num+":");
                            disDetails.display();
                            System.out.println("");
                        }
                    }else{
                        JuniorDeveloper disDetails= (JuniorDeveloper) developer;
                        if (disDetails.joined==true){
                            System.out.println("Junior Developer Detail "+num+":");
                            disDetails.display();
                            System.out.println("");
                        }
                    }
                    num=num+1;
                }
            }
    }

        //calling main method
    }
}    
    public static void main(String[]args){
        new RigoTechnology().appointSystem();
     }   
}


