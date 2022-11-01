package org.example.prime;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    /*boolean someOperation(int a, int b){
        return a < b;
    }*/

    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a < b;
            }
        }));
        // 람다식 적용
        System.out.println(tcp.isPrime(13, ((a, b) -> a * a < b)));

        System.out.println(tcp.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a < b/2;
            }
        }));
        // 람다식 적용
        System.out.println(tcp.isPrime(13, ((a, b) -> a < b / 2)));
    }
}
