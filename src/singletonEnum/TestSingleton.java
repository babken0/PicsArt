package singletonEnum;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.setValue(10);
        System.out.println(singleton.getValue());
    }
}
 enum SingletonEnum {
    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}