package Treinos.ExerciciosDevDojo.Banco;

public class Conta {
  public String titular;
   public int numConta;
   public String agencia;
   public double saldo;
   public String diaAbertura;


   public void saca(double valor){
       this.saldo -= valor;
   }
   public void deposita(double valor){
       this.saldo += valor;
   }
   public double calculaRendimento(){
       return this.saldo * 0.1;
   }
   public void dadosImpressao(){
       System.out.println("Titular: " + this.titular);
       System.out.println("Numero da conta: " + this.numConta );
       System.out.println("Numero da agência: " + this.agencia);
       System.out.println("Valor do saldo: " + this.saldo);
       System.out.println("Data de abertura: " + this.diaAbertura);
   }




}
