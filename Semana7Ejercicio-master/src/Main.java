import pkgPizza.base.Pizza;
import pkgPizza.base.Topping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //INSTANCIAMOS PIZZA
        Pizza Vegetariana = new Pizza("Vegetariana", 50.00);
        Pizza Margarita = new Pizza("Margarita", 60.00);
        Pizza Napolitana = new Pizza("Napolitana", 40.00);

        //OPCIONES DE PIZZA
        System.out.println("Selecciona la pizza que deseas pedir:");
        System.out.println("1. Pizza Vegetariana Q.50.00");
        System.out.println("2. Pizza Margarita Q.60.00");
        System.out.println("3. Pizza Napolitana Q.40.00 ");

        Scanner scanner1 = new Scanner(System.in);

        int pizzaOption = scanner1.nextInt();
        Pizza seleccionapizza;

        //MENU DE SELECCION
        switch(pizzaOption){
            case 1:
                seleccionapizza = Vegetariana;
                break;
            case 2:
                seleccionapizza = Margarita;
                break;
            case 3:
                seleccionapizza = Napolitana;
                break;
            default:
                System.out.println("Opcion no Valida, se tomara como opcion Pizza Margarita");
                seleccionapizza = Margarita;
        }

        //INSTANCIANDO TOPPINGS
        Topping tomato = new Topping("Tomato", 5.00);
        Topping cheese = new Topping("Queso", 5.00);
        Topping pepperoni = new Topping("Pepperoni", 5.00);

        //MENU DE SELECCION DE INGREDIENTES
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona los ingredientes para tu pizza:");
        System.out.println("1. Tomato Q.5.00");
        System.out.println("2. Queso Q.5.00");
        System.out.println("3. Pepperoni Q.5.00");
        System.out.println("Presiona 0 para finalizar la selección.");


        int option;
        do {
            //Aca se muestra la pizza con sus ingredientes
            System.out.println("Tu pizza actual: " + seleccionapizza);
            System.out.print("Ingresa el número del ingrediente (0 para terminar): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    seleccionapizza.addTopping(tomato);
                    System.out.println("Se le agregó Tomate a la Pizza");
                    break;
                case 2:
                    seleccionapizza.addTopping(cheese);
                    System.out.println("Se le agregó Queso a la Pizza");
                    break;
                case 3:
                    seleccionapizza.addTopping(pepperoni);
                    System.out.println("Se le agregó Pepperoni a la Pizza");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);


        scanner.close();

        for(int i = 0; i<4; i++){
            System.out.println("Tu pizza se está preparando");
            try{
                Thread.sleep(4000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        //Aca se muestra la pizza final
        System.out.println("");
        System.out.println("Tu pizza final:");
        System.out.println("");
        System.out.println(seleccionapizza);


    }
}






