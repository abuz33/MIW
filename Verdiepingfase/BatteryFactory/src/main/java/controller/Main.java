package controller;

import model.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        for (int i = 0; i < 50; i++) {
            System.out.println(client.getRandomBattery());
        }
    }
}
