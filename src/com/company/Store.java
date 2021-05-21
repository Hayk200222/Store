package com.company;

import java.util.Scanner;

public class Store {
    private int countOfproduct;
    private String name;
    private long phoneNumber;
    private int countofWorkers;

    public Store(int countOfproduct, String name, int phoneNumber, int countofWorkers) {
        this.countOfproduct = countOfproduct;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countofWorkers = countofWorkers;
    }

    public Store() {

    }

    public int getCountOfproduct() {
        return countOfproduct;
    }

    public void setCountOfproduct(int countOfproduct) {
        this.countOfproduct = countOfproduct;
    }

    public int getCountofWorkers() {
        return countofWorkers;
    }

    public void setCountofWorkers(int countofWorkers) {
        if (countofWorkers > 1 && countofWorkers < 51) {
            this.countofWorkers = countofWorkers;
        } else {
            System.out.println("Count of workers is invalid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 4) {
            this.name = name;
        }else {
            System.out.println("Name is invalid");
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        if (phoneNumber > 9999999 && phoneNumber < 100000000) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Phonenumber is invalid");
        }
    }

    public void sellProduct(int countOfproduct) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want buy a product press 1 ");
        int inputNumber = scanner.nextInt();
        if (inputNumber == 1) {
            System.out.println("You bought product");
            countOfproduct--;
            System.out.println("Count of product is " + countOfproduct);
        } else {
            System.out.println("You dont buy a product");
        }
    }

    public Store(int countOfproduct, String name, long phoneNumber, int countofWorkers) {
        this.countOfproduct = countOfproduct;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countofWorkers = countofWorkers;
    }

    public void display() {
        System.out.println("Name is " + getName());
        System.out.println("Count of workers is " + getCountofWorkers());
        System.out.println("Count of product is " + getCountOfproduct());
        System.out.println("Phone number is " + getPhoneNumber());
        sellProduct(countOfproduct);
    }
}
