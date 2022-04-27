package collection;

import java.util.ArrayList;

public class Collection_With_Generics {
    public void moblieBrandList() {
        ArrayList<String> mobiebrand = new ArrayList<>();
        mobiebrand.add("oneplus");
        mobiebrand.add("samsung");
        mobiebrand.add("iphone");
        mobiebrand.add("Nokia");
        mobiebrand.add("BlackBerry");
        mobiebrand.add("motorola");

        for (String var : mobiebrand) {
            System.out.println(var);
        }
    }
        public void distanceList() {
            System.out.println("second method Distance list with method");
            ArrayList<Float> distance_km = new ArrayList<>();
            distance_km.add(23.3f);
            distance_km.add(20.1f);
            distance_km.add(10.6f);
            distance_km.add(12.1f);
            distance_km.add(16.3f);
            distance_km.add(8.7f);

            for (float var : distance_km) {
                System.out.println(var);
            }
        }
            public ArrayList salarylist() {
                System.out.println("third method salary list with Advanced method");
                ArrayList<Double> Salary_list = new ArrayList<Double>();
                Salary_list.add(20000.45);
                Salary_list.add(24000.3);
                Salary_list.add(45000.1);
                Salary_list.add(56000.2);
                Salary_list.add(12300.1);
                Salary_list.add(60000.2);

                return Salary_list;


            }
                public static void main(String[] args){
                    System.out.println("First method mobile brand with method");
                    Collection_With_Generics obj = new Collection_With_Generics();
                    obj.moblieBrandList();
                    obj.distanceList();

                  // System.out.println(obj.salarylist());
                    ArrayList <Double> resultlist = obj.salarylist();
                    for (Double var : resultlist){
                        System.out.println(var);
                    }

                }

            }






