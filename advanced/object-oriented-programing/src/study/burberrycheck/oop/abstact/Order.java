package study.burberrycheck.oop.abstact;

import study.burberrycheck.oop.abstact.notifier.Notifier;
import study.burberrycheck.oop.abstact.notifier.NotifierFactory;

public class Order {
    public void cancel(boolean kakaoPushEnabled){
        Notifier notifier = NotifierFactory.getInstance().getNotifier(kakaoPushEnabled);
        notifier.notifyService();
    }
}
