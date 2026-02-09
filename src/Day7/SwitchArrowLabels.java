package Day7;

public class SwitchArrowLabels {
    static void findSeason(int month){
        switch(month){
            case 1,2,3-> System.out.println("Spring");
            case 4,5,6-> System.out.println("Summer");
            case 7,8,9-> System.out.println("Rainy");
            case 10,11,12-> System.out.println("Winter");
            default-> System.out.println("I don't know this szn");
        }
    }

    // More Compact methods:
    static String findSeason1(int month){
        return switch(month){
            case 1,2,3-> "Spring";
            case 4,5,6->"Summer";
            case 7,8,9->"Rainy";
            case 10,11,12->"Winter";
            default->"I don't know this szn";
        };
    }

    static String findSeason2(int month){
        return switch(month){
            case 1,2,3-> {
                yield "Spring";
            }
            case 4,5,6-> {
                yield "Summer";
            }
            case 7,8,9->"Rainy";
            case 10,11,12->"Winter";
            default->"I don't know this szn";
        };
    }

    public static void main(String[] args) {
        findSeason(3);
        findSeason(9);
        findSeason(6);
        System.out.println(findSeason1(12));
        System.out.println(findSeason1(100));
        System.out.println(findSeason2(5));
        System.out.println(findSeason2(7));
    }
}
