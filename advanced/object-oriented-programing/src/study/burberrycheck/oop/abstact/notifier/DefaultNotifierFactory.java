package study.burberrycheck.oop.abstact.notifier;

import study.burberrycheck.oop.abstact.notifier.impl.KakaoNotifier;
import study.burberrycheck.oop.abstact.notifier.impl.SmsNotifier;

public class DefaultNotifierFactory implements NotifierFactory {
    @Override
    public Notifier getNotifier(boolean pushEnabled) {
        if (pushEnabled) {
            return new KakaoNotifier();
        } else {
            return new SmsNotifier();
        }
    }
}
