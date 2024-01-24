package view;

import java.util.Scanner;

public class CUINezet {
    
    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    public void feladatMegjelenito(String szoveg){
        konzolraIr(szoveg + SEP);
    }
    
    public void leirasMegjelenito(String szoveg){
        konzolraIr(szoveg + SEP);
    }
    
    private void konzolraIr(String szoveg){
        System.out.print(szoveg);
    }
    
    public int valasztas(String szoveg){
        konzolraIr(szoveg);
        return sc.nextInt();
    }
    
    public void eredmenyMegjelenito(String szoveg){
        konzolraIr(szoveg);
    }
}
