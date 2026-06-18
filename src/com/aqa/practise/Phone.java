package com.aqa.practise;

import java.util.List;

public class Phone {
    private String number;
    private Model model;
    private double weight;

    public Phone(String number, Model model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, Model model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void printFields(){
        System.out.print("Номер: " + number + ", Модель: " + model + " , Вес: " + weight);
    }

    public void receiveCall(Contact contact){
        System.out.print("Тебе звонит " + contact.getName() + " с номером " + contact.getNumber());
    }

    public void receiveCall(Contact contact, String date){
        System.out.print("Тебе звонит " + contact.getName() + " дата " + date);
    }

    public void sendMessage (List<Contact> contacts, String messege){
        for (Contact contact: contacts){
            System.out.print("Имя " + contact.getName() + " Номер" + contact.getNumber());
        }
    }

}
