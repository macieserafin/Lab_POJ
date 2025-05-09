class Bookshop extends Shop {
    private String[] products;

    public Bookshop(String address, int size, String[] products) {
        super(address, size); // wywołujemy konstruktor klasy Shop
        this.products = products;
    }

    @Override
    public String getInformation() {
        StringBuilder info = new StringBuilder(super.getInformation());
        info.append("\nProdukty w księgarni: ");
        for (String product : products) {
            info.append("\n- ").append(product);
        }
        return info.toString();
    }
}