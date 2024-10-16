package HoursWorked.calculator.model.application;

import HoursWorked.calculator.model.entities.Work;

import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);
        String QuinzenalOuMensal;

        do {
                    System.out.println("=============CALCULADORA PRA BURRO=============");
                    System.out.println("Ola, digite seu nome LOGO");
                    String nome = scanner.nextLine();
                    System.out.println("                                ");




            do {
                System.out.println("deseja saber o quanto recebe por hora, mensal ou quinzenal?");
                QuinzenalOuMensal = scanner.nextLine().toLowerCase();
                if (!QuinzenalOuMensal.equals("quinzenal") && !QuinzenalOuMensal.equals("mensal")) {
                    System.out.println("opcao invalida meu chapa, digite 'quinzenal ou mensal' e deixe de gracinha seu seu oiaa..");
                } else {
                    System.out.println("Ok, vou calcular em cima do " + QuinzenalOuMensal);
                }
            } while(!QuinzenalOuMensal.equals("quinzenal") && !QuinzenalOuMensal.equals("mensal"));



            System.out.println("                                ");
            System.out.println("digite seu salario base");
            double salarioBase = scanner.nextDouble();
            System.out.println("Trabalha quantas horas por dia?");
            double horasTrabalhadasPorDia = scanner.nextDouble();

            Work work = new Work(salarioBase, horasTrabalhadasPorDia);

            if(QuinzenalOuMensal.equals("quinzenal")) {
                work.calculoQuinzenal();
            } else{
                work.calculoMensal();
            }


            System.out.println("um momento, calculando");
            System.out.println("            ");
            System.out.println(work);


        } while(var5.equals("sim"));



        do {
            System.out.println("                                ");
            System.out.println("Deseja calcular novamente? 'sim ou nao'");
            var5 = var1.nextLine();
            if (!var5.equals("sim") && !var5.equals("nao")) {
                System.out.println("opcao invalida meu chapa, escolha 'sim ou nao' e rapido que meu sistema ta com a bateria acabando");
            }
        } while(!var5.equals("sim") && !var5.equals("nao"));

        System.out.println("ate logo meu chapa");
    }
}
