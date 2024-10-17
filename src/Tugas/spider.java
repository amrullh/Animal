package Tugas;

public class spider extends Animal{

    spider(int legs){
        super(legs);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Laba - laba sedang makan serangga kecil");

    }
}
