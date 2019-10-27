package study.burberrycheck.oop.noabstact;

public class EmailService {
    public void send(){
        System.out.println(getClass().getSimpleName() + " 이메일 발송");
    }
}
