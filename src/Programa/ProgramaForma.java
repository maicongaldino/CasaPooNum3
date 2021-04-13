package Programa;

import java.util.Scanner;

import Classes.Circulo;
import Classes.Quadrado;

public class ProgramaForma {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        int opcao;

        do
        {
            System.out.println("1 -- Calcular área circulo");
            System.out.println("2 -- Calcular área quadrado");
            System.out.println("0 -- Encerrar programa");
            opcao = ler.nextInt();

            switch (opcao)
            {
                case 0:
                    System.out.println("Encerrando o programa...");
                break;
                case 1:
                    System.out.printf("Digite o raio do circulo:   ");
                    circulo.setRaio(ler.nextDouble());

                    System.out.printf("Área do circulo: %.1f Cm²\n\n",circulo.calcularArea());
                    System.out.println(circulo.explicarCalculo() + "\n");
                break;
                case 2:
                    System.out.println("Digite a altura do quadrado:   ");
                    quadrado.setAltura(ler.nextDouble());
                    System.out.println("Digite a base do quadrado:   ");
                    quadrado.setBase(ler.nextDouble());

                    System.out.printf("Área do quadrado: %.1f Cm²\n\n", quadrado.calcularArea());
                    System.out.println(quadrado.explicarCalculo() + "\n");
                break;
            }
        } while (opcao != 0);
        ler.close();
    }
}