package thiskeyword;

import person.Person;

public class Person2 {
    private String name;
    private int age;
    private String color;

    public Person2() {
        System.out.println("this关键字调动构造方法");
    }

    public Person2(String name, int age, String color) {
        this();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 肤色：" + color);
    }

    public boolean compare(Person2 per) {
        Person2 per1 = this;
        Person2 per2 = per;
        if (per1 == per2) {
            return true;
        }
        if (per2 == null)
            return false;
        if (per.age == per.age && per1.name.equals(per2.name) && per1.color.equals(per2.color)) {
            return true;
        } else {
            return false;
        }
    }
}
