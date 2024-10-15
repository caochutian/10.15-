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
        simulator.playSound(new Dog());         //输出"狗的叫声：汪汪汪"
        simulator.playSound(new Cat());         //输出"猫的叫声：喵喵喵"
    }
}
