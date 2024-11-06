public class Dog implements Animal {
private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat(){
       System.out.println("this dog is eating beans");
    }
    public void sleep(){
        System.out.println("this dog snores");
    }
    public void makeSound(){
        System.out.println("this dog is barking");
    }
}
