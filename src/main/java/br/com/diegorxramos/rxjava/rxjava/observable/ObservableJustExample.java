package br.com.diegorxramos.rxjava.rxjava.observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;

public class ObservableJustExample {

    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3);

        Observable.just(list).subscribe((success) -> {
            System.out.println("success: " + success);
        }, (error) -> {
            System.out.println("error: " + error);
        }, () -> {
            System.out.println("completed");
        });
    }
}
