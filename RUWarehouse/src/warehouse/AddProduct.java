package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {

        // // addToEnd
        // String in1 = "addtoend.in";
        // String ou1 = "addtoend.out";

        // // fixHeap
        // String in1 = "fixheap.in";
        // String ou1 = "fixheap.out";

        String in1 = "addproduct.in";
        String ou1 = "addproduct.out";


        StdIn.setFile(in1);
        StdOut.setFile(ou1);

        Warehouse w = new Warehouse();

        int bruh = StdIn.readInt();

        while (!StdIn.isEmpty()) {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            w.addProduct(id, name, stock, day, demand);
        }

        StdOut.println(w);

        // int id, String name, int stock, int day, int demand
        // StdIn.setFile(args[0]);
        // StdOut.setFile(args[1]);

        // Use this file to test addProduct
    }
}
