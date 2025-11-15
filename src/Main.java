
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(read());
        System.out.println();
    }

    public static int read() throws FileNotFoundException {
        boolean flag = true;
        int RTotal = 0;
        int OTotal = 0;
        int YTotal = 0;
        int GTotal = 0;
        int BTotal = 0;
        int ITotal = 0;
        int VTotal = 0;
        File f = new File("ScoreBoard.txt");
        Scanner s = new Scanner(f);
        ScoreBoard[] lines = new ScoreBoard[1000];

        while (s.hasNext()) {
            String word = s.next();
            String word2 = s.next();
            while (s.hasNextInt()) {
                int num = s.nextInt();
                if(num==0) flag=!flag;
                else if (flag==true)

                    if (word.equals("Red")) RTotal += num;
                else if (word.equals("Orange"))
                    OTotal = OTotal+num;
                else if (word.equals("Yellow"))
                    YTotal += num;
                else if (word.equals("Green"))
                    GTotal += num;
                else if (word.equals("Blue"))
                    BTotal += num;
                else if (word.equals("Indigo"))
                    ITotal += num;
                else if (word.equals("Violet"))
                    VTotal += num;
                if (flag== false) {
                    if (word.equals("Red"))
                        RTotal += num;
                    else if (word2.equals("Orange"))
                        OTotal += num;
                    else if (word2.equals("Yellow"))
                        YTotal = YTotal+num;
                    else if (word2.equals("Green"))
                        GTotal += num;
                    else if (word2.equals("Blue"))
                        BTotal += num;
                    else if (word2.equals("Indigo"))
                        ITotal += num;
                    else if (word2.equals("Violet"))
                        VTotal += num;
                }

            }


        }

        return 0;


    }
}