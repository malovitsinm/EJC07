package com.epam.java.l2;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Количество котов: "+ getCount(15));
        System.out.println(main.getCharacter());
    }

    static public Long getCount(){
        Long count = 10L;
        long newCount = 10L;
        return  count + newCount;
    }

    static public Long getCount(int size){
        Long count = 10L;
        long newCount = 10L;
        if (size > 10) {
            count *= 2;
        }
        return  count + newCount;
    }

    private Character getCharacter(){
        Character character = new Character('C');
        return  character;

    }


}
