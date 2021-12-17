package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss(300, 50, "защита");

boss1.weaponName.setWeaponName("ak47");
boss1.weaponGun.setWeaponGun("стрелять");

        System.out.println( "xp"+boss1.getHealth()+" uron"+boss1.getDamage()+" "
                +boss1.getPower()+" "+boss1.weaponName.getWeaponName()+" "+boss1.weaponGun.getWeaponGun());


    }
}
