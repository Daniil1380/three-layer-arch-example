import controller.TrainController;
import service.TrainService;
import service.TrainServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainService trainService = new TrainServiceImpl();
        TrainController trainController = new TrainController(scanner, trainService);

        trainController.startProgram();
    }
}
