import person.Person;
import person.Student;
import thiskeyword.Person2;

public class Main {
    public static void main(String[] args) {
//构造方法与this关键字
//        Person2 ts = new Person2("张涛", 18, "yellow");
//        Person2 tq = new Person2("天齐", 18, "yellow");
//        tq.print();
//        ts.print();
//继承
//        Student xgl=new Student("徐国林",18,"yellow");
//        xgl.doHomework();
//类的定义
//        Person tq=new Person();
//        tq.setName("天齐学长");
//        tq.setAge(18);
//        tq.setColor("yellow");
//方法的重载
//        System.out.println(add(5,5,4));
//匿名对象
        new Person("张涛学长",18,"yellow").print();
    }

    public static int add(int x, int y) {
        return x + y;
    }

//    public static float add(int x,int y)
//    {
//        return x+y;
//    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

}
