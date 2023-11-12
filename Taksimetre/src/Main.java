import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pricing = 2.20;
        int taksiMetre = 10;
        System.out.printf("Km Giriniz: ");
        Scanner input = new Scanner(System.in);
        double Km = input.nextDouble();
        Calc(pricing,taksiMetre,Km);


    }
    public static  void Calc(double pricing, int taksimetre,double km){
        double total = (pricing*km)+taksimetre;
            double print = (total<20) ?20:total;
        System.out.printf(" Tutar: " + print );

    }
}