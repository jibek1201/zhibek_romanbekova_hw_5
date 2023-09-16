public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setDamage(220);
        boss.setHealth(700);
        boss.setDefence("physical");

        System.out.println("Boss:");
        System.out.print("health:"+boss.getHealth()+" damage:"+boss.getDamage()+" typeDefence:"+boss.getDefence());
        System.out.println("\nHeroes:");
        Hero[] heroes=createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("health:"+heroes[i].getHealth()+" damage:"+heroes[i].getDamage()+" Ability:"+heroes[i].getAbility());
        }
    }
    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(150, 20);
        Hero hero2 = new Hero(250, 100, "invisibility");
        Hero hero3 = new Hero(200, 70, "freezing");

        Hero[] heroes=new Hero[3];
        for (int i = 0; i < heroes.length; i++) {
            heroes[0]=hero1;
            heroes[1]=hero2;
            heroes[2]=hero3;
        }
        return heroes;
    }
}