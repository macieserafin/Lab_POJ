public class Pies {

    public Pies(){
        System.out.println("Woaw");
    }

    public Pies(int barks){
        for(int i=0;i<barks;i++)
        {
            System.out.println("Woaw");
        }
    }

    public static void main(String[] args) {
        Pies pies = new Pies();
        System.out.println("------");
        Pies pies2 = new Pies(4);
    }
}
