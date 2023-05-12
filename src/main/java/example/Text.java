package example;

public class Text {

    public static int DEFAULT_SPEED =15 ;

    public static void printWithDelay(String message, int speed) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                System.out.println("Impossible de sleep !");
            }
        }
        System.out.println();
    }

    public static void printWithDelay(String message) {
        printWithDelay(message, DEFAULT_SPEED);
    }
}
