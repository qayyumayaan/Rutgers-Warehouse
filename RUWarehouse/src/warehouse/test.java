package warehouse;

public class test {

    public static void main(String[] args) {
        // StdOut.println("bruh");
        StdOut.println("bruh");
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

        System.out.println(w);
        
        // System.out.println(bruh);

        
    }

    // private void addToEnd(int id, String name, int stock, int day, int demand) {
    //     // IMPLEMENT THIS METHOD
    //     int temp = id % 10;
    //     Product prod = new Product(id, name, stock, day, demand);
    //     Sector sector = sectors[temp];
    //     sectors[temp].add(prod);
    // }


    // /**
    //  * Fix the heap structure of the sector, assuming the item was already added
    //  * Requires proper use of the .swim() and .getSize() methods in the Sector class
    //  * @param id The id of the item which was added
    //  */
    // private void fixHeap(int id) {
    //     // IMPLEMENT THIS METHOD
    //     int temp = id % 10;
    //     Sector sector = sectors[temp];
    //     sector.swim(sector.getSize());
        

    //     // compare to its parent k/2. 1st index is 1
    // }
}
