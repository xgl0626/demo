package person;

public class Person {
    //public修饰符
    //     public String name;
    private String name;
    private int age;
    private String color;

    public Person(String name, int age, String color) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("该吃饭了，好想吃黄焖鸡。");
    }

    public void sleep() {
        System.out.println("我去睡觉了。");
    }

    public void print() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 肤色：" + color);
    }
}
