package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    //получить общую сумму товаров в корзине без скидки,
    public double sumWithOutDiscount() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum = sum + food[i].getAmount() * food[i].getPrice();
        }
        return sum;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double sumWithDiscount() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            sum = sum + food[i].getAmount() * food[i].getPrice() * food[i].getDiscount() / 100.0;
        }
        return sum;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double sumAllVegetarian() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian()) {
                sum = sum + food[i].getAmount() * food[i].getPrice();
            }
        }
        return sum;
    }
}