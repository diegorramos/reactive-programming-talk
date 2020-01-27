package br.com.diegorxramos.rxjava.rxjava.observable;

import io.reactivex.rxjava3.core.Observable;

public class ObservableOnErrorResumeExample {

    public static void main(String[] args) {
        Observable.error(new Exception("error"))
                .onErrorResumeNext((exception) -> Observable.just("1"))
                .subscribe((success) -> {
                    System.out.println("success: " + success);
                }, (error) -> {
                    System.out.println("error: " + error);
                }, () -> {
                    System.out.println("completed");
                });
    }
}
