public class Main {
    public static void main(String[] args) {
        double ticket = 7350;
        int bonusSize = 20;
        int mile = (int) (ticket / bonusSize);
        System.out.println("Вам начисленно " + mile + " миль");
    }
}
