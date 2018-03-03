package edu.knoldus.Operations;

import java.util.ArrayList;
import java.util.List;

public class Funtionalities {
    private boolean primeCheck(int num) {
        if(num == 0 || num == 1)
            return false;
        for(int counter = 2;counter< num/2;counter++){
            if(num%counter == 0)
                return false;
        }
        return true;
    }
    public List<Integer> primeListBuilder(List<Integer> domain) {
        List<Integer> resultant = new ArrayList<Integer>();
        domain.forEach(num -> {if (primeCheck(num))
            resultant.add(num);
        });
        return resultant;
    }
}
