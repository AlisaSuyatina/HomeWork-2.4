import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int num = service.numberSquareRoots(10,99);
        System.out.println(num);


    }

}
