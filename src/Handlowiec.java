import java.math.BigDecimal;

public class Handlowiec extends Pracownik {
    private BigDecimal prowizja;
    private BigDecimal limitProwizji;

    public void setProwizja(BigDecimal prowizja){
        this.prowizja = prowizja;
    }

    public BigDecimal getProwizja(){
        return prowizja;
    }

    public void setLimitProwizji(BigDecimal limitProwizji){
        this.limitProwizji = limitProwizji;
    }

    public BigDecimal getLimitProwizji(){
        return limitProwizji;
    }
}
