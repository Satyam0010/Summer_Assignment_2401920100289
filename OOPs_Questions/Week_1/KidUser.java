package OOPs_Questions.Week_1;

interface LibraryUser {
    void registerAccount();
    void requestBook();
}

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

    
}

class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}

class Library {
    public static void main(String[] args) {
        KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook();

        KidUser kidUser2 = new KidUser(15, "Kids");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        AdultUser adultUser1 = new AdultUser(25, "Fiction");
        adultUser1.registerAccount();
        adultUser1.requestBook();

        AdultUser adultUser2 = new AdultUser(20, "Non-Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();
    }
}