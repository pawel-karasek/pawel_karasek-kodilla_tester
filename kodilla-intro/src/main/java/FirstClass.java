public class FirstClass {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook("600g", 5000);
        System.out.println(noteBook.weight + " kosztuje " + noteBook.price);
        noteBook.checkPrice();

        NoteBook heavyNotebook = new NoteBook("2000g", 3040);
        System.out.println(heavyNotebook.weight + " kosztuje " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        NoteBook oldNoteBook = new NoteBook("1200g", 1200);
        System.out.println(oldNoteBook.weight + " kosztuje " + oldNoteBook.price);
        oldNoteBook.checkPrice();

    }
}