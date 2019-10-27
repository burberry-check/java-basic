package study.burberrycheck.oop.abstact.notifier.impl;

import study.burberrycheck.oop.abstact.notifier.Notifier;

public class KakaoNotifier implements Notifier {
    @Override
    public void notifyService() {
        System.out.println(getClass().getSimpleName() + " 카카오 메세지 발송");
    }
}
