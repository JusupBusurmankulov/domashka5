package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss Boss = new Boss();
        Boss.setBossHealth(999999);
        Boss.setBossDamage(9999999);
        Boss.setBossTypeDefence("superDefence");
        System.out.println("Boss Damage:"+"["+Boss.getBossDamage()+"]"+" " +"Boss Health:"+"("+ Boss.getBossHealth()+")"+" "+"Boss Type Defence:"+"{"+ Boss.getBossTypeDefence()+"}" );
        for (Hero Hero: createHeroes()
             ) {
            System.out.println("("+Hero.getHealth()+")"+"  [" + Hero.getDamage()+ "] " + "{"+Hero.getSuperPower()+"}");

        }
    }
    public static Hero[] createHeroes () {
        Hero killer = new Hero(99999, 999999, "Blood Lust");
        Hero warrior = new Hero(99999, 999999, "300 Spartans");
        Hero prince = new Hero(99999, 999999,"Convocation Of Knights");
        return new Hero[]{killer,warrior,prince};
    }






}
