package com.example.ogrencikayit;

public class Ogrenci {
    private String Adi;
    private String Soyadi;
    private String DogumTarihii;
    private String Sinifi;

    public Ogrenci(String adi, String soyadi, String dogumTarihi, String sinifi) {
        Adi = adi;
        Soyadi = soyadi;
        DogumTarihii = dogumTarihi;
        Sinifi = sinifi;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        Adi = adi;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String soyadi) {
        Soyadi = soyadi;
    }

    public String getDogumTarihii() {
        return DogumTarihii;
    }

    public void setDogumTarihii(String dogumTarihi) {
        DogumTarihii = dogumTarihi;
    }

    public String getSinifi() {
        return Sinifi;
    }

    public void setSinifi(String sinifi) {
        Sinifi = sinifi;
    }
}
