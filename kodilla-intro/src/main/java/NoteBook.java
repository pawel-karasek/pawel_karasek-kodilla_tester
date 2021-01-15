public class NoteBook {
        String weight;
        int price;
        public NoteBook(String weight, int price) {
                this.weight = weight;
                this.price = price;
        }
                public void checkPrice() {
                if (this.price < 2000) {
                        System.out.println("This notebook is cheap.");
                } else {
                        System.out.println("This notebook is quite expensive.");
                }
        }
}
