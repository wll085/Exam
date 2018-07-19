import java.util.Scanner;
public class Exam {
    public static void main(String[] args){
        Salary salary=Salary.getSalery();
        Scanner scanner=new Scanner(System.in);
        System.out.println("UserA:");
        int temp1=scanner.nextInt();
        salary.getTax(temp1);
        System.out.println("UserB:");
        int temp2=scanner.nextInt();
        salary.getTax(temp2);
        System.out.println("UserC:");
        int temp3=scanner.nextInt();
        salary.getTax(temp3);
        System.out.println("UserD:");
        int temp4=scanner.nextInt();
        salary.getTax(temp4);
    }
}
