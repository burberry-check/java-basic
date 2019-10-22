package study.burberrycheck.classdiagram;

import study.burberrycheck.classdiagram.behavior.ClothesBehavior;
import study.burberrycheck.classdiagram.behavior.HouseBehavior;
import study.burberrycheck.classdiagram.room.DressRoom;

import java.util.List;

/**
 *  Person 클래스 옷에관한 행동,집안에서의 행동을 구현함
 * */
public class Person implements ClothesBehavior, HouseBehavior {
    private List<Clothes> clothesList;

    /**
     * 옷을 벗는다
     * */
    @Override
    public void takeOff() throws Exception {
        if(clothesList != null && clothesList.size() > 0) {
            int clothesListSize = clothesList.size();
            for (int i = 0; i < clothesListSize; i++){
                Clothes clothes = clothesList.remove(i);
                System.out.println(clothes.getName() + " 벗는다");
                Thread.sleep(1000);
            }
        } else {
            System.out.println("옷을 입지않음");
        }
    }

    /**
     * 옷을 입는다
     * */
    @Override
    public void putOn() throws Exception {
        if(clothesList != null && clothesList.size() > 0) {
            for(Clothes clothes : clothesList){
                System.out.println(clothes.getName() + " 입는다");
                Thread.sleep(1000);
            }
        }
    }

    /**
     * 방으로 이동
     * */
    @Override
    public void moveRoom(Room room) throws Exception {
        clothesList = room.getObjects();
        System.out.println("방에가서 옷을 가지고 나옴");
        Thread.sleep(1000);
    }

    /**
     * 거울 보기
     * */
    @Override
    public void lookMirror() throws Exception {
        System.out.println("거울을 본다");

        Thread.sleep(1000);

        if(clothesList != null && clothesList.size() > 0) {
            for (Clothes clothes : clothesList) {
                StringBuilder sb = new StringBuilder();
                sb.append(clothes.getName()).append(" 을(를) 입고 있다!!, 옷의 재질은 ");
                sb.append(clothes.getMaterial()).append(" 사이즈는 ");
                sb.append(clothes.getSize()).append(" 색상은 ");
                sb.append(clothes.color).append(" 이다. ");
                System.out.println(sb.toString());
                Thread.sleep(1000);
            }
        } else {
            System.out.println("옷을 입지않음");
        }
    }

    /**
     *  뇌
     * */
    public static void main(String[] args) throws Exception{
        // 패션피플이 드레스룸에 가서, 옷을입고, 거울보고 일련의 과정...
        Person fashionPeople = new Person();
        fashionPeople.moveRoom(new DressRoom());
        fashionPeople.putOn();
        fashionPeople.lookMirror();
        System.out.println("끝");
    }

}
