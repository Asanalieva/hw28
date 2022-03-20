package com.company;

import java.util.function.UnaryOperator;

//sqrt деген метод тузунуз.
//UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
//
//public static UnaryOperator<Double> sqrt().

public class Main {
    public static void main(String[] args) {


        System.out.println(sqrt.apply(25.0));


    }
    static UnaryOperator<Double> sqrt = num -> Math.sqrt(num);

}
