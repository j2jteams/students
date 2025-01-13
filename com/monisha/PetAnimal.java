package com.monisha;

class PetAnimal {
    String name;

    public PetAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void sound() {
        System.out.println("sound");
    }
}

    class Dog extends PetAnimal {

        public Dog(String name) {
            super(name);
        }

        public void sound() {
            System.out.println(this.name+" says Woof ");
        }
    }


    class Cat extends PetAnimal {
        public Cat(String name) {
            super(name);
        }

        public void sound() {
            System.out.println(name + " says Meow ");
        }

    }



 class test {

     public static void main(String[] args) {
         Dog dog = new Dog("Gimmy");
         Cat cat = new Cat("Arbo");
         dog.sound();
         cat.sound();
     }


}

