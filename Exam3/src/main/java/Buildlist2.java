import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
public class Buildlist2 implements Randoms {
    List<Integer> list=new ArrayList<Integer>();
    Random r=new Random();
    //使用Java8的其他方式实现
    public void buildRandom() {
        for(int i=0;i<50;i++){
            list.add(r.nextInt(101));//生成50个小于100的随机数并存放在List中
        }
        System.out.println(list);
    }
}
