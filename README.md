
根据题目我们需要创建父类Animal，其包含两个抽象方法（abstract)cry()和getAnimalName(）；分别用于后续子类中对叫声和名字的输出；abstract使方法可不含方法体。 

 
然后通过extends创建子类Dog和Cat，在子类中对父类抽象函数进行重写修改。对父类的方法分别返回动物声音和动物名称。 

 
创建Simulator类，在此类中创建一个方法playsound(Animal animal)，其中变量animal的类型为Animal.在此方法中调用system.out.print1n(）输出"某某动物的叫声是某某某"。 

 
创建主类Application，主类中通过构造函数初始化simulator，类型为Simulator。调用Simulator类中方法playsound，变量为通过构造方法初始化的new Dog(）和new Cat()。 

 
```java
abstract class Animal {                         //抽象类
    public abstract String cry();               // 抽象方法，要求子类实现具体动物的叫声
    public abstract String getAnimalName();     // 抽象方法，要求子类实现获取动物名称
}

class Dog extends Animal {                      //子类狗
    @Override                                   //用于指示一个方法是重写其父类中的方法
    public String cry() {                       //方法cry()
        return "汪汪汪";                        //cry()方法体，此类中输出狗的叫声
    }
    @Override                                   //用于指示一个方法是重写其父类中的方法
    public String getAnimalName() {             //方法getAnimalName()
        return "狗";                            //getAnimalName()方法体，此类中输出动物名称
    }
}

class Cat extends Animal {                      //子类猫
    @Override                                   //用于指示一个方法是重写其父类中的方法
    public String cry() {                       //方法cry()
        return "喵喵喵";                        //cry()方法体，此类中输出猫的叫声
    }
    @Override                                  //用于指示一个方法是重写其父类中的方法
    public String getAnimalName() {            //方法getAnimalName()
        return "猫";                           //getAnimalName()方法体，此类中输出动物名称
    }
}

class Simulator {                               //Simulator类，用于包含playSound方法
    public void playSound(Animal animal) {      //playSound方法，输出动物叫声
        System.out.println(animal.getAnimalName() + "的叫声："+animal.cry());  //输出函数，输出内容为对应变量的名称和叫声
    }
}

public class Application {                      //主类Application
    public static void main(String[] args) {    //主函数main
        Simulator simulator = new Simulator();  //通过Simulator类构造方法，初始化变量simulator，用于输出
        //Dog dog = new Dog()
        simulator.playSound(new Dog());         //输出"狗的叫声：汪汪汪"
        simulator.playSound(new Cat());         //输出"猫的叫声：喵喵喵"
    }
}
```
