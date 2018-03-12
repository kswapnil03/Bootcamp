package Question4;

public class Application {
    public static void main(String[] args) {
        StreetFighter streetFighter1 = new StreetFighter();
        streetFighter1.setJumpable(new JumpLevel2());
        streetFighter1.setRollable(new RollLevel1());
        streetFighter1.roll();
        streetFighter1.jump();
        streetFighter1.kick();
        streetFighter1.punch();

        StreetFighter streetFighter2 = new StreetFighter();
        streetFighter2.setJumpable(new JumpLevel3());
        streetFighter2.setRollable(new RollLevel2());
        streetFighter2.roll();
        streetFighter2.jump();
        streetFighter2.kick();
        streetFighter2.punch();

        StreetFighter streetFighter3 = new StreetFighter();
        streetFighter3.setJumpable(new JumpLevel1());
        streetFighter3.setRollable(new RollLevel3());
        streetFighter3.roll();
        streetFighter3.jump();
        streetFighter3.kick();
        streetFighter3.punch();
    }
}
