public final class SingletonCounter {
    private static SingletonCounter instance;
    private int count;

    private SingletonCounter() {
    }

    //instance를 보관하고, instance가 null이면 새로 생성하고, null이 아니면 기존 instance를 반환
    public static SingletonCounter getInstance() {
        if (instance == null) {
            instance = new SingletonCounter();
        }
        return instance;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}