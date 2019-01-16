import java.util.Scanner;

public class RainStorm {
    public static void main (String[]args){
        double roofLenth;
        double roofWidth;
        //double areaRoof;
        double rainFall;
        double rainFallVol;
        double rainfallVolinGal;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input length of roof in feet:");
        roofLenth= keyboard.nextDouble();
        System.out.println("Input the width of roof in feet:");
        roofWidth=keyboard.nextDouble();
        System.out.println("Input Rainfall amount in inches:");
        rainFall= keyboard.nextDouble();
        //areaRoof=roofLenth*12*roofWidth*12;
        rainFallVol=roofLenth*12*roofWidth*12*rainFall;
        System.out.println("Rainfall Volume is  " +rainFallVol +"  cubic inches");
        rainfallVolinGal=rainFallVol/231;

        System.out.println("The Run off Volume of water in gallons is: " +rainfallVolinGal + " in Gallon");


    }
}
