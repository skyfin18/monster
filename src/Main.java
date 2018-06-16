public class Main {

    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster2 = new Monster();

        monster.setHp(20);
        monster.setAngriff(5);
        monster.setVerteidigung(5);
        monster.setStatus(0);
        monster.setSpezialA(5);
        monster.setSpezialV(5);


        monster2.setHp(8);
        monster2.setAngriff(5);
        monster2.setVerteidigung(5);

        System.out.println(monster.getHp() + " Lebenspunkte");
        System.out.println(monster.getAngriff() + " Angriff");
        System.out.println(monster.getVerteidigung() + " Verteidigung");
        System.out.println(monster.getStatus() + " Status");
        System.out.println(monster.getStatus() + " Spezialangriff");
        System.out.println(monster.getStatus() + " Spezialverteidigung");
        System.out.println("\n");
        System.out.println(monster2.getHp() + " Lebenspunkte");
        System.out.println(monster2.getAngriff() + " Angriff");


    }
}
