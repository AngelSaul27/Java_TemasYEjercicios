package Ejercicio_5;

public class Ejercicio_5_7 {
    public static void main(String args[]){
        int i = 1;
        
        while(i <= 10){
            int j = 1;
            do{
                System.out.println(i+" x "+j+" = "+(i*j));
            j++;
            }while(j <= 10);
            System.out.println();
            i++;
        }
    }
}
