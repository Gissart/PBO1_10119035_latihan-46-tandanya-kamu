package com.tugasPBO;

import java.util.Scanner;
import java.util.Calendar;

/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1 / IF1
  Deskripsi : menampilkan masalah yang terjadi di usia tertentu yang diinputkan user
* */

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        Age ag = new Age(cal.get(Calendar.YEAR));

        System.out.print("Masukkan tahun lahir anda :");
        ag.setYearBirth(scan.nextInt());

        System.out.println("=====Hasil perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+ag.getYearBirth());
        System.out.println("Hari ini tahun : "+ag.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+ag.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu \033[31m"+ag.tandanyaKamu(ag.hitungUmur()));


    }
}
