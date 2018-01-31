/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup03;

/**
 *
 * @author INT105
 */
import java.util.Scanner;
public class warmup3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of student : ");
        int numstd = kb.nextInt();
        int[][] info = new int[numstd][2];
        for(int i =0 ;i<numstd;i++){
            System.out.println("Enter id(last 3 digits) and class number : ");
            info[i][0] = kb.nextInt();
            info[i][1] = kb.nextInt();
            
        }
        for(int i = 0;i<numstd;i++){
            System.out.println("ID : " + info[i][0] + " Room : " + info[i][1]);
        }
        
        
    }
    
}
