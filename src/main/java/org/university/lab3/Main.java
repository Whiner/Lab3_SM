package org.university.lab3;

public class Main {
    public static void main(String[] args) throws Exception {
        TrainDepo trainDepo = new TrainDepo();
        int trainCount = 10;
        int repairTime = 0;
        for (int i = 0; i < trainCount; i++){
            System.out.println("--------------");
            int trainType = trainDepo.getTrainType();
            int currentTrainRepairTime = trainDepo.getRepairTime(trainType);
            repairTime += currentTrainRepairTime;
        }
        System.out.println("Среднее время ремонта = " + repairTime / trainCount);
    }
}
