// 부모 클래스
class Parent {
    public int Test(int i, int j) {
        return i + j;
    }
}

// 자식 클래스
class Child extends Parent {

    @Override
    public int Test(int i, int j) {
        // 부모 클래스의 Test 메서드를 호출하여 기본 동작을 수행하고, 추가로 출력 메시지를 표시
        int result = super.Test(i, j);
        System.out.println("Override");
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        // Parent 클래스의 Test 메서드 호출
        System.out.println(p.Test(1,2));

        // Child 클래스의 오버라이딩된 Test 메서드 호출
        System.out.println(c.Test(1,3));
    }
}

