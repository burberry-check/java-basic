package study.burberrycheck.oop.abstact.notifier;

public interface NotifierFactory {
    Notifier getNotifier(boolean pushEnabled);

    static NotifierFactory getInstance(){
        return new DefaultNotifierFactory();
    }
}
