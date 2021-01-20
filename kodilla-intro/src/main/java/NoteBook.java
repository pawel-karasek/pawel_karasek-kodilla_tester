public class NoteBook {
        int weight;
        int price;
        int year;
        String brand;
        public NoteBook(int weight, int price, int year, String brand) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        this.brand = brand;
        }
                public void checkPriceAndYear() {
                if (this.price < 2000 && this.year < 2010) {
                        System.out.println("This notebook is cheap and old.");
                } else if (this.price >= 2000 && this.price < 4000 || this.year >= 2010 && this.year < 2018 ) {
                        System.out.println("This notebook is worth this money.");
                } else if (this.price >= 4000 || this.year >= 2018) {
                        System.out.println("This notebook is quiet new and expensive");
                        }
        }

                public void checkWeight() {
                if (this.weight < 1000) {
                        System.out.println("this notebook is light.");
                } else if (this.weight >= 1000 && this.weight < 1800) {
                        System.out.println("this notebook is quiet light.");
                } else if (this.weight >= 1800) {
                        System.out.println("this notebook i heavy.");
                }
        }
}
