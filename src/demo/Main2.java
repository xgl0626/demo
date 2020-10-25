package demo;

import java.util.Scanner;

public class Main2 {
    private static CenterCanteen centerCanteen;
    public static void main(String[] args) {
        centerCanteen= new CenterCanteen("中心食堂","学生卡");
        welcome();
        initFood();
        service();
    }

    private static void welcome() {
        centerCanteen.welcome();
    }

    public static void initFood()
    {
        centerCanteen.add(new Food("小面",3,1));
        centerCanteen.add(new Food("混沌",9,2));
        centerCanteen.add(new Food("牛肉面",10,3));
        centerCanteen.add(new Food("杂酱面",8,4));
    }

    public static void service()
    {
        System.out.println("请您开始点餐，当你输入0时，退出点餐");
        centerCanteen.printFood();
        while(true)
        {
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            centerCanteen.clickFood(x);
            if(x==0)
            {
               centerCanteen.payment();
                System.out.println("欢迎下次光临");
            }
        }
    }
}
