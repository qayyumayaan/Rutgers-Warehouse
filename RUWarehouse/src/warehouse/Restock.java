package warehouse;

public class Restock {
    public static void main(String[] args) {
        
        // restock
        String id1 = "restock.in";
        String id2 = "restock.out";

        StdIn.setFile(id1);
        StdOut.setFile(id2);

        Warehouse w = new Warehouse();

        int loops = StdIn.readInt();
        while (!StdIn.isEmpty()) {
            String query = StdIn.readString();
            if (query.equals("add")) {
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                demand = demand + 0;
                w.addProduct(id, name, stock, day, demand);
            } else if (query.equals("restock")) {
                int id = StdIn.readInt();
                int demand = StdIn.readInt();
                w.restockProduct(id, demand);
            } else
                break;
        }

        StdOut.println(w);

	// U set his file to test restock
    }

        /*
     * Add queries:
        An add query will start with the word “add”
        It will then contain the following (space separated):
            The current day
            The product ID
            The product name (Guaranteed to not contain spaces)
            The initial item stock
            The initial item demand
        Add queries represent a new product to add to your warehouse
    Restock queries:
        A restock query will start with the word “restock”
        It will then contain the following (space separated):
            The product ID to restock
            The amount to restock
        Restock queries tell you to update the stock of some item
     */
}
