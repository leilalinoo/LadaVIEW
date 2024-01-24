package main;

import model.Lada;
import view.CUINezet;

public class LogikaiProgram {

    public static void main(String[] args) {
        Lada arany = new Lada("arany", "én rejtema kincset!");
        Lada ezust = new Lada("ezüst", "nem én rejtem a kincset!", true);
        Lada bronz = new Lada("bronz", "az arany hazudik!");
        
        CUINezet view = new CUINezet();
        view.feladatMegjelenito("Csak 1 igaz!");
        view.leirasMegjelenito(arany.getAnyag()+": "+arany.getFelirat());
        view.leirasMegjelenito(ezust.getAnyag()+": "+ezust.getFelirat());
        view.leirasMegjelenito(bronz.getAnyag()+": "+bronz.getFelirat());
        
        view.valasztas("melyik (0..2): ");
        view.eredmenyMegjelenito("nem talált, a kincset nem a(z) arany rejti");
    }
    
}
