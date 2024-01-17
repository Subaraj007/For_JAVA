class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sounds.");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog says meow");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Pig says wee");
    }
}
