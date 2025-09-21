//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test1 {

     static class Calculatrice  {

        int a;
        int b;

        int add(int a,int b) {
            return a+b;
        }

        int soustraction(int a,int b) {
            return a-b;
        }
        int multiplication(int a,int b){
            return a*b;
        }

        int division (int a,int b){
            return a/b;
        }


    }

    public static void main(String[] args) {
        Calculatrice obj=new Calculatrice();
        System.out.print(obj.add(5,6));
    }
}

