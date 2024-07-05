import java.util.Random;
import java.util.Scanner;

public class RandomChoice {
   public static void main(String[] args) {

       // 선택지가 몇개야?
       Scanner sc = new Scanner(System.in);
       System.out.print("선택지 몇개?");
       int cnt = sc.nextInt();
       // 5

       // 선택지 갯수에 따른 배열 만들기
       String 배열[] = new String[cnt];
       // 배열[] = { , , , , }
//         [0] [1] [2] [3] [4]

       // 반복문을 통해서 배열에 넣을 값을 입력받아보세용!
       // 0번째부터 배열의 끝까지 입력을 반복하는 반복문
       // 시작 조건
       for(int i=0; i<배열.length; i++) {
           // i<cnt;
           System.out.print((i+1)+"번째 값?");
           배열[i] = sc.next();
       }

       // 선택지 배열 속에서 랜덤으로 하나 뽑아내기
       Random rd = new Random();
//        rd.nextInt(숫자);

//        숫자 범위에서 랜덤으로 하나 뽑기
       System.out.print("뽑을까요? Yes(1), No(2)");
       if(sc.nextInt() == 1) {
           int x = rd.nextInt(cnt);
           System.out.println(배열[x]);    
//            System.out.println(배열[rd.nextInt(cnt)])
       }     
   }
}
