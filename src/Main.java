import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        example1();//base
//        example2();// null engine
    }

    public static void print(Car car){
        System.out.println(STR."Gyártó: \{car.getManufacturer()}");
        System.out.println(STR."Típus:  \{car.getType()}");
        System.out.println(STR."Motor:  \{car.getEngine().getType()}");
    }
    public static void example1(){
        Car car = new Car("Industriewerke Ludwigsfelde", "IFA W50", new Engine("4 VD 14,5/12-1 SRW"));
        print(car);
    }
    public static void example2(){
        Car car = new Car("Industriewerke Ludwigsfelde", "IFA W50", null);
        print(car);
    }


}