package javaCore.singletonEnum;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.setValue(10);
        System.out.println(singleton.getValue());
    }
}
 enum SingletonEnum {
    INSTANCE;
    SingletonEnum(int value){
        this.value = value;
    }

    public int value;

      SingletonEnum() {
     }

     public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}