import java.math.BigDecimal;

public class View<T> {
    public void menu(){
        System.out.println("MENU");
        System.out.println("    1. Lista pracowników");
        System.out.println("    2. Dodaj pracownika");
        System.out.println("    3. Usuń pracownika");
        System.out.println("    4. Kopia zapasowa\n");
        System.out.print("Wybór>");
    }

    public void showDyrektor(Dyrektor dyrektor){
        System.out.println("Identyfikator PESEL           :    " + dyrektor.getPesel());
        System.out.println("Imię                          :    " + dyrektor.getImie());
        System.out.println("Nazwisko                      :    " + dyrektor.getNazwisko());
        System.out.println("Stanowisko                    :    " + dyrektor.getStanowisko());
        System.out.println("Wynagrodzenie (zł)            :    " + dyrektor.getWynagrodzenie());
        System.out.println("Telefon służbowy numer        :    " + dyrektor.getTelefon());
        System.out.println("Dodatek służbowy (zł)         :    " + dyrektor.getDodatek());
        System.out.println("Karta służbowa numer          :    " + dyrektor.getKarta());
        System.out.println("Limit kosztów/miesiąc (zł)    :    " + dyrektor.getLimitKosztow());
    }

    public void showHandlowiec(Handlowiec handlowiec){
        System.out.println("Identyfikator PESEL           :    " + handlowiec.getPesel());
        System.out.println("Imię                          :    " + handlowiec.getImie());
        System.out.println("Nazwisko                      :    " + handlowiec.getNazwisko());
        System.out.println("Stanowisko                    :    " + handlowiec.getStanowisko());
        System.out.println("Wynagrodzenie (zł)            :    " + handlowiec.getWynagrodzenie());
        System.out.println("Telefon służbowy numer        :    " + handlowiec.getTelefon());
        System.out.println("Prowizja (%)                  :    " + handlowiec.getProwizja());
        System.out.println("Limit prowizji/miesiąc (zł)   :    " + handlowiec.getLimitProwizji());
    }

    public void listaPracownikow(T pracownik){
        System.out.println("1. Lista pracowników\n");
        if (pracownik instanceof Dyrektor) showDyrektor((Dyrektor) pracownik);
        else if (pracownik instanceof Handlowiec) showHandlowiec((Handlowiec) pracownik);
    }
}
