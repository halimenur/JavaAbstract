package com.company;

public abstract  class GameCalculator {
    //Kim inheritance ediyorsa kullanmak zorunda ama kendi hesaplasını yazmak zorundadır
    //Override etmek zorunda
    //Tamamlanmış operasyon
    public abstract  void Hesapla();
    //GameOver kim kullanıyorsa olduğu gibi(final) kullanmak zorundadır
    public final void GameOver(){
        System.out.println("Oyun bitti");
    }
}
