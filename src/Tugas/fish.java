package Tugas;

public class fish extends Animal implements PET{
    private String nama;

    fish(int legs){
        super(legs);

    }

    @Override // yg dari interface
    public String getname(){
        return this.nama;
    }

    @Override // yg dari interface
    public void setname(String new_nama){
        this.nama = new_nama;
    }
    @Override // yg dari interface
    public void play(){
        System.out.println(this.nama + " sedang bermain dan berenang di laut/danau");

    }
    @Override // yg dari parent class
    public void walk(){
        System.out.println(this.nama + " tidak bisa berjalan karena tidak memiliki kaki");
    }

    @Override // yg dari parent class
    public void eat(){
        System.out.println(this.nama + " Sedang makan biji bijian");
    }


}
