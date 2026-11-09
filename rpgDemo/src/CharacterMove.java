public class CharacterMove {
    public int attack(Character hero, Character enemy){
        if((hero.getHealth())>0 && enemy.getHealth()>0 && enemy!=hero) {
            System.out.println(hero.getName() + " attact " + enemy.getName());
            takeDamage(enemy,hero);
            return enemy.getHealth();
        }
        else {
            System.out.println(hero.getName()+ " is can't attack that");
            return enemy.getHealth();
        }
    }

    public int takeDamage(Character hero, Character enemy){
        System.out.println(hero.getName()+" took damage from "+enemy.getName());
        hero.setHealth(hero.getHealth() - enemy.getDamage());
        return hero.getHealth();
    }

    public void levelUp(Character hero){
        hero.setLevel(hero.getLevel()+1);
        System.out.println(hero.getName()+"level : "+hero.getLevel());
    }

    public void displayStats(Character hero){
        System.out.println("Character name : "+hero.getName());
        System.out.println("Character health : "+hero.getHealth());
        System.out.println("Character damage : "+hero.getDamage());
        System.out.println("Character level : "+hero.getLevel());
    }
}
