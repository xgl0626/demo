import person.Person;

public class Person3 {
    private String name;
    private int age;
    private String color;


    public void setName(String name) {
        this.name = name;
    }

    public Person3(String name)
    {
        this.setName(name);
    }

    public Person3(String name, int age, String color)
    {
        this.name=name;
        this.age=age;
        this.color=color;
    }

//    public void setName(String name) {
//       this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getColor() {
//        return color;
//    }

    public void print() {
        System.out.println("姓名：" + name + " " + age + " " + color);
    }
}
