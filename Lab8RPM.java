public class Lab8RPM {
    public static class Reader {
        private String fullName;
        private int cardNumber;
        private String faculty;
        private String birthDate;
        private String phone;

        public Reader(String fullName, int cardNumber, String faculty, String birthDate, String phone) {
            this.fullName = fullName;
            this.cardNumber = cardNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phone = phone;
        }

        public void takeBook(int count) {
            System.out.println(fullName + " взял " + count + " книги");
        }

        public void takeBook(String... bookNames) {
            String books = String.join(", ", bookNames);
            System.out.println(fullName + " взял книги: " + books);
        }

        public void returnBook(int count) {
            System.out.println(fullName + " вернул " + count + " книги");
        }

        public void returnBook(String... bookNames) {
            String books = String.join(", ", bookNames);
            System.out.println(fullName + " вернул книги: " + books);
        }
    }

    public static void main(String[] args) { 
        Reader[] readers = {
            new Reader("Петров В. В.", 12345, "Факультет", "01.01.1990", "+7-999-123-45-67"),
            new Reader("Иванов И. И.", 23456, "Факультет", "02.02.1991", "+7-999-234-56-78"),
            new Reader("Сидоров С. С.", 34567, "Факультет", "03.03.1992", "+7-999-345-67-89"),
            new Reader("Федоров Ф. Ф.", 45678, "Факультет", "04.04.1993", "+7-999-456-78-90"),
            new Reader("Андреев А. А.", 56789, "Факультет", "05.05.1994", "+7-999-567-89-01")
        };

        readers[0].takeBook(3);  // Петров взял 3 книги
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");  //Иванов взял эти книги
        readers[2].returnBook(2);  // Сидоров вернул 2 книги
        readers[3].returnBook("Приключения", "Словарь", "Энциклопедия");  // Федоров вернул 2 книги- Приключения, Словарь
    }
}
