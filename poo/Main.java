package poo;

public class Main {
    public static void main(String[] args) {
        Hyundai hb20 = new Hyundai();
        
        hb20.setModelo("HB20");
        hb20.setCor("Vermelho");
        hb20.setPotencia(100);
        hb20.setAno(2005);

        hb20.infoCarro();

        hb20.alarme();

        Hyundai creta = new Hyundai("Creta", "Verde", 200, 2020);

        creta.infoCarro();
        creta.alarme();
     
    }
    
}
