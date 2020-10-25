import person.Person;
import person.Student;
import thiskeyword.Person2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person3 per=new Person3("zt");
//        per.setAge(18);
//        per.setColor("yellow");
//        per.setName("李涛");
//        System.out.println(per.getAge());
//
//构造方法与this关键字
//        Person2 ts = new Person2("张涛", 18, "yellow");
//        Person2 tq = new Person2("天齐", 18, "yellow");
//        tq.print();
//        ts.print();
//        if (tq.compare(ts)) {
//            System.out.println("true");
//        } else
//            System.out.println("false");
//继承
//        Student xgl=new Student("徐国林",18,"yellow",123);
//        xgl.eat();
//        xgl.doHomework();
//        System.out.println(xgl.getQq());
//类的定义
//        Person tq=new Person();
//        tq.setName("天齐学长");
//        tq.setAge(18);
//        tq.setColor("yellow");
//方法的重载
//        System.out.println(add(5,5,4));

        Person person=new Student("xgl",18,"red");
        person.print();

//向下转型
//        Person per2=new Student("xgl",18,"yellow");
//        Student stu=(Student)per2;
//        stu.print();
//        stu.doHomework();

//匿名对象
//    new Person3("张涛学长",18,"yellow").print();
//        System.out.println(add(1.2,2.2));
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
    public static float add(float x,float y)
    {
        return x+y;
    }
}
