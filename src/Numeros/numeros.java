package Numeros;
import java.util.*;

public class numeros {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int Unumero1=teclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int Unumero2=teclado.nextInt();

        int Anumero1=(int)(Math.random()*100+1);
        int Anumero2=(int)(Math.random()*100+1);


        if(Unumero1>Unumero2){
            System.out.println(""+Unumero1+ " es mayor a " +Unumero2+"");

        }
        else if(Unumero2>Unumero1){
            System.out.println(""+Unumero2+ " es mayor a " +Unumero1+"");
        }

        System.out.println("Los numeros randoms son:");
        System.out.println(""+Anumero1+" y "+Anumero2+"");

        if(Anumero1>Anumero2){
            System.out.println(""+Anumero1+ " es mayor a " +Anumero2+"");

        }
        else if(Anumero2>Anumero1){
            System.out.println(""+Anumero2+ " es mayor a " +Anumero1+"");
        }


    }

}
