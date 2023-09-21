public class Pleyar {

    public static void main(String[] args) {
        System.out.println("-----All Betsman Name-----");
        Betsman bet = new Betsman();
        bet.get();
        System.out.println("-----All Betsman Name-----");
        Bowler boll = new Bowler();
        boll.show();
    }

}

class CricketPlayer {
    String a = "Virat Kohli";
    String b = "Rohit Sharma";
    String c = "Hardik Pandya";
    String d = "Kl Rahul";
    String e = "Harshad Patel";
    String f = "Jasprit Bumra";
    String g = "Shubhamn Gill";
    String h = "Ravindra Jadeja";
    String i = "Mohamad";
    String j = "Sunilkumar Yadav";
    String k = "MS Dhoni";
}

class Betsman extends CricketPlayer {
    void get() {
        System.out.println("Bettsman = " + b);
        System.out.println("Bettsman = " + a);
        System.out.println("Bettsman = " + c);
        System.out.println("Bettsman = " + d);
        System.out.println("Bettsman = " + g);
        System.out.println("Bettsman = " + k);
    }
}

class Bowler extends CricketPlayer {
    void show() {
        System.out.println("Bowler = " + e);
        System.out.println("Bowler = " + f);
        System.out.println("Bowler = " + h);
        System.out.println("Bowler = " + i);
        System.out.println("Bowler = " + j);
    }
}