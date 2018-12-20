import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {


  /*    String a = JOptionPane.showInputDialog("Eingabe1");
        String b = JOptionPane.showInputDialog("Eingabe2");
        String c = JOptionPane.showInputDialog("Eingabe3");


        if ((a.substring(0,3).contains(b.substring(0,3)) ^ (a.substring(0,3).contains(c.substring(0,3)))) ^ (b.substring(0,3).contains(c.substring(0,3)))){
            System.out.println("zwei Variablen sind gleich");
        }   */

        int counter = 1;
        int[] zahlenListe = new int[9];

        for (int i = 0; i<9; i++){
            zahlenListe[i]=counter++;
        }

        System.out.println("--------------- ");


        for(int q: zahlenListe){
            System.out.println(q);
        }

        int [] zahlenListe2 = new int[]{1,2,3,4,5,6,7,8,9};
        for (int g: zahlenListe){
            System.out.println(g);
        }

        System.out.println("--------");


        Random random = new Random();
        int zufall = random.nextInt((4));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j=0; j<zufall +1; j++){
            arrayList.add(zufall);
        }
        for(Integer o: arrayList){
            System.out.println(o);
        }


        System.out.println("---------");

        int counter2 = 1;
        int[][] zweiDeminsion = new int[3][3];

        for(int k=0; k<3; k++ ){
            for (int s=0; s<3; s++){
                zweiDeminsion[k][s] = counter2++;
            }

        }
        for(int k=0; k<3; k++ ){
            for (int s=0; s<3; s++){
                System.out.println(zweiDeminsion[k][s]);
            }

        }


    }



}


