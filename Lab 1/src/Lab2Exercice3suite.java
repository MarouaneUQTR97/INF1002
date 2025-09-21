import java.util.Scanner;

public class Lab2Exercice3suite  {
    public static void main(String[] args) {
        double variable1=50;
        double variable2=1250;
        double chiffreEntre;
        final double constante=0.82;


        Scanner scan=new Scanner(System.in);

        chiffreEntre=scan.nextDouble();


        double resultat1=variable1*constante;
        double resultat2=variable2*constante;

        System.out.println(resultat1 + " $");
        System.out.println(resultat2 + " $");
        System.out.print(chiffreEntre*constante + " $");


    }}


