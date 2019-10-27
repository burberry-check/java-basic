package study.burberrycheck.oop.abstact.notifier.impl;

import study.burberrycheck.oop.abstact.notifier.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyService() {
        System.out.println(getClass().getSimpleName() + " 이메일 발송");
    }
}
