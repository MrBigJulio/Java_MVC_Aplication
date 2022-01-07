import java.math.BigDecimal;

public class Dyrektor extends Pracownik {
    private BigDecimal dodatek;
    private String karta;
    private BigDecimal limitKosztow;

    public void setDodatek(BigDecimal dodatek){
        this.dodatek = dodatek;
    }

    public BigDecimal getDodatek(){
        return dodatek;
    }

    public void setKarta(String karta){
        this.karta = karta;
    }

    public String getKarta(){
        return karta;
    }

    public void setLimitKosztow(BigDecimal limitKosztow){
        this.limitKosztow = limitKosztow;
    }

    public BigDecimal getLimitKosztow(){
        return limitKosztow;
    }
}
