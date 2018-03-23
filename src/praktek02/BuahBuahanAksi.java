/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author ASUS
 */
public class BuahBuahanAksi {

    public static void main(String[] args) {

        BuahBuahan Rambutan = new BuahBuahan();

        Rambutan.bentuknya = "Bundar";
        Rambutan.rasanya = "Manis";
        Rambutan.warnanya = "Merah Daging Putih";
        Rambutan.ukurannya = "Kecil";
        Rambutan.kandungannya = "Vitamin A,B&C";
        Rambutan.caramenanamnya = "Tanam Bijinya";
        Rambutan.cetakInfo();

        BuahBuahan Anggur = new BuahBuahan();

        Anggur.bentuknya = "Bundar";
        Anggur.rasanya = "Manis";
        Anggur.warnanya = "Ungu Daging Putih";
        Anggur.ukurannya = "Sangat Kecil";
        Anggur.kandungannya = "Vitamin A";
        Anggur.caramenanamnya = "Tanam Bijinya";
        Anggur.cetakInfo();

        BuahBuahan Kelapa = new BuahBuahan();

        Kelapa.bentuknya = "Bundar";
        Kelapa.rasanya = "Manis";
        Kelapa.warnanya = "Hijau Daging Putih";
        Kelapa.ukurannya = "Besar";
        Kelapa.kandungannya = "Vitamin A,B&C";
        Kelapa.caramenanamnya = "Tanam Tunasnya";

        Kelapa.cetakInfo();
    }

}
