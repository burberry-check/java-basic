package study.burberrycheck.oop.abstact.notifier.impl;

import study.burberrycheck.oop.abstact.notifier.Notifier;

public class SmsNotifier implements Notifier {
    @Override
    public void notifyService() {
        System.out.println(getClass().getSimpleName() + " SMS 발송");
    }
}
