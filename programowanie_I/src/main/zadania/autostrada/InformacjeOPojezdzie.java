package zadania.autostrada;

import java.time.LocalDateTime;
/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Pawła Recława, many thanks!
 *
 * @author Paweł Recław
 */
public class InformacjeOPojezdzie {
    private String nrRej;
    private TypPojazdu typPojazdu;
    private LocalDateTime dataWjazdu;

    public InformacjeOPojezdzie(String nrRej, TypPojazdu typPojazdu, LocalDateTime dataWjazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
        this.dataWjazdu = dataWjazdu;
    }

    public String getNrRej() {
        return nrRej;
    }

    public TypPojazdu getTypPojazdu() {
        return typPojazdu;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }
}