public class LAb9RpMm {
    
    class Animal {
        protected String food;
        protected String location;
    
        public Animal(String food, String location) {
            this.food = food;
            this.location = location;
        }
    
        public void makeNoise() {
            System.out.println("Животное издает звук");
        }
    
        public void eat() {
            System.out.println("Животное ест " + food);
        }
    
        public void sleep() {
            System.out.println("Животное спит в " + location);
        }
    }
    
   
    class Dog extends Animal {
        private String breed;
    
        public Dog(String food, String location, String breed) {
            super(food, location);
            this.breed = breed;
        }
    
        
        @Override
        public void makeNoise() {
            System.out.println("Собака лает");
        }
    
        
        @Override
        public void eat() {
            System.out.println("Собака ест " + food);
        }
    
    }
    
    
    class Cat extends Animal {
        private boolean isVaccinated;
    
        public Cat(String food, String location, boolean isVaccinated) {
            super(food, location);
            this.isVaccinated = isVaccinated;
        }
    
        
        @Override
        public void makeNoise() {
            System.out.println("Кошка мурлыкает");
        }
    
        
        @Override
        public void eat() {
            System.out.println("Кошка ест " + food);
        }
    }
    
   
    class Horse extends Animal {
        private String breed;
    
        public Horse(String food, String location, String breed) {
            super(food, location);
            this.breed = breed;
        }
    
       
        @Override
        public void makeNoise() {
            System.out.println("Лошадь ржет");
        }
    
      
        @Override
        public void eat() {
            System.out.println("Лошадь ест " + food);
        }
    }
    
    
    class Veterinarian {
        
        public void treatAnimal(Animal animal) {
            System.out.println("Животное ест " + animal.food + ", находится в " + animal.location);
        }
    }
    
    
    public class Test {
        public void main(String[] args) {
        
            Cat tom = new Cat("рыба", "дом", true);
            Dog rex = new Dog("мясо", "вольер", "лайка");
            Horse soul = new Horse("сено", "конюшня", "эстонская");
    
            
            Veterinarian vet = new Veterinarian();
    
           
            vet.treatAnimal(tom);
            vet.treatAnimal(rex);
            vet.treatAnimal(soul);
        }
    }
    
}
