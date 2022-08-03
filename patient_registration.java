import java.util.*;
public class patient_registration {
    int SerNo; //patient serial number
    String regNo; //patient registration number
    String name; //patient name
    String county_of_residence;
    String day_of_month;
    String month;
    String year;

    patient_registration(int SN, String regNo, String name, String cor, String dom, String month, String year) {
        this.SerNo = SN;
        this.regNo = regNo;
        this.name = name;
        this.county_of_residence = cor;
        this.day_of_month = dom;
        this.month = month;
        this.year = year;

    }

    public void display(){
        System.out.println("Patient Serial Number: "+ this.SerNo);
        System.out.println("Patient Registration Number: "+ this.regNo);
        System.out.println("Patient Name: "+ this.name);
        System.out.println("County of Residence: "+ this.county_of_residence);
        System.out.println("Day of Month: "+ this.day_of_month);
        System.out.println("Month: "+ this.month);
        System.out.println("Year: "+ this.year);
    }

    public static void main(String[] args){
        System.out.println("Enter Patient's Reg no: ");
        Scanner input = new Scanner(System.in);
        String regNo = input.nextLine();
        System.out.println("Enter Patient's Name: ");
        String name = input.nextLine();
        System.out.println("Enter Patient's County of Residence: ");
        String county_of_residence = input.nextLine();
        System.out.println("Enter Patient's admission Day of Month: ");
        String day_of_month = input.nextLine();
        System.out.println("Enter Patient's admission Month: ");
        String month = input.nextLine();
        System.out.println("Enter Patient's admission Year: ");
        String year = input.nextLine();

        patient_registration patient1 = new patient_registration(1, regNo, name, county_of_residence, day_of_month, month, year);
        patient1.display();
        
        input.close();



    }
}
