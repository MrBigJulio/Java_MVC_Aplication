class Pracownik {
    private String pesel;
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private String wynagrodzenie;
    private String telefon;

    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public String getPesel(){
        return pesel;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public String getImie(){
        return imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public void setStanowisko(String stanowisko){
        this.stanowisko = stanowisko;
    }

    public String getStanowisko(){
        return stanowisko;
    }

    public void setWynagrodzenie(String wynagrodzenie){
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getWynagrodzenie(){
        return wynagrodzenie;
    }

    public void setTelefon(String telefon){
        this.telefon = telefon;
    }

    public String getTelefon(){
        return telefon;
    }

}
