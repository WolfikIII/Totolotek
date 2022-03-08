import java.util.Random;
import java.util.Scanner;

public class InputNumbers {
    Scanner scanner = new Scanner(System.in);

    public int[] numbers() {
        System.out.println("Wprowadź 6 liczb z zakresu 1-49:");
        int tab[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print(i+1+":");
            int a = scanner.nextInt();
            if (a <= 0 || a > 49) {
                System.out.println("Liczba poza zakresem");
                if (i > 0) {
                    i--;
                } else i = -1;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (tab[j] == a) {
                        System.out.println("Zdublowanie!!! wpisz inna liczbe");
                        i--;
                    }
                }
                if(tab[i]==0) {
                    tab[i] = a;
                }
            }
        }
        return tab;
    }

    public int[] generateNumbers() {
        int generateNumber[] = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(1,49);
            for (int j = 0; j < 6; j++) {
                if (generateNumber[j] == num) {
                    i--;
                }
            }
            if(generateNumber[i]==0) {
                generateNumber[i] = num;
            }
        }
        return generateNumber;
    }

    public String result(){
        int tab1[] = numbers();
        int tab2[] = generateNumbers();
        int count=0;
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(tab1[i] == tab2[j]){
                    count++;
                }
            }
        }
        System.out.println("\nTwoje liczby: ");
        for(int i=0; i<6; i++) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println("\n\nWylosowane liczby: ");
        for(int i=0; i<6; i++) {
            System.out.print(tab2[i] + ", ");
            }
        String result = "\n\nTwój wynik to " + count + "/6";
        return result;
    }
}




