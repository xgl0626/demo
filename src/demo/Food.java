package demo;

public class Food {
    private String food;
    private int money;
    private int foodNum;

    public int getMoney() {
        return money;
    }

    public String getFood() {
        return food;
    }

    public int getFoodNum() {
        return foodNum;
    }


    public Food(String food, int money, int foodNum)
    {
        this.food=food;
        this.money=money;
        this.foodNum=foodNum;
    }

    public void print()
    {
        System.out.println("菜品："+foodNum+" "+food+"价格："+money+"￥");
    }
}
