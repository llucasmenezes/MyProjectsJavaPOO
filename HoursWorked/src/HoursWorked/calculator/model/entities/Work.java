package HoursWorked.calculator.model.entities;

public class Work {
   protected final byte quinzenal = 15;
   protected final byte mensal = 30;

   protected double resultado = 0.0;
   protected double salarioBase;
   protected double horasTrabalhadaPorDia;

    public Work(double horasTrabalhadaPorDia, double salarioBase) {
        this.horasTrabalhadaPorDia = horasTrabalhadaPorDia;
        this.salarioBase = salarioBase;
    }

    public void calculoQuinzenal() {
        resultado = horasTrabalhadaPorDia / salarioBase / quinzenal ;
    }

    public void calculoMensal() {
        resultado = horasTrabalhadaPorDia / salarioBase / mensal ;
    }


    @Override
    public String toString() {
        String tipoCalculo = (resultado == (salarioBase / mensal) * horasTrabalhadaPorDia) ? "Mensal" : "Quinzenal";
        return "Cálculo " + tipoCalculo + ": " + String.format("%.2f", resultado);
    }
}
