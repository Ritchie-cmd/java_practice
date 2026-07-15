import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Note {
    String name;
    String title;
    String content;
    int password;

    Note(String name, String title, String content, int password) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.password = password;
    }

    void display() {
        System.out.println(name);
        System.out.println(title);
        System.out.println(content);
    }
}

public class noteTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("            NOTE TAKING APP            ");
        System.out.println("=======================================");

        while (true) {
            System.out.println("[1] LOG IN [2] CREATE [3] EXIT");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {

                System.out.println("NAME:");
                String name = sc.nextLine();
                System.out.println("PASSWORD: ");
                String password = sc.nextLine();

                File file = new File("students.txt");
                try {
                    Scanner fileReader = new Scanner(file);

                    boolean found = false;
                    while (fileReader.hasNextLine()) {
                        String line = fileReader.nextLine();
                        String[] parts = line.split(",");
                        if (parts.length < 2)
                            continue; // 👈 skip bad lines!
                        String saveName = parts[0];
                        String savePass = parts[1];

                        if (saveName.equals(name) && savePass.equals(String.valueOf(password))) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("LOG IN SUCCESSFULLY, WELCOME "+name);
                        System.out.println();
                        System.out.println("           NOTE                ");
                        System.out.println();
                        System.out.println("TITLE: ");
                        String title = sc.nextLine();
                        System.out.println(": ");
                        String content = sc.nextLine();

                        try{
                            FileWriter writer = new FileWriter("students.txt", true);
                            writer.write(title+",\n"+content+" ");

                            writer.close();
                        }catch (Exception e){
                            System.out.println("ERROR: "+e.getMessage());
                        }
                        break;
                    } else {
                        System.out.println("ACCOUNT NOOT FOUND");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }

            } else if (type == 2) {

                System.out.println("NAME: ");
                String name = sc.nextLine();
                System.out.println("PASSWORD: ");
                String pass = sc.nextLine();

                try {
                    FileWriter writer = new FileWriter("students.txt", true);

                    writer.write(name + "," + String.valueOf(pass) + "\n");

                    writer.close();
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }else if(type == 3){
                break;
            }
        }
    }
}

// import java.io.FileWriter;
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) throws Exception {

// Scanner sc = new Scanner(System.in);

// System.out.print("Student Name: ");
// String name = sc.nextLine();

// System.out.print("Grade: ");
// int grade = sc.nextInt();

// FileWriter writer = new FileWriter("students.txt", true);

// writer.write(name + "," + grade + "\n");

// writer.close();

// System.out.println("Student saved!");

// sc.close();
// }
// }
// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {
// public static void main(String[] args) {

// try {
// FileWriter writer = new FileWriter("students.txt");

// writer.write("John,90\n");
// writer.write("Anna,95\n");
// writer.write("Mike,87\n");

// writer.close();

// System.out.println("Students saved!");
// } catch(IOException e) {
// System.out.println("Error");
// }

// }
// }

// import java.io.File;
// import java.util.Scanner;

// public class Main {

// public static void main(String[] args) {

// try {

// File file = new File("students.txt");
// Scanner sc = new Scanner(file);

// while(sc.hasNextLine()) {
// System.out.println(sc.nextLine());
// }

// sc.close();

// } catch(Exception e) {
// System.out.println("File not found.");
// }

// }

// }