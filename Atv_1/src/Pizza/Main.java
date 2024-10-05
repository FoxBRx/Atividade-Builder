package Pizza;

import Pizza.builder.PizzaBuilder;
import Pizza.entidades.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MontarPizza();

    }

    private static void MontarPizza() {
        Scanner sc = new Scanner(System.in);
        String op1;

        String recheio_1 = "";
        String recheio_2 = "";
        String borda = "";
        String tamanho = "";

        System.out.println("Escolha as opções abaixo para montar a sua pizza:");
        System.out.print("\nQual o tamanho da massa sua pizza?" +
                "\n1 - Pequena" + "\n2 - Media" + "\n3 - Grande" + "\nOpção: ");
        tamanho = sc.nextLine();

        switch (tamanho) {
            case "1":
                tamanho = "Pequena";
                break;
            case "2":
                tamanho = "Media";
                break;
            case "3":
                tamanho = "Grande";
                break;
            default:
                System.out.println("Opcão inválida");
                break;
        }

        System.out.print("\nA pizza terá borda?" + "\n(S/N) \b Opção: ");
        op1 = sc.nextLine();

        if (op1.equalsIgnoreCase("s")){
            op1="";

            System.out.print("\nQual o sabor da borda?" +
                    "\n1 - Catupiry" + "\n2 - Cheddar" + "\nOpção: ");
            op1 = sc.nextLine();

            switch (op1) {
                case "1":
                    borda = "Catupiry";
                    break;
                case "2":
                    borda = "Cheddar";
                    break;
                default:
                    System.out.println("Opcão inválida");
                    break;
            }

        } else {
            borda = "Sem borda";
        }

        System.out.print("\nEscolha uma opção para o primeiro recheio da sua pizza:" +
                "\n1 - Queijo" + "\n2 - Calabresa" + "\n3 - Frango" + "\nOpção: "); op1 ="";
        op1 = sc.nextLine();

        switch (op1) {
            case "1":
                recheio_1 = "Queijo";
                break;
            case "2":
                recheio_1 = "Calabresa";
                break;
            case "3":
                recheio_1 = "Frango";
                break;
            default:
                System.out.println("Opção invpalida");

        }

        System.out.print("\nEscolha uma opção para o Segundo recheio da sua pizza:" +
                "\n1 - Tomate" + "\n2 - Catupiry" + "\n3 - Peperone" + "\nOpção: "); op1 ="";
        op1 = sc.nextLine();
        switch (op1) {
            case "1":
                recheio_2 = "Tomate";
                break;
            case "2":
                recheio_2 = "Catupiry";
                break;
            case "3":
                recheio_2 = "Peperone";
                break;
            default:
                System.out.println("Opção invalida");

        }

        Pizza pizza = new PizzaBuilder()
                .setTamanho(tamanho)
                .setRecheio_1(recheio_1)
                .setRecheio_2(recheio_2)
                .setBorda(borda)
                .build();


        System.out.println(pizza.toString());

    }


}