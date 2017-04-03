import java.util.*;

public class menu{

    static void wypiszMenu() {

        System.out.println("Witamy w programie Klinika. Którą z dostępnych opcji chcesz wybrać?");
        System.out.println("Aby dodać nowego pacjenta, wybierz 1.");
        System.out.println("Aby przejrzeć listę pacjentów, wybierz 2.");

        int wybor;
        Scanner odczyt = new Scanner(System.in);
        wybor = odczyt.nextInt();

        dodajPacjenta PACJENT = new dodajPacjenta();

        switch(wybor) {
            case 1: {
                PACJENT.dodawaniePacjenta();
                System.out.println("Pacjent został dodany do bazy!");
                menu.wypiszMenu();
            }
            case 2:
                PACJENT.wypisywanie();
                return;
            default: {
                menu.wypiszMenu();
            }
        }
    }
}
