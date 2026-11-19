public class Main {
    public static void main(String[] args) {
        SingletonCounter first = SingletonCounter.getInstance();
        SingletonCounter second = SingletonCounter.getInstance();
        // 실행 안에서 getInstance를 두 번 호출하여 각각 first와 second에 저장한 뒤, 두 변수가 실제로 같은 객체를 가리키는지 비교하고 결과를 출력
        System.out.println("같은 인스턴스인가? " + (first == second));
        // first로 증가시키기 전 second의 카운터를 출력하고, first로 increment()를 호출한 후 second의 카운터를 출력
        System.out.println("first로 증가시키기 전 second의 카운터 = " + second.getCount());
        first.increment();
        System.out.println("first로 증가시킨 후 second의 카운터 = " + second.getCount());
    }
}