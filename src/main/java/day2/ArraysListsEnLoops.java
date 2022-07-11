package day2;

import bank.Account;
import bank.BusinessCustomer;
import bank.Customer;
import bank.PersonalCustomer;
import day2.sub.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArraysListsEnLoops {
    public static void main(String[] args) {
        // for loop - i++ betekent i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        infinite loop
//        for(;;) {
//            System.out.println("oh...");
//        }
        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        int k = 0;
        // do while loop
        do {
            System.out.println("altijd minimaal 1x: " + k);
            k++;
        } while (k < 3);

        // arrays
        int[] ints = {3, 4, 6, 2, 4};
        System.out.println("lengte array: " + ints.length);
        int element = ints[4];
        System.out.println("elem:" + element);

        int l = 0;
        while(l < 3 && ints.length > l){
            System.out.println(ints[l]);
            l++;
        }


        // enhanced for loop (foreach loop)
        for(int hoi : ints) {
            System.out.println("int: " + hoi);
        }

        for(int i = 0; i<100; i++) {
            if(isPrime(i)){
                System.out.println("priem: " + i);
            }
        }

        List<String> lijstje = new ArrayList<>();
        lijstje.add("Geert");
        lijstje.add("Miranda");
        System.out.println(lijstje);

        for(String s : lijstje) {
            System.out.println(s);
        }

        System.out.println(lijstje.get(0));
        System.out.println(lijstje.remove(0));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        integerList.remove(Integer.valueOf(1));
        System.out.println(integerList);

        List<Customer> customers = new ArrayList<>();
        customers.add(new PersonalCustomer());
        customers.add(new BusinessCustomer());
        customers.add(new Customer());
        customers.add(null);

        customers.get(0).setAccount(new Account());
        customers.get(0).getAccount().setAccountNumber("123");
        System.out.println(customers);

    }

    public static boolean isPrime(int nr) {
        if(nr <= 1) {
            return false;
        } else if(nr == 2) {
            return true;
        }

        for(int i = 2; i < Math.sqrt(nr); i++) {
            if(nr % i == 0 && nr != i) {
                return false;
            }
        }
        return true;

    }
}
