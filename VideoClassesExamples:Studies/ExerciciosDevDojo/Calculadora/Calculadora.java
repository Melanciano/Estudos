package Treinos.ExerciciosDevDojo.Calculadora;

public class  Calculadora{


    public void soma(int num1, int num2){
        System.out.println(num1 + num2);
    }


    public void divide(int num1, int num2){
        if(num2 ==0){
            System.out.println(" Não é possivel dividir por zero");
        } else {
            System.out.println(num1/num2);
        }
    }
    public void multiplica(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public void subtrai(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void operacoes(int num1, int num2){
        System.out.println("soma ");
        this.soma(num1,num2);
        System.out.println("subtração ");
        this.subtrai(num1,num2);
        System.out.println("divisão ");
        this.divide(num1,num2);
        System.out.println("multiplicação ");
        this.multiplica(num1,num2);
    }

 public void somaArray(int[] a){
        int soma = 0;
        for( int num : a){
            soma+=num;
        }
     System.out.println(soma);
}

}
