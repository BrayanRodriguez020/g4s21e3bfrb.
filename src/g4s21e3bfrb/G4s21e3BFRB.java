/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21e3bfrb;

/**
 *
 * @author Brayan Rodriguez
 */
public class G4s21e3BFRB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numero de operaciones " + args.length);
        for (int a =0; a<args.length;a++)
            
        System.out.println("operacion#"+a+", contiene -->" + args[a]);  
        for (int a = 0; a<args.length;a++){
            if(args[a].equals("3-5"))break;
            System.out.println("El resultado es 8, de la operacion de " +args[a]);
        }  
        for (int a = 1; a<args.length;a++){
            if(args[a].equals("3*5"))break;
            System.out.println("El resultado es -2, de la operacion de " +args[a]);
        }
        for (int a = 2; a<args.length;a++){
            if(args[a].equals("3/5"))break;
            System.out.println("El resultado es 15, de la operacion de " +args[a]);
        }
         for (int a = 3; a<args.length;a++){
            if(args[a].equals(""))break;
            System.out.println("El resultado es 0, de la operacion de " +args[a]);
        }
        
        
        System.out.println("nos salimos de la ejecucion");
    }
    
}
