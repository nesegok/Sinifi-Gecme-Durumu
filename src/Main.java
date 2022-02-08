import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avarage;

        System.out.print("Matematik notunuz : ");
        int mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        int fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        int turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        int kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        int muzik = input.nextInt();

        if (mat<0||mat>100){
            avarage = (fizik+turkce+kimya+muzik)/4;

        }
        else if (fizik<0||fizik>100){
            avarage = (mat+turkce+kimya+muzik)/4;
        }

        else if (turkce<0||turkce>100){
            avarage = (mat+fizik+kimya+muzik)/4;
        }
        else if (kimya<0||kimya>100){
            avarage = (mat+fizik+turkce+muzik)/4;
        }
        else if (muzik<0||muzik>100){
            avarage = (mat+fizik+turkce+muzik)/4;
        }
        else{
            avarage = (mat+fizik+turkce+kimya+muzik)/5;
        }

        if (avarage<=55){
            System.out.println("Sınıfta kaldınız.");
        }
        else{
            System.out.println("Sınıfı geçtiniz.");

        }
        System.out.print("Ortalamanız : " + avarage);
    }
}


