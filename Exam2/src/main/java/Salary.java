public class Salary {
    private static Salary salary=new Salary();
    private Salary(){}
    public static Salary getSalery(){
        return salary;
    }
    public void getTax(int temp){
        double tax=0;
       if(temp<=1500) {
          tax=temp*0.03;
          System.out.println("应缴纳的税费为："+tax);
       }else if(temp>1500&&temp<=4500){
           tax=temp*0.1;
           System.out.println("应缴纳的税费为："+tax);
       }else if(temp>4500&&temp<=9000){
           tax=temp*0.2;
           System.out.println("应缴纳的税费为："+tax);
       }else if(temp>9000&&temp<=35000){
           tax=temp*0.25;
           System.out.println("应缴纳的税费为："+tax);
       }else if(temp>35000&&temp<=55000){
           tax=temp*0.3;
           System.out.println("应缴纳的税费为："+tax);
       }else if(temp>55000&&temp<=80000){
           tax=temp*0.35;
           System.out.println("应缴纳的税费为："+tax);
       }else{
           tax=temp*0.45;
           System.out.println("应缴纳的税费为："+tax);
       }
    }
}
