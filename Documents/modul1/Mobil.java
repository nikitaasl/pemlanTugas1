package modul1;

public class Mobil {
        private String noPlat;
        private String warna;
        private String manufaktur;
        private int kecepatan; // menyimpan kecepatan dalam km/jam
        private double waktu; //menyimpan waktu dalam jam
        private double sekon; //menyimpan waktu dalam detik
        private double kecepatanMs; //menyimpan kecepatan dalam m/s
        
        //Constructor
        public Mobil() {}

        //constructor dengan parameter
        public Mobil(String manufaktur, String noPlat, String warna, int kecepatan){
            this.manufaktur = manufaktur;
            this.noPlat = noPlat;
            this.warna = warna;
        }

        public void setNoPlat(String noPlat){
            this.noPlat =noPlat;
        }

        public String getNoPlat() {
            return noPlat;
        }
        
        public void setWarna(String warna){
            this.warna = warna;
        }

        public String getWarna() {
            return warna;
        }
            
        public void setManufaktur(String manufaktur){
            this.manufaktur = manufaktur;
        }

        public String getManufaktur(){
            return manufaktur;
        }
        
        public void setKecepatan(int kecepatan){
            if (kecepatan>0){
                this.kecepatan = kecepatan;
                this.kecepatanMs = rubahKecepatan(kecepatan); //memanggil method rubahKecepatan
            }else{
                System.out.println("Kecepatan harus lebih dari 0 km/jam!");
            }


        }

        public int getKecepatan(){
            return kecepatan;
        }

        //khusus untuk mengubah kecepatan dari km/jam ke
        private double rubahKecepatan(int kecepatan){
            return kecepatan * 1000 / 3600; // 1 km/jam = 1000 m/3600 detik
        }
        //untuk mengatur waktu dalam perjalanan
        public void setWaktu(double waktu){
            if (waktu>0){
                this.waktu = waktu;
                double waktuSekon = rubahSekon(waktu);
                System.out.println("Waktu dalam sekon:" +waktuSekon + "detik");
            }else{
                System.out.println("Waktu harus lebih dari 0 jam!");
            }
        }
        
        public double getWaktu(){
            return waktu;
        }

        //khusus untuk mengubah jam ke detik
        private double rubahSekon(double waktu){
            return waktu * 3600; // 1 jam = 3600 detik
        }

        public double getSekon(){
            return sekon;
        }

        public double hitungJarak(){
            return kecepatan * waktu; //jarak = kecepatan * waktu
        }

            public void displayMessage(){
            System.out.println("Mobil anda adalah bermerek"+manufaktur);
            System.out.println("mempunyai nomor plat "+noPlat);
            System.out.println("serta memililki warna "+warna);
            System.out.println("Kecepatan dalam km/jam:" +kecepatan);
            System.out.println("Kecepatan dalam m/s:" +kecepatanMs);
            System.out.println("Waktu yang ditempuh adalah "+waktu+"jam");

            //menampilkan jarak dalam km
            System.out.println("Jarak yang dapat ditempuh:" + hitungJarak() + "km");
        }
        }