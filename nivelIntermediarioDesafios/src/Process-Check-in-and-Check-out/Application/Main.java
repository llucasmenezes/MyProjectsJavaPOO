package Application;

import model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


            try {
                System.out.println("Numero do quarto: ");
                int numberRoom = scanner.nextInt();
                System.out.println("Data do check-in (dd/MM/yyyy): ");
                Date checkIn = sdf.parse(scanner.next());
                System.out.println("Data do check-out (dd/MM/yyyy): ");
                Date checkOut = sdf.parse(scanner.next());

                Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
                System.out.println("Reserva: " + reservation);

                System.out.println("Deseja atualizar a sua reserva?  1. sim \n 2. nao");

                System.out.println();
                System.out.println("Digite a data de atualizacao da sua reserva");
                System.out.print("Data do check-in: (dd/MM/yyyy): ");
                checkIn = sdf.parse(scanner.next());
                System.out.print("Data do check-out: (dd/MM/yyyy): ");
                checkOut = sdf.parse(scanner.next());

                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reserva: " + reservation);
            } catch (ParseException e) {
                System.out.println("Data inválida");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na sua reserva: " + e.getMessage());
            } finally {
                scanner.close();
            }



    }
}