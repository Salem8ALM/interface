public class Cat implements Animal{
    private String furCoat;

    public Cat(String furCoat) {
        this.furCoat = furCoat;
    }


    public void eat(){
        System.out.println("this cat is consuming food");
    }
    public void sleep(){
        System.out.println("this cat is sleeping");
    }
    public void makeSound(){
        System.out.println("this cat is meowing");
    }
}
