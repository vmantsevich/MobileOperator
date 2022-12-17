public class Main {
    public static void main(String[] args) {

        int account = 200;
        int refill = 1300;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int total = account + refill + bonus;

        System.out.println("На Вашем счету:" + total + "руб.");
    }
}