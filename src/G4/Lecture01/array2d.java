/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G4.Lecture01;

/**
 *
 * @author INT105
 */
import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int numofstd;
        double[][] scores;
        double best;
        char grade;
        double total = 0;
        System.out.println("enter thnumber of student : ");
        numofstd = kb.nextInt();
        scores = new double[numofstd][3];
        for(int i = 0 ;i<numofstd;i++){
            System.out.println("Input scores of student "+i+"(mid,final,assign)");
            scores[i][0] = kb.nextDouble();
            scores[i][1] = kb.nextDouble();
            scores[i][2] = kb.nextDouble();
        }
        for(int i = 0 ;i<numofstd;i++){
            total = scores[i][0]+scores[i][1]+scores[i][2];
            System.out.println("Scores of student " +i+"\t"+scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+"Total : "+total);
        }
       
    }
}
  