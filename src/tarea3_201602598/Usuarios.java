package tarea3_201602598;
import java.util.Scanner;


public class Usuarios {
private String nombre[]=new String[5];
//obj
public void IngresarUsuario(){
    Scanner sciu=new Scanner(System.in);
    
    for(int i=0;i<nombre.length;i++){
        System.out.println("-----------------");
        System.out.println("Ingrese un nombre: "+"("+(i+1)+")");
        nombre[i]=sciu.nextLine();
    
    }//for
    System.out.println("-----------------");
    
   
}//IngresarUsuario

public void ImprimirUsuario(){
    System.out.println("<-----USUARIOS EXISTENTES:----->");
    for(int i=0;i<nombre.length;i++){
         System.out.println("-----------------");
        System.out.println((i+1)+". "+nombre[i]);
    }
    
}//imprimirUsuario
    

public void UsuarioPersonalizado(){
    Scanner sciu2=new Scanner(System.in);
    boolean per=false;
    String nombreper;
    System.out.println("-------------------");
    System.out.println("Ingrese el nombre de usuario: ");
    nombreper=sciu2.nextLine();
    
    for(int i=0;i<nombre.length;i++){
        if(nombreper.equalsIgnoreCase(nombre[i])){
            per=true;
        }
    }//for
    if(per==true){
        System.out.println();
        System.out.println("<----------------->");
        System.out.println("Usuario: "+nombreper);
        System.out.println("<----------------->");
    }
    else{
        
        System.out.println();
        System.out.println("<------------------------------->");
        System.out.println("No existe ningun usuario con ese nombre");
        System.out.println("<------------------------------->");
    }
        
    
}//userper


}//class
