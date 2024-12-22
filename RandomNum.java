import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rand = new Random();
        
       
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(9000) + 1000; 
            System.out.println(randomNum);
        }
    }
}
