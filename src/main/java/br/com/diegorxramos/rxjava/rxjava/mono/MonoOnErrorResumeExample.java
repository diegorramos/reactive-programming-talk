package br.com.diegorxramos.rxjava.rxjava.mono;

import reactor.core.publisher.Mono;

public class MonoOnErrorResumeExample {

    public static void main(String[] args) {
        Mono.error(new Exception("error"))
                .onErrorResume((exception) -> Mono.just("1"))
                .subscribe((success) -> {
                    System.out.println("success: " + success);
                }, (error) -> {
                    System.out.println("error: " + error);
                }, () -> {
                    System.out.println("completed");
                });
    }
}
