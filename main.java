import java.util.Scanner;
import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        
    // Skapa en klass Matratt
    // den ska ha ett namn, pris, typ, antal kalorier
    // Typ kan man tänka sig Vegetarisk, Vegansk, Kött
    // Skapa upp några från main och lägg i en List.
    // Skriv ut en dagens lunchmeny!
    // Tips, tänk Listor och exemplet HockeyPlayer vi hade.

    Matratt matratt1 = new Matratt();

    matratt1.name = "carbonara";
    matratt1.price = 105;
    matratt1.type = "kött";
    matratt1.calories = 574;

    Matratt matratt2 = new Matratt();

    matratt2.name = "Fallafelrulle";
    matratt2.price = 95;
    matratt2.type = "vegansk";
    matratt2.calories = 784;

    Matratt matratt3 = new Matratt();

    matratt3.name = "Lassagne";
    matratt3.price = 120;
    matratt3.type = "Kött";
    matratt3.calories = 400;

        ArrayList<Matratt> matSedel = new ArrayList<>();
        matSedel.add(matratt1);
        matSedel.add(matratt2);
        matSedel.add(matratt3);

        //---------KÖR KOD!!-----------//
        System.out.println("Dagens matsedel inehåller:");

     for(int i = 0; i < matSedel.size(); i++)
        System.out.println(matSedel.get(i).name);
  }
}