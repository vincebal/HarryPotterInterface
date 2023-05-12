package example;

import java.util.Random;

public class Success {
    public static boolean success(int proba) {

        Random random = new Random();
        int randomsucces= (int) (random.nextInt(100));
        if (randomsucces <= proba) {
            return true;
        }
        else{
            return false;
        }
    }
}
