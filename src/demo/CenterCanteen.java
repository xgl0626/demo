package demo;

import java.util.ArrayList;

public class CenterCanteen extends Canteen{

    private ArrayList<Food> foodList=new ArrayList<Food>();
    public CenterCanteen(String name, String payment) {
        super(name, payment);
    }

    public void add(Food food)
    {
        foodList.add(food);
    }

    public void printFood()
    {
        for( Food food:foodList){
            food.print();
        }
    }
    public void clickFood(int x)
    {
        for(Food food:foodList)
        {
            if(food.getFoodNum()==x)
            {
                System.out.println("你点了"+food.getFood()+",需要支付"+food.getMoney());
            }
        }
    }
}
