package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.printf("%s subscribed to %s\n", name, subscription.getClass().getName());
    }

    @Override
    public void onNext(News item) {
        System.out.printf("%s get the news (%s): %s\n", name, item.getClass().getName(), item.getContent());
    }

    @Override
    public void onError(Throwable throwable) {
        //throw error
    }

    @Override
    public void onComplete() {
        //Method invoked when it is known that no additional Subscriber method invocations will occur for a Subscription that is not already terminated by error, after which no other Subscriber methods are invoked by the Subscription.
    }
    // You need to implement this class
}
