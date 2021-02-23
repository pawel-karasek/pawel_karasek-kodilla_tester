package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
        Order order4 = new Order("4");

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        try {
            String number = "2";
            warehouse.getOrder(number);
            System.out.println("Order number: " + number + " was found");
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }

}
