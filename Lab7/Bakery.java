class Bakery extends Shop {
    private String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public String getInformation() {
        StringBuilder info = new StringBuilder(super.getInformation());
        info.append("\nProdukty w piekarni: ");
        for (String product : products) {
            info.append("\n- ").append(product);
        }
        return info.toString();
    }
}