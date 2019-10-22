package study.burberrycheck.classdiagram.room;

import study.burberrycheck.classdiagram.Clothes;
import study.burberrycheck.classdiagram.Room;
import study.burberrycheck.classdiagram.clothes.Jean;
import study.burberrycheck.classdiagram.clothes.Shirt;

import java.util.ArrayList;
import java.util.List;

/**
 * 드레스룸
 * */
public class DressRoom implements Room<Clothes> {
    private Shirt checkShirt;
    private Jean blackJean;

    public DressRoom() {
        checkShirt = new Shirt("체크셔츠");
        checkShirt.setCheck(true);
        checkShirt.setColor("빨강색 + 파랑색");
        checkShirt.setSize(100);
        checkShirt.setMaterial("코튼");
        blackJean = new Jean("블랙진");
        blackJean.setColor("검은색");
        blackJean.setSize(30);
        blackJean.setMaterial("데님");
    }


    @Override
    public List<Clothes> getObjects() {
        List<Clothes> clothesList = new ArrayList<>();
        clothesList.add(checkShirt);
        clothesList.add(blackJean);
        return clothesList;
    }
}
