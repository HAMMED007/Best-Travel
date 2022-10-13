import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        int [] ls = {91, 74, 73, 85, 73, 81, 87};
        int t = 230;
        int max_routes = 3;
        int new_val = 0;
        int count = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = 0; j < ls.length; j++) {
                for (int k = 0; k < ls.length; k++) {
                    if(ls[i] + ls[j] + ls[k]  <=t && ls[i] != ls[j] && ls[k] != ls[i] && ls[j] != ls[k]){

                      new_val = ls[i] + ls[k] + ls[j];

                     //   count++;


                    }
                }
            }

        }
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));

        System.out.println(SumOfK.chooseBestSum(163,3,ts));
       // System.out.println(new_val);









    }


    public class SumOfK {

        public static Integer chooseBestSum(int t, int k, List<Integer> ls) {

            int new_val = 0;
     

            for (int i = 0; i < ls.size(); i++) {
                for (int j = 0; j < ls.size(); j++) {
                    for (int m = 0; m < ls.size(); m++) {
                        if(ls.get(i) + ls.get(j) + ls.get(m) <= t && !Objects.equals(ls.get(i), ls.get(j)) && !Objects.equals(ls.get(m), ls.get(i)) && !Objects.equals(ls.get(j), ls.get(m))){

                            new_val = ls.get(i) + ls.get(m) + ls.get(j);




                        }
                    }
                }

            }
            return new_val;
        }
    }

}