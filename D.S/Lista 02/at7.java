import java.util.Scanner;

public class at7 {
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.println("1. Celsius para Kelvin");
        System.out.println("2. Celsius para Fahrenheit");
        System.out.println("3. Fahrenheit para Celsius");
        System.out.println("4. Kelvin para Celsius");
        System.out.println("5. Fahrenheit para Kelvin");
        System.out.println("6. Kelvin para Fahrenheit");
        System.out.print("ESCOLHA UM TIPO DE CONVERÇÃO:");
        int esco = teclado.nextInt();
        switch (esco){
            case 1:
                System.out.print("Informe a temperatura: ");
                int cel_kel = teclado.nextInt();
                double conv1 = cel_kel + 373.15;
                System.out.println("K = "+conv1);
                break;
            case 2:
                System.out.print("Informe a temperatura: ");
                int cel_fah = teclado.nextInt();
                double conv2 = cel_fah * 1.8 + 32;
                System.out.println("°F = "+conv2);
                break;
            case 3:
                System.out.print("Informe a temperatura: ");
                int fah_cel = teclado.nextInt();
                double conv3 = (fah_cel - 32) / 1.8;
                System.out.println("°C = "+conv3);
                break;
            case 4:
                System.out.print("Informe a temperatura: ");
                int kel_cel = teclado.nextInt();
                double conv4 = kel_cel - 273.15;
                System.out.println("°C = "+conv4);
                break;
            case 5:
                System.out.print("Informe a temperatura: ");
                int fah_kel = teclado.nextInt();
                double conv5 =  (fah_kel + 459.67) * 5 / 9;
                System.out.println("K = "+conv5);
                break;
            case 6:
                System.out.print("Informe a temperatura: ");
                int kel_fah = teclado.nextInt();
                double conv6 = kel_fah * 1.8 - 459.67;
                System.out.println("°F = "+conv6);
                break;
        }
    }
}
