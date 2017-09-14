/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

/**
 *
 * @author Star
 */

class Box{
    
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
    }
    // compute and return volume
    double volume() {    

    return width * height * depth;
    }
}

public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int i[]; // Declare
        //i= new int[10];   
        for (String s : args)
            System.out.println("arg -> " + s);
        int twod[][];
        int k=0;
        
        twod= new int[4][];
        twod[0]= new int[1];
        twod[1]= new int[2];
        twod[2]= new int[3];
        twod[3]= new int[4];
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<i+1;j++) {
                twod[i][j]= k;
                k++;
            }
        }
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print(twod[i][j] + "  ");
            }
            System.out.println();
        }
        
        //System.out.println(twod[0][1]);
    }
    
}
