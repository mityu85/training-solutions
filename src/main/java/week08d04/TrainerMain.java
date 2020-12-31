package week08d04;

public class TrainerMain {

    public static void main(String[] args) {
        CanMark canMarkGood = new GoodMood();
        CanMark canMarkBad = new BadMood();

        Trainer trainerGoodMood = new Trainer(canMarkGood);
        Trainer trainerBadMood = new Trainer(canMarkBad);

        System.out.println(trainerGoodMood.giveMark());
        System.out.println(trainerBadMood.giveMark());
    }
}
