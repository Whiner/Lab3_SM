package org.university.lab3;

public class TrainDepo {
    private int repairTimeFirstCrashType = 40;
    private int repairTimeSecondCrashType = 50;
    private int repairTimeThirdCrashType = 70;

    public int getTrainType() {
        double kcu = Randomizer.getKcu();
        if (kcu <= 0.1) {
            return 1;
        } else if (kcu <= 0.3) {
            return 2;
        } else {
            return 3;
        }
    }

    public int getRepairTime(int trainType) throws Exception {
        if (trainType < 1 || trainType > 3) {
            throw new Exception("Неверный тип трамвая");
        } else {
            if(trainType == 1){
                System.out.println("Тип 1");
                if(Randomizer.getKcu() <= 0.5) {
                    System.out.println("Ушел без ремонта");
                    return 0;
                } else {
                    System.out.println("Время ремонта: " + repairTimeFirstCrashType);
                    return repairTimeFirstCrashType;
                }
            } else if(trainType == 2){
                System.out.println("Тип 2");
                if(Randomizer.getKcu() <= 0.5) {
                    System.out.println("Время ремонта: " + repairTimeSecondCrashType);
                    return repairTimeSecondCrashType;
                }
                System.out.println("Перешел в 3 тип");
            } else {
                System.out.println("Тип 3");
            }
            System.out.println("Время ремонта: " + repairTimeThirdCrashType);
            return repairTimeThirdCrashType;
        }
    }

}
