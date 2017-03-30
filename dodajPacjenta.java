import java.util.*;

public class dodajPacjenta {
    public int i = 1;
    String[][] pacjenci = new String[i][3];
    void dodawaniePacjenta(){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię pacjenta:");
        String podajImie = odczyt.nextLine();
        pacjenci[i-1][0]=podajImie;
        System.out.println("Podaj nazwisko pacjenta:");
        String podajNazwisko = odczyt.nextLine();
        pacjenci[i-1][1]=podajNazwisko;
        System.out.println("Poda PESEL pacjenta");
        String podajPESEL = odczyt.nextLine();
        pacjenci[i-1][2]=podajPESEL;
        i++;
    }
}
