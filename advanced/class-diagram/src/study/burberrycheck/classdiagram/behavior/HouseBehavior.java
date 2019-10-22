package study.burberrycheck.classdiagram.behavior;

import study.burberrycheck.classdiagram.Room;

/**
 * 집안에서의 행동
 * */
public interface HouseBehavior {
    public void moveRoom(Room room) throws Exception;
    public void lookMirror() throws Exception;
}
