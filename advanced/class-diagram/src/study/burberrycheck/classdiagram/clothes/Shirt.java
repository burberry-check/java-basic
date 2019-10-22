package study.burberrycheck.classdiagram.clothes;

import study.burberrycheck.classdiagram.Clothes;

/**
 * 셔츠
 * */
public class Shirt extends Clothes {
    private boolean check = false;

    public Shirt(String name) {
        super(name);
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
