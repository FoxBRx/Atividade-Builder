package Relatorio;

import Relatorio.builder.RelatorioBuilder;
import Relatorio.entidades.Relatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String titulo = "";
        String corpo = "";
        String rodape = "";

        System.out.println("Informe o titulo do relatorio: ");
        titulo = sc.nextLine();

        System.out.println("Informe o corpo do relatorio: ");
        corpo = sc.nextLine();

        System.out.println("Informe o rodape do relatorio: ");
        rodape = sc.nextLine();

        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo(titulo)
                .setCorpo(corpo)
                .setRodape(rodape)
                .build();

        System.out.println(relatorio.toString());
    }
}
