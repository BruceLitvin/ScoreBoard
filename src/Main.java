
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
        boolean flag = true; //determines which team to add numbers to
        int RTotal = 0;//initialize variables
        int OTotal = 0;
        int YTotal = 0;
        int GTotal = 0;
        int BTotal = 0;
        int ITotal = 0;
        int VTotal = 0;
        File f = new File("ScoreBoard.txt");//document
        Scanner s = new Scanner(f);//scan the document
        ScoreBoard[] lines = new ScoreBoard[1000];//initialize the array of 1000 games

        while (s.hasNext()) { //go through the list of strings
            String word = s.next();
            String word2 = s.next();
            while (s.hasNextInt()) { //now track the integers and add them up
                int num = s.nextInt();
                if(num==0) flag=!flag;// change teams when the number is zero
                else if (flag==true) //if true add to word 1 for any of the teams

                    if (word.equals("Red"))
                    { RTotal += num;}
                else if (word.equals("Orange"))
                    {OTotal = OTotal+num;}
                else if (word.equals("Yellow"))
                    {YTotal += num;}
                else if (word.equals("Green"))
                    { GTotal += num;}
                else if (word.equals("Blue"))
                    {BTotal += num;}
                else if (word.equals("Indigo"))
                    {ITotal += num;}
                else if (word.equals("Violet"))
                    {VTotal += num;}
                if (flag== false) { //otherwise add to team 2
                    if (word.equals("Red"))
                    { RTotal += num;}
                    else if (word2.equals("Orange"))
                    {OTotal += num;}
                    else if (word2.equals("Yellow"))
                    {   YTotal = YTotal+num;}
                    else if (word2.equals("Green"))
                    {  GTotal += num;}
                    else if (word2.equals("Blue"))
                    {   BTotal += num;}
                    else if (word2.equals("Indigo"))
                    {   ITotal += num;}
                    else if (word2.equals("Violet"))
                    {   VTotal += num;}
                }

            }


        }
        System.out.println(RTotal); //print out how many points each team gets in the end
        System.out.println(OTotal);
        System.out.println(YTotal);
        System.out.println(GTotal);
        System.out.println(BTotal);
        System.out.println(ITotal);
        System.out.println(VTotal);
        return 0;

    }
}