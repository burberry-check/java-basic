package study.burberrycheck.oop.noabstact.v1;

import study.burberrycheck.oop.noabstact.SmsSender;

public class Order {
    private SmsSender smsSender;


    public void cancel(){
        //... 주문취소 처리 로직

        smsSender = new SmsSender();
        smsSender.send();
    }
}
