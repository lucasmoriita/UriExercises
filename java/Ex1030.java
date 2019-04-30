import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// A lenda de Flavious Josephus

public class Ex1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NC = scanner.nextInt();
        
        ArrayList<Integer> numeros = new ArrayList();
        
        int i = 0;
        String readLine;
        String[] input;
        do {
            readLine = scanner.nextLine();
            input = readLine.split(" "); 
            
            Integer.parseInt(input[i]);
            System.out.println("oi");
        } while (i < NC);
    }
}