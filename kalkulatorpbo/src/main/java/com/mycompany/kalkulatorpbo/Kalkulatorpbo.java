/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulatorpbo;

/**
 *
 * @author dinnu
 */
import java.util.Scanner;

public class Kalkulatorpbo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------------------------------");
            System.out.println("Silahkan pilih opsi:");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.println("--------------------------------");
            System.out.print("Masukan pilihan [1/2] : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        }
    }
    }

    private static void login(Scanner scanner) {
        while (true) {
            System.out.println("_____________________________");
            System.out.print("Masukkan username: ");
            String users = scanner.next().toLowerCase();
            System.out.print("Masukkan password: ");
            String password = scanner.next();

            if (users.equals("dinu") && password.equals("2323")) {
                System.out.println("_____________________________");
                System.out.println("Anda Berhasil Login!");
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.");
                continue;
            }

            String pilihanLanjutkan;
            do {
                String pilih_operasi;
                int nilai_a = 0;
                int nilai_b = 0;
                double hasil;

                Scanner input_pilihan = new Scanner(System.in);
                System.out.println("_______________________________");
                System.out.println("PILIHAN PENJUMLAHAN ARITMATIKA: ");
                System.out.println("===============================");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Pemangkatan");
                System.out.println("_______________________________");
                System.out.print("Masukkan pilihan [1/2/3/4/5]: ");
                pilih_operasi = input_pilihan.next();

                // Logika
                if (pilih_operasi.equals("1")) {
                    System.out.println("=============================");
                    System.out.println("Masukkan Nilai A: ");
                    nilai_a = input_pilihan.nextInt();
                    System.out.println("Masukkan Nilai B: ");
                    nilai_b = input_pilihan.nextInt();

                    hasil = nilai_a + nilai_b;
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nilai A adalah: " + nilai_a);
                    System.out.println("Masukkan nilai B adalah: " + nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println(">>> Hasil penjumlahan adalah: " + hasil);

                } else if (pilih_operasi.equals("2")) {
                    System.out.println("=============================");
                    System.out.println("Masukkan Nilai A: ");
                    nilai_a = input_pilihan.nextInt();
                    System.out.println("Masukkan Nilai B: ");
                    nilai_b = input_pilihan.nextInt();

                    hasil = nilai_a - nilai_b;
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nilai A adalah: " + nilai_a);
                    System.out.println("Masukkan nilai B adalah: " + nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println(">>> Hasil pengurangan adalah: " + hasil);

                } else if (pilih_operasi.equals("3")) {
                    System.out.println("==============================");
                    System.out.println("Masukkan Nilai A: ");
                    nilai_a = input_pilihan.nextInt();
                    System.out.println("Masukkan Nilai B: ");
                    nilai_b = input_pilihan.nextInt();

                    hasil = nilai_a * nilai_b;
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nilai A adalah: " + nilai_a);
                    System.out.println("Masukkan nilai B adalah: " + nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println(">>> Hasil perkalian adalah: " + hasil);

                } else if (pilih_operasi.equals("4")) {
                    System.out.println("==============================");
                    System.out.println("Masukkan Nilai A: ");
                    nilai_a = input_pilihan.nextInt();
                    System.out.println("Masukkan Nilai B: ");
                    nilai_b = input_pilihan.nextInt();

                    hasil = nilai_a / nilai_b;
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nilai A adalah: " + nilai_a);
                    System.out.println("Masukkan nilai B adalah: " + nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println(">>> Hasil pembagian adalah: " + hasil);

                } else if (pilih_operasi.equals("5")) {
                    System.out.println("=============================");
                    System.out.println("Masukkan Nilai A: ");
                    nilai_a = input_pilihan.nextInt();
                    System.out.println("Masukkan Nilai B: ");
                    nilai_b = input_pilihan.nextInt();

                    hasil = Math.pow(nilai_a, nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nilai A adalah: " + nilai_a);
                    System.out.println("Masukkan nilai B adalah: " + nilai_b);
                    System.out.println("-----------------------------------");
                    System.out.println(">>> Hasil pemangkatan adalah: " + hasil);
                } else {
                    System.out.println("Pilihan tidak ada!");
                }

                while (true) {
                    System.out.print("Lanjutkan operasi perhitungan? (y/n): ");
                    pilihanLanjutkan = input_pilihan.next().toLowerCase();
                    if (pilihanLanjutkan.equals("y") || pilihanLanjutkan.equals("n")) {
                        break;
                    } else {
                        System.out.println("Harap masukan y/n!");
                    }
                }

            } while (pilihanLanjutkan.equals("y"));

            System.out.println("Terima kasih!");
            scanner.close();
            System.exit(0);
        }
    }
}








