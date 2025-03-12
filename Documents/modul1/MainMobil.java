package modul1;

import java.util.Scanner;
    public class MainMobil {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

                //instan objek baru m1
                Mobil m1 = new Mobil();
                System.out.println("Masukkan data mobil pertama");

                System.out.println("Masukkan kecepatan mobil:");
                int kecepatan1 = scanner.nextInt();
                scanner.nextLine();
                m1.setKecepatan(kecepatan1);
                
                System.out.println("Masukkan manufaktur mobil :");
                String manufaktur1 = scanner.nextLine();
                m1.setManufaktur(manufaktur1);
                
                System.out.println("Masukkan nomor plat mobil :");
                String noPlat1 = scanner.nextLine();
                m1.setNoPlat(noPlat1);

                System.out.println("Masukkan warna mobil :");
                String warna1 = scanner.nextLine();
                m1.setWarna(warna1);

                System.out.print("Masukkan waktu perjalanan mobil");
                double waktu = scanner.nextDouble();
                scanner.nextLine();
                m1.setWaktu(waktu);

                System.out.println("================");

                //instan objek baru m2
                Mobil m2 = new Mobil();
                System.out.println("Masukkan data mobil kedua");

                System.out.print("Masukkan kecepatan mobil:");
                int kecepatan2 = scanner.nextInt();
                scanner.nextLine();
                m2.setKecepatan(kecepatan2);

                System.out.println("Masukkan manufaktur mobil :");
                String manufaktur2 = scanner.nextLine();
                m2.setManufaktur(manufaktur2);

                System.out.println("Masukkan nomor plat mobil :");
                String noPlat2 = scanner.nextLine();
                m2.setNoPlat(noPlat2);

                System.out.println("Masukkan warna mobil :");
                String warna2 = scanner.nextLine();
                m2.setWarna(warna2);

                System.out.print("Masukkan waktu perjalanan mobil");
                double waktu2 = scanner.nextDouble();
                scanner.nextLine();
                m2.setWaktu(waktu2);

                m2.displayMessage();
                System.out.println("================");

                //menampilkan data mobil
                System.out.println("Data mobil pertama");
                m1.displayMessage();

                System.out.println("================");

                System.out.println("Data mobil kedua");
                m2.displayMessage();

                System.out.println("================");

                //menawarkan kepada user untuk merubah warna mobil
                System.out.println("Apakah anda ingin merubah warna mobil pertama?");
                String pilihan = scanner.nextLine();

               //Memproses perubahan warna pada mobil pertama 
                if (pilihan.equals("iya")) {
                System.out.print("Masukkan warna baru mobil pertama: ");
                String warnaBaru = scanner.nextLine();
                m1.setWarna(warnaBaru);
                System.out.println("Warna mobil pertama berhasil diubah!");
            }
            
                System.out.println("================");

               //Menampilkan hasil perubahan
                System.out.println("Data mobil pertama setelah diubah warna");
                m1.displayMessage();

                scanner.close();

        }
        }