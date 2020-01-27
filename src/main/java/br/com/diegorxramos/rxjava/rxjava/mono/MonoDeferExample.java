package br.com.diegorxramos.rxjava.rxjava.mono;

import reactor.core.publisher.Mono;

import java.util.Arrays;

public class MonoDeferExample {

    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3);
        Mono.defer(() -> Mono.just(list))
            .subscribe((success) -> {
                System.out.println("success: " + success);
            }, (error) -> {
                System.out.println("error: " + error);
            }, () -> {
                System.out.println("completed");
            });
    }
}
