public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog  = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var summaryFightersWeight = firstFighterWeight + secondFighterWeight;
        System.out.println(summaryFightersWeight);
        var differenceFightersWeight = secondFighterWeight - firstFighterWeight;
        System.out.println(differenceFightersWeight);
        var remainderWeight = secondFighterWeight % firstFighterWeight;
        System.out.println(remainderWeight);
        var timeWorkDistribution = 640;
        var workloadPerOne = 8;
        var workers = timeWorkDistribution / workloadPerOne;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var workersIncrease = workers + 94;
        var timeWorkDistributionIncrease = workersIncrease * workloadPerOne;
        System.out.println("Если в компании работает " + workersIncrease + " человек, то всего " + timeWorkDistributionIncrease + " часов работы может быть поделено между сотрудниками");

    }
}