import java.util.Scanner;

public class Teste {
    public static void main (String []args){
       entradaUsuario();
    }
    public static double calculaMedia(double somatorioEntradas, int contador){
        double media = somatorioEntradas / contador;
        return media;
    }
    public static String resultado(double media){
        return (media >= 7) ? "O aluno está aprovado" : "O aluno está reprovado";
    }
    public static void entradaUsuario (){
        double somarEntrada = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite uma nota: ");
            double entradas = sc.nextDouble();
            if (entradas == 0){
                break;
            }else{
                somarEntrada += entradas;
                cont += 1;
            }
        }
        double media = calculaMedia(somarEntrada, cont);
        System.out.println(media);
        System.out.println(resultado(media));
    }
}
