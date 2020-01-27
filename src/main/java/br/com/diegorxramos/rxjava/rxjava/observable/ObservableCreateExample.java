package br.com.diegorxramos.rxjava.rxjava.observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.Iterator;

public class ObservableCreateExample {

    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3);
        Observable.create((subscriber) -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                while (iterator.hasNext()) {
                    if (subscriber.isDisposed()) return;
                    subscriber.onNext(iterator.next());
                }
                if (!subscriber.isDisposed()) subscriber.onComplete();
            } catch (Exception e) {
                if (!subscriber.isDisposed()) subscriber.onError(e);
            }

        }).subscribe((success) -> {
            System.out.println("success: " + success);
        }, (error) -> {
            System.out.println("error: " + error);
        }, () -> {
            System.out.println("completed");
        });
    }
}
