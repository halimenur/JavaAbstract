package com.company;

public class Main {

    public static void main(String[] args) {
           WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
           womanGameCalculator.GameOver();
           //Abstrack sınıflar asla newlenemez
//           GameCalculator gameCalculator=new GameCalculator() {
//               @Override
//               public void Hesapla() {
//
//               }
//           }

        GameCalculator gameCalculators=new WomanGameCalculator();

    }
}
