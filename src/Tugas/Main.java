package Tugas;

public class Main {
    public static void main(String[] args) {
        // LABA - LABA
        spider spider1 = new spider(8);
        int kaki_laba_laba = spider1.legs;
        System.out.println("Kaki laba - laba adalah : "+ kaki_laba_laba );
        spider1.eat();



        // KUCING
        System.out.println( "\n");
        cat cat1= new cat(4, "Pablo");
        String Nama_Kucing = cat1.getname();
        int kaki_kucing = cat1.legs;
        System.out.println("Nama kucing adalah : " +Nama_Kucing);
        System.out.println("Kaki kucing berjumlah : " +kaki_kucing);
        cat1.setname("Excalibur");
        String Nama_baru_kucing = cat1.getname();
        System.out.println("Set Nama baru kucing adalah : " + Nama_baru_kucing);
        cat1.eat();
        cat1.play();

        //ikan
        System.out.println( "\n");
        fish fish1= new fish(0);
        String nama_ikan = fish1.getname();
        int kaki_ikan = fish1.legs;
        System.out.println("Nama ikan adalah : " + nama_ikan);
        System.out.println("Kaki ikan berjumlah : " +kaki_ikan);
        fish1.setname("Martinez");
        String Nama_baru_ikan = fish1.getname();
        System.out.println("Set Nama baru ikan adalah : " + Nama_baru_ikan);
        fish1.eat();
        fish1.play();
        fish1.walk();






    }
}
