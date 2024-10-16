package application;

import model.entities.Account;
import model.exception.InsufficientValue;
import model.exception.WithdrawLimit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


        try {
            Account lucas = new Account(001, "Lucas", 200, 300);

            lucas.withdraw(250);
            System.out.println(lucas);

        } catch (InsufficientValue | WithdrawLimit | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }





    }
}