package utils;



public class Main {

    public static void main(String[] args) {
        Client client = new Client("localhost", 19111);
        client.run();
    }
}