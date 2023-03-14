package br.uninove.telas;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Uninove é 10!");
        System.out.println("Olá ao meu primeiro programa!");
        System.out.println("\tO professor é o \"Traue\"");

        String nome = "Thiago"; //representa textos
        char sexo = 'L';        //representa caracteres
        int idade = 35;         //representa um valor inteiro
        float altura = 1.83f;   //representa variáveis reais
        boolean fumante = true; //representa uma variável binária (0/1, Verdadeiro ou falso..)
        double saldoEmConta = 12342342342.234234; //para reais muito grandes

        System.out.println("Meu mome é: " + nome);
        System.out.println("Eu tenho " + idade + " anos");

        if (fumante) {
            System.out.println("É... ele fuma!");
        } else {
            System.out.println("Não fuma");
        }

        //apenas para mostrar o else if (sem classificar ninguém!)
        if (altura <= 1.2) {
            System.out.println("É pequenino");
        } else if (altura <= 1.5) {
            System.out.println("Tem menos de um metro e meio!");
        } else if (altura <= 1.7) {
            System.out.println("Está na média");
        } else if (altura <= 1.9) {
            System.out.println("É alto");
        } else {
            System.out.println("Muito alto");
        }

        //----------
        float x = 10;
        float y = 3;

        float soma = x + y;
        float subtracao = x - y;
        float mult = x * y;
        float div = x / y;
        float modulo = x % y; //resto de divisão

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A Divisão é: " + div);
        System.out.println("O resto da divisão é: " + modulo);

        float resultado = 3 + 5 * 4; //23
        resultado = (3 + 5) * 4; //32
        //paramos aqui...
    }
}
