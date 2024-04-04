public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        System.out.println("\nTask 2");
        dog += 4;
        System.out.println("dog = " + dog);
        cat += 4;
        System.out.println("cat = " + cat);
        paper += 4;
        System.out.println("paper = " + paper);

        System.out.println("\nTask 3");
        dog -= 3.5;
        System.out.println("dog = " + dog);
        cat -= 1.6;
        System.out.println("cat = " + cat);
        paper -= 7639;
        System.out.println("paper = " + paper);

        System.out.println("\nTask 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("\nTask 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("\nTask 6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var summaryFightersWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общая масса бойцов равна " + summaryFightersWeight + " киллограмм");
        var diffFightersWeight = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница в массе бойцов равняется " + diffFightersWeight + " киллограмм");

        System.out.println("\nTask 7");
        var remFightersWeight = secondFighterWeight % firstFighterWeight;
        System.out.println("Остаток от деления масс равен " + remFightersWeight);

        System.out.println("\nTask 8");
        var allWorkTime = 640;
        var workPerWorker = 8;
        var allWorkersAmount = allWorkTime / workPerWorker;
        System.out.printf("«Всего работников в компании - %s человек\n»",
                allWorkersAmount);
        var newWorkersAmount = allWorkersAmount + 94;
        var newWorkPerWorkerTime = allWorkTime / newWorkersAmount;
        System.out.printf("«Если в компании работает %s человек, то всего %s часов работы может быть " +
                "поделено между сотрудниками\n»",newWorkersAmount,newWorkPerWorkerTime);
    }
}