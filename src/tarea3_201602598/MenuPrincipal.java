
package tarea3_201602598;

import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class MenuPrincipal {
    //obj
    Usuarios objuser=new Usuarios();
    Palindroma objpalin=new Palindroma();
    
    public void mostrarMenu(){
        System.out.println("-----------------");
        System.out.println("    Tarea 3");
        System.out.println("    201602598");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras palindromas");
        System.out.println("3. Salir");
        this.controlMenu();
        
    }//menu
    
    public void controlMenu(){
        Scanner scsw=new Scanner(System.in);
        int opcion=scsw.nextInt();
        
        switch(opcion){
            case 1:
                this.swMenuUser();
                break;
                
            case 2:
                System.out.println(); 
                Scanner sc2=new Scanner(System.in);
                System.out.println("-----------------");
                System.out.println("Ingrese una palabra o frase");
                String palin=sc2.nextLine();
                Palindroma pal=new Palindroma();
                
        if(pal.espalindromo(palin)){
             System.out.println();
             System.out.println("-----------------");
            System.out.println("Es una palabra/frase palindroma");
            System.out.println("-----------------");
        }
        else
        {
             System.out.println();
             System.out.println("-----------------");
            System.out.println("No es palindroma");
            System.out.println("-----------------");
        }
         System.out.println();
        this.mostrarMenu();
        break;

            case 3:
                System.out.println("Saliendo del sistema.");
                break;
            
        }//switch
    }
    
    public void swMenuUser(){
        System.out.println();
        System.out.println("-----------------");
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Mostrar todos los usuarios");
        System.out.println("3. Mostrar usuario personalizado");
        System.out.println("4. Menu Principal");
        System.out.println("5. Salir");
        this.controlUser();
    }
    
    public void controlUser(){
        Scanner scuser=new Scanner(System.in);
        int opcion=scuser.nextInt();
        
        switch(opcion){
            case 1:
                objuser.IngresarUsuario();
                this.swMenuUser();
                break;
                
            case 2:
                objuser.ImprimirUsuario();
                this.swMenuUser();
                break;
            
            case 3:
                objuser.UsuarioPersonalizado();
                this.swMenuUser();
                break;
             
            case 4:
                this.mostrarMenu();
                break;
                
            case 5:
                System.out.println("Saliendo del sistema.");
                break;
        }//switch
    }//contrl

    
}
