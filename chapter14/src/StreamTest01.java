import java.util.*;
import java.util.stream.IntStream;

public class StreamTest01 {

    public static void main(String[] args) {
        // programmers 문제, 크기가 작은 부분 문자열
        // https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=java
        String s = "500220839878";
        String p = "7";
        /*
        range(a, b) => [a,b) 범위 내의 int[] stream 생성
        filter(Predicate<T> booleanLambda) => 조건에 안 맞는 요소 제거한 stream 반환
        count() => stream 개수 세기
        */
        long count = IntStream.range(0, s.length() - p.length() + 1).filter(
                (i) -> Integer.parseInt(s.substring(i, i + p.length())) <= Integer.parseInt(p)
        ).count();
        System.out.println("count = " + count);
    }
}
