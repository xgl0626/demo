package demo;

public class Canteen {
    private String name;
    private String payment;
    public Canteen(String name,String payment)
    {
        this.name=name;
        this.payment=payment;
    }
    public void payment()
    {
        System.out.println("请你用支持"+payment+"支付");
    }
    public void welcome()
    {
        System.out.println("欢迎你来"+name+"用餐");
    }
}
