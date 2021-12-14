import java.util.Scanner;

public class Patient {
    public String Patientname;
    public Double Height;
    public Double Weigth;
    Double BMI;
    void computeBMI(){

        BMI=(Weigth/(Height*Height));
        System.out.println("Name of Patient"+Patientname+
                "BMI of Patient"+BMI);
    }

}
class result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Patient Name");
        String Patient=sc.nextLine();
        System.out.println("Enter the Patient Height");
        Double Height=sc.nextDouble();
        System.out.println("Enter the Patient width");
        Double Weigth =sc.nextDouble();
        Patient obj =new Patient();
        obj.computeBMI();
    }
}
