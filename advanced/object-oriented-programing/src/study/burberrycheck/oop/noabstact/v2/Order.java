package study.burberrycheck.oop.noabstact.v2;

import study.burberrycheck.oop.noabstact.KakaoPush;
import study.burberrycheck.oop.noabstact.SmsSender;

public class Order {
    private SmsSender smsSender;
    private KakaoPush kakaoPush;

    public void cancel(boolean kakaoPushEnabled){
        //... 주문취소 처리 로직

        if (kakaoPushEnabled) {
            kakaoPush = new KakaoPush();
            kakaoPush.push();
        } else {
            smsSender = new SmsSender();
            smsSender.send();
        }
    }
}
