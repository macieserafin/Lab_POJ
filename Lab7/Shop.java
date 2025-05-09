public class Shop {
    protected String address;
    protected int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation() {
        return "Adres: " + address + "\nRozmiar: " + size + " m²";
    }

    public static void main(String[] args) {
        String[] books = {"Wiedźmin", "Lalka", "Java dla początkujących"};
        String[] bread = {"Chleb żytni", "Bułki maślane", "Rogale"};

        Bookshop ksiegarnia = new Bookshop("ul. Książkowa 12", 50, books);
        Bakery piekarnia = new Bakery("ul. Chlebowa 5", 30, bread);

        System.out.println(ksiegarnia.getInformation());
        System.out.println();
        System.out.println(piekarnia.getInformation());
    }


}


