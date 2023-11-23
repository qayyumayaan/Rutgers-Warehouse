package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        String id1 = "deleteproduct.in";
        String id2 = "deleteproduct.out";

        StdIn.setFile(id1);
        StdOut.setFile(id2);

        Warehouse w = new Warehouse();

        int loops = StdIn.readInt();
        for (int i = 0; i < loops; i++) {
            String query = StdIn.readString();
            if (query.equals("add")) {
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            } else if (query.equals("delete")) {
                int id = StdIn.readInt();
                w.deleteProduct(id);
            } else
                break;
        }

        StdOut.print(w);

	// Use this file to test deleteProduct
    }
}
