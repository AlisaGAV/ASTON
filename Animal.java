 public class Animal {
    static int countAnimal = 0;
    Animal(){
        countAnimal++;
    }
    void run (int range) {
        System.out.println("Животное бежит " + range + " м");
    }
    void swim (int range){
        System.out.println("Животное плывет " + range + " м");
    }
    public static int getCountAnimal(){
        return countAnimal;
    }
}
 
class Cat extends Animal{
    String name;
    static int countCat = 0;
 
    Cat (String name){
        super();
        countCat++;
        this.name = name;
    }
 
    @Override
    void run(int range) {
        if (range >= 200) {
            System.out.println(name+ " больше 200 м не бегет");
        } else {
            System.out.println(name + " пробежал " + range + " м");
        }
    }
 
    @Override
    void swim(int range) {
        System.out.println("Котики не плавают");
    }
 
    static int getCountCat(){
        return countCat;
    }
 
}
 
class Dog extends Animal{
    String name;
    static int countDod = 0;
 
    Dog(String name){
        super();
        countDod++;
        this.name = name;
    }
 
    @Override
    void run(int range) {
        if (range >= 500) {
            System.out.println(name+ " больше 500 м не бегет");
        } else {
            System.out.println(name+ " пробежал " + range + " м");
        }
 
    }
 
    @Override
    void swim(int range) {
        if (range >= 10) {
            System.out.println(name + " не плывет больше " +range+ " м");
        } else {
            System.out.println(name + " проплыл " + range + " м");
        }
    }
 
    static int getCountDod (){
        return countDod;
    }
}
  
class Main extends Animal {
    public static void main(String[] args) {
 
        Cat barsik = new Cat("Кошка");
        Dog tuzik = new Dog("Пёс");
        Cat barsik1 = new Cat("Кот");
        Dog tuzik1 = new Dog("Собака");
        barsik.swim(50);
        barsik1.swim(1);
        tuzik.swim(9);
        tuzik1.swim(10);
        barsik.run(150);
        barsik1.run(201);
        tuzik.run(500);
        tuzik1.run(499);

        System.out.println("Всего животных: " +Animal.getCountAnimal());
        System.out.println("Всего котов: "+Cat.getCountCat());
        System.out.println("Всего собак: "+Dog.getCountDod());
 
    }
}

