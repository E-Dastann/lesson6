package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss(300, 50, "защита");

        boss1.weaponName.setWeaponName("ak47");
        boss1.weaponGun.setWeaponGun("стрелять");

        System.out.println("xp" + boss1.getHealth() + " uron" + boss1.getDamage() + " "
                + boss1.getPower() + " " + boss1.weaponName.getWeaponName() + " " + boss1.weaponGun.getWeaponGun());

        Boss printInfo = new Boss(300, 50, "protection");

        Skeleton skeleton = new Skeleton(300, 50, "защита ");
        skeleton.setFirstShot("two ");
        skeleton.setHealth(400);
        skeleton.setDamage(50);
        skeleton.setPower("magic");
        skeleton.weaponName.setWeaponName("vintovka");
        skeleton.weaponGun.setWeaponGun("стрльяеть");
        System.out.println(skeleton.getFirstShot()+" xp"+skeleton.getHealth()+" uron"+skeleton.getDamage()+" sposobnost-"+skeleton.getPower()+
                " называния-"+skeleton.weaponName.getWeaponName()+"\n огнистрелная-"+skeleton.weaponGun.getWeaponGun());
        System.out.println("____________________________________________________________________________");
        Skeleton skeleton1 = new Skeleton(400, 40, "защита себя ");
        skeleton1.weaponName.setWeaponName("m16");
        skeleton1.weaponGun.setWeaponGun("пять раз");
        skeleton1.setHealth(350);
        skeleton1.setDamage(30);
        skeleton1.setPower("уклонения ");
        skeleton1.setFirstShot("sem");
        System.out.println("выстрелы-"+skeleton1.weaponGun.getWeaponGun()+" называния-" +skeleton1.weaponName.getWeaponName()+
                "xp-"+skeleton1.getHealth()+" uron-"+skeleton1.getDamage()+" способность-"+skeleton1.getPower()+"выстрель-"+skeleton1.getFirstShot());



    }

}
