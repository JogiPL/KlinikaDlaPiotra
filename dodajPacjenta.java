import java.util.*;

public class dodajPacjenta{

    String[][] pacjenci = new String[1][1];
    int i=1;

    void dodawaniePacjenta(){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię pacjenta:");
        String podajImie = odczyt.nextLine();
        pacjenci[i-1][0]=podajImie;
        System.out.println("Podaj nazwisko pacjenta:");
        String podajNazwisko = odczyt.nextLine();
        pacjenci[i-1][1]=podajNazwisko;
        System.out.println("Podaj PESEL pacjenta");
        String podajPESEL = odczyt.nextLine();
        pacjenci[i-1][2]=podajPESEL;
        i++;
    }


    void wypisywanie(){
        for (int a = 0; a <i; a++) {
            System.out.println(pacjenci[a][0]); //+ pacjenci[a][1] + pacjenci[a][2]);
        }
    }
}
