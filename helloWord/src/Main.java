//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroInteiro = 22;
        float numeroReal = 3.1416f;
        char letra = 'F';
        boolean terminou = false;
        System.out.println("Inteiro:" +numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char:" + letra);
        System.out.println("Boleano:" + terminou);
        System.out.println("=============" );

        System.out.printf("\nO valor do float: %.4f", numeroReal );

        System.out.println("=========");
        String nome ="java";
        float media = 8.9f;
        System.out.printf("\nA nota de %s é %.3f", nome, media);
        System.out.format("\nA nota  de %s é %.3f", nome, media);
    }
}