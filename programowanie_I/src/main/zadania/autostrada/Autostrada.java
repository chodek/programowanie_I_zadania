package zadania.autostrada;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Pawła Recława, many thanks!
 *
 * @author Paweł Recław
 */

public class Autostrada {
    // mapa w której przechowujemy pojazdy.
    // dla szybkiego wyszukiwania kluczem w mapie jest jego nr. rejestracyjny
    private Map<String, InformacjeOPojezdzie> mapaPojazdow = new HashMap<>();


    public void wjazdPojazduNaAutostradę(String numerRejestracyjny, TypPojazdu typPojazdu) {
        InformacjeOPojezdzie informacjeOPojezdzie = new InformacjeOPojezdzie(numerRejestracyjny, typPojazdu, LocalDateTime.now());
        mapaPojazdow.put(numerRejestracyjny, informacjeOPojezdzie);
        System.out.println("Pojazd: " + informacjeOPojezdzie + ", wjechał na autostradę.");
    }

    public InformacjeOPojezdzie znajdzPojazd(String numerRejestracyjny) {
        if (mapaPojazdow.containsKey(numerRejestracyjny)) {
            System.out.println("Pojazd wciąż znajduje się na autostradzie.");
            return mapaPojazdow.get(numerRejestracyjny);
        }
        throw new NieMoznaZnalezcPojazduException();
    }

    public Double wyjazdPojazdu(String numerRejestracyjny) {
        // jeśli nie udało mi się znaleźć samochodu (rejestracji) w mapie, to rzucam exception.
        if (!mapaPojazdow.containsKey(numerRejestracyjny)) {
            throw new NieMoznaZnalezcPojazduException();
        }

        // jeśli exception nie został rzucony to oznacza że pojazd istnieje.
        InformacjeOPojezdzie informacjeOPojezdzie = mapaPojazdow.get(numerRejestracyjny);

        // obliczamy różnicę czasu między momentem wjazdu a obecną datą i godziną.
        Duration długośćPrzejazdu = Duration.between(informacjeOPojezdzie.getDataWjazdu(), LocalDateTime.now());

        double doZapłaty = 0.0;
        // obliczamy kwotę do zapłaty w zależności od typu pojazdu
        switch (informacjeOPojezdzie.getTypPojazdu()) {
            case OSOBOWY:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.3;
                break;
            case MOTOCYKL:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.2;
                break;
            case CIEZAROWY:
                doZapłaty = długośćPrzejazdu.getSeconds() * 0.5;
                break;
        }

        // usuwamy samochód z mapy (z autostrady)
        mapaPojazdow.remove(numerRejestracyjny);
        System.out.println("Pojazd: " + numerRejestracyjny + " opuszcza autostradę, do zapłaty: " + doZapłaty);
        return doZapłaty;
    }


}