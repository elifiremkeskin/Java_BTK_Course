//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character clive = new Character();
        clive.setName("clive");
        clive.setHealth(100);
        clive.setDamage(20);
        clive.setLevel(1);

        Character silas = new Character();
        silas.setName("silas");
        silas.setHealth(100);
        silas.setDamage(10);
        silas.setLevel(1);

        CharacterMove characterMove = new CharacterMove();
        characterMove.attack(silas, clive);
        System.out.println(clive.getHealth());
        characterMove.levelUp(clive);
        characterMove.displayStats(clive);
        characterMove.displayStats(silas);
    }
}