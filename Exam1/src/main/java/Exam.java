public class Exam {
    public static void main(String[] args){
        int count=0;
        int j;
        boolean flag;
        for (int i = 101; i <= 200; i++) {
            flag = false;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count++;
                System.out.println("素数："+i);
            }
        }
        System.out.print("101-200间共有"+count+"个素数");
    }
}
