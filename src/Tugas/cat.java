package Tugas;

public class cat extends Animal implements PET{
    private String nama;
    public cat(int legs, String nama){
        super(legs);
        this.nama = nama;

    }
    @Override // yg dari intercafe
    public String getname(){
        return this.nama;
    }

    @Override // yg dari interface
    public void setname(String new_nama){
        this.nama = new_nama;
    }
    @Override // yg dari interface
    public void play(){
        System.out.println(this.nama + " sedang bermain di daratan/taman");

    }
    @Override // yg dari parent class
    public void eat(){
        System.out.println(this.nama + " Sedang makan whiskas");
    }

}
