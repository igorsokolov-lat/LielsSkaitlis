//Igors Sokolovs is10126


import java.math.BigInteger;
import java.util.Scanner;

// ================ Klasi MD3 modificet aizliegts!
public class MD3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        LielsSkaitlis lielsSkaitlis1 = new LielsSkaitlis(args[0]);
//        LielsSkaitlis lielsSkaitlis2 = new LielsSkaitlis(args[1]);
        LielsSkaitlis lielsSkaitlis1 = new LielsSkaitlis(scanner.next());
        LielsSkaitlis lielsSkaitlis2 = new LielsSkaitlis(scanner.next());

        lielsSkaitlis1.add(lielsSkaitlis2);
        lielsSkaitlis1.display();
        lielsSkaitlis1.reverse();
        lielsSkaitlis1.display();

        lielsSkaitlis2.sub(lielsSkaitlis1);
        lielsSkaitlis2.display();
        lielsSkaitlis2.reverse();
        lielsSkaitlis2.display();
    }
}
// ================ Klasi MD3 modificet aizliegts!


//Japapildina klase "LielsSkaitlis" ar nepieciesamo funcionalitati
class LielsSkaitlis {
    private String skaitlis;

    //Varat pievienot savus laukus, ja tas ir nepieciesams

    LielsSkaitlis(String str) {
        this.skaitlis = str;
    }

    BigInteger skaitlis1 = new BigInteger(skaitlis);
    BigInteger skaitlis2 = new BigInteger(skaitlis);

    public void add(LielsSkaitlis sk) {
        skaitlis = skaitlis1.add(skaitlis2).toString();
    }

    public void sub(LielsSkaitlis sk) {
        skaitlis = skaitlis1.subtract(skaitlis2).toString();
    }

    public void reverse() {
        StringBuilder skaitlis3 = new StringBuilder(skaitlis);
        skaitlis = skaitlis3.reverse().toString();
    }


    //Varat pievienot savas metodes, ja tas ir nepieciesams


    // ================= Metodi display() modificet aizliegts!
    public void display() {
        System.out.println(skaitlis);
    }
}