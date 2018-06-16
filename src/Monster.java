public class Monster {
    public int hp;
    public int angriff;
    public int verteidigung;
    public int status;
    public int spezialA;
    public int spezialV;
    public int level;
    public int glueck;
    public int moral;
    public int element;

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    public int getAngriff() {
        return angriff;
    }
    public void setAngriff (int a) {
         angriff = a;
    }


    public int getHp () {
        return hp;
    }
    public void setHp (int b) {
        hp = b;
    }

    public int getVerteidigung () {
        return verteidigung;
    }
    public void setVerteidigung (int c) {
        verteidigung = c;

    }
    public int getStatus () {
        return status;
    }
    public void setStatus (int d) {
        status = d;
    }
    public int getSpezialA () {
        return hp;
    }
    public void setSpezialA (int e) {
        hp = e;
    }
    public int getSpezialV () {
        return spezialV;
    }
    public void setSpezialV (int f) {
        hp = f;
    }
}

