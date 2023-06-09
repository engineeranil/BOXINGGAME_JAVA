public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("ANIL",100,10,85,30);
        Fighter f2  = new Fighter("BARAN",100,15,85,50);

        Match mat = new Match(f1,f2,0,100);
        mat.run();

    }
}
