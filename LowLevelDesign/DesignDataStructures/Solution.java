package LowLevelDesign.DesignDataStructures;

public class Solution {

    public static void main(String[] args) {
        HashMapImplementation.Map<String, Integer> myMap = new HashMapImplementation.Map<>(4);
        myMap.put("ABC", 47);
        myMap.put("DEF", 25);
        myMap.put("GHI", 115);
        myMap.put("JKL", 118);
        System.out.println("Before Removal");
        System.out.println("Value is: " + myMap.get("DEF"));
        System.out.println("Size is: " + myMap.getTableSize());

        myMap.remove("DEF");

        System.out.println("After Removal");
        System.out.println("Value is: " + myMap.get("DEF"));
        System.out.println("Size is: " + myMap.getTableSize());
    }
}
