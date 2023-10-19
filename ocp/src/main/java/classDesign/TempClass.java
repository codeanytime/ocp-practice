package classDesign;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 17/10/2023
 * <p>
 * Class: TempClass
 */
public class TempClass {

    public int number = 1;
    public String getColor(){
        return "red";
    }
}


class Test extends TempClass{
    public int number = 2;
    public String getColor(){
        return "blue";
    }
    public static void main(String[] args){
        TempClass supersub = new Test();
        TempClass supersub1 = new Test();//You can do this thanks polymorphism
        System.out.println( supersub.getColor() + supersub.number );
        System.out.println( supersub.getColor() + supersub1.number);

        List<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Map<Integer, List<Integer>> groups = input.stream().collect(Collectors.groupingBy(s -> s % 10));
        System.out.println(groups);
        List<List<Integer>> partion = new ArrayList<>(groups.values());
        System.out.println(partion);

        System.out.println(EnumDemo.SUMMER);
        System.out.println(EnumDemo.SUMMER.getTemperature());
    }
}

