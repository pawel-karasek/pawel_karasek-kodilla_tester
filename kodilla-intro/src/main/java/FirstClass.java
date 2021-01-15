public class FirstClass {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook(1200, 5000, 2016, "Dell");
        System.out.println(noteBook.brand + " weight " + noteBook.weight + "g" + " costs " + noteBook.price + "zł");
        noteBook.checkPriceAndYear();

        NoteBook heavyNotebook = new NoteBook(2800, 3500, 2010, "HP");
        System.out.println(heavyNotebook.brand + " weights " + heavyNotebook.weight + "g" + " costs " + heavyNotebook.price + "zł");
        heavyNotebook.checkPriceAndYear();

        NoteBook oldNoteBook = new NoteBook(2000, 1400, 1999, "Lenovo");
        System.out.println(oldNoteBook.brand + " weights " + oldNoteBook.weight + "g" + " costs " + oldNoteBook.price + "zł");
        oldNoteBook.checkPriceAndYear();

        NoteBook fancyNoteBook = new NoteBook(800, 5500, 2020, "MacBook");
        System.out.println(oldNoteBook.brand + " weights " + oldNoteBook.weight + "g" + " costs " + oldNoteBook.price + "zł");
        fancyNoteBook.checkPriceAndYear();

    }
}