import java.io.File;

public class Main {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println("Укажите путь к файлу, который программа затем будет парсить:");
            String path= new java.util.Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке, а не к файлу");
                continue;
            } else if (fileExists) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер N: " + i);
                ++i;
            } else System.out.println("Путь указан неверно");
        } while (1==1);
    }
}