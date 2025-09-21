import java.util.Scanner;

public class MainLabo2Ex3Part2 {
    public static void main(String[] arg){
        double variable1=50;
        double variable2=1250;
        double chiffreEntr;
        Scanner chifetap=new Scanner(System.in);
        final double constante=0.82;

        double resultat1=variable1*constante;
        double resultat2=variable2*constante;
        double resultat3;
        System.out.print("Entrer le montant en dollars américains :");
        chiffreEntr=chifetap.nextDouble();
        System.out.print(resultat1 +"\n"+resultat2+"\n"+(chiffreEntr*constante));
    }
}
