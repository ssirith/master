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

public class arraysexercise {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char grade ;
        double bestpoint;
        
        System.out.println("Enter the number of student : ");
        int numstd = kb.nextInt();
        
//        System.out.println("Enter " + numstd + " scores : ");
        double[] score = new double[numstd];
        double best = score[0];
//        for (int i = 0; i < score.length; i++) {
//            score[i] = kb.nextInt();
//        }
        score =getScore(numstd);
        for(int i = 0;i<score.length;i++){
        System.out.println(score[i]);
        }
        bestpoint = getBestScore(score);
        
        
        for (int i = 0 ;i<score.length;i++){
//            if(best<score[i]){
//                best=score[i];
//            }
//            if(score[i]>= best-10){
//                grade = 'A';
//            }
//            else if(score[i]>= best-20){
//                grade ='B';
//            }
//            else if(score[i]>= best-30){
//                grade ='C';
//            }
//            else if(score[i]>= best-40){
//                grade ='D';
//            }
//            else{
//                grade ='F';
//            }
            System.out.println("Student" + i + "score is " + score[i] + " grade is " + score2grade(score[i],bestpoint));
            
        }
//   

        
    }
    public static double getBestScore(double[] mostscore){
        double most=mostscore[0];
        for(int i =0;i<mostscore.length;i++){
            if(most<mostscore[i]){
                most = mostscore[i];
            }
        }
        return most;
    }
    public static double[] getScore (int numofstd){
        Scanner sc = new Scanner (System.in);
        double[] score =new double[numofstd];
        for (int i =0;i<score.length;i++){
            score[i] = sc.nextDouble();
        }
        return score;
    }
    public static char score2grade (double score ,double best){
        char grade;
        
            
            if(score>= best-10){
                grade = 'A';
            }
            else if(score>= best-20){
                grade ='B';
            }
            else if(score>= best-30){
                grade ='C';
            }
            else if(score>= best-40){
                grade ='D';
            }
            else{
                grade ='F';
            }
        return grade;
    }
}
