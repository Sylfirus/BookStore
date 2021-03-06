package books;
public class BookShop {

    public static double [] reducs = {0,0.93,0.86,0.72,0.65};

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        if (books==null) return 0;
        int total = 0;
        double current = 0;
        double doublons = 0;
        boolean [] mem = new boolean[5];
        int reduc = 0;
        for (int i = 0; i < books.length; i++) {
            if (!(books[i]>4 || books[i]<0)){
                if (mem[books[i]] == true){
                    doublons += 8;
                } else {
                current +=8;
                mem[books[i]] = true;
                reduc+=1;
                }
            } else {}
        }
        if (reduc == 0 || reduc == 1){
            return doublons + current;
        } else {
        return 0 + (current*reducs[reduc-1] + doublons);
        }

    }
}
