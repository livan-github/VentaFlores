import java.util.Scanner;
import static java.lang.Math.*;
public class VentaFlores {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su dinero total: ");
        double money = scanner.nextDouble();

        double dinero = money;
        int contador = 0 ;

        if(money >= 70){
            while(money >= 70){
                money -= 70;
                contador++;            
            }

            money = round(money*100.0)/100.0;

            System.out.println("Le alcanza para " + contador + " ramo/s de flores de 70$ y le sobran " + money + "$.");   
            
            contador = 0;
            if(dinero >= 120){
                while(dinero >= 120){
                    dinero -= 120;
                    contador++;            
                }

                dinero = round(dinero*100.0)/100.0;

                System.out.println("Le alcanza para " + contador + " ramo/s de flores de 120$ y le sobran " + dinero + "$."); 
            }else{
                System.out.println("No tiene suficiente dinero para comprar ramos de 120$.");
            }
    

        }else{
            System.out.println("No tiene suficiente dinero.");
        }

    }
    
}
