package src;
/**
 * Trouvez et corrigez les probl�mes.
 *
 * @author Louis Hamel
 *
 */
public class Principale {

    public static void main(String[] args) {

        exerciceConvString();

        demoWrapper(0);

        stringToInt("39");
    }

    /**
     * Montre l'addition entre nombres � virgule flottante.
     */
    public static void exerciceConvString() {

        double a;
        float b;
        a = 25 + 2;
        b = 70.5;

        System.out.println(a + " + " + b + " = " + a + b);

    }

    /**
     * Trouve et affiche le successeur de i.
     *
     * @param i
     */
    public static void demoWrapper(Integer i) {

        int next = i + 1;

        System.out.println(String.format("Le successeur de %d est %d", i, next));

    }

    /**
     * Convertit l'argument en nombre entier, puis affiche son successeur.
     *
     * @param stringNumber
     */
    public static void stringToInt(String stringNumber) {
// TODO Auto-generated method stub

        int i = Integer.parseInt(stringNumber);
        i++;

        System.out.println(String.format("Le successeur de %s est %d", stringNumber, i));
    }

}
