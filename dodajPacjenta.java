
import java.util.*;

public class dodajPacjenta{

    String[][] pacjenci = new String[1][3];
    int i=0;

     public void dodawaniePacjenta(){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię pacjenta:");
        String podajImie = odczyt.nextLine();
        pacjenci[i][0]=podajImie;
        System.out.println("Podaj nazwisko pacjenta:");
        String podajNazwisko = odczyt.nextLine();
        pacjenci[i][1]=podajNazwisko;
        System.out.println("Podaj PESEL pacjenta");
        String podajPESEL = odczyt.nextLine();
        pacjenci[i][2]=podajPESEL;
        i++;
    }

    public void wypisywanie(){
        for (int a = 0; a < 1; a++) {
            System.out.println(pacjenci[a][0] + " " + pacjenci[a][1] + " "  + pacjenci[a][2]);
        }
    }
}
