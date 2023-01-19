package com.tutorial;

//player
class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        this.weapon.display();
        this.armor.display();
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println("\n" + this.name + " is attacking " + opponent.name +
        " with power " + attackPower + " !");

        opponent.defence(attackPower);
        
    }

    void defence(double attackPower){
       

        //damaged
        double damage;

        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }
        else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " got damage " + damage + " !");

    }
}

//senjata
class Weapon{
    String name;
    double attackPower;

    Weapon(String name, double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.println("Weapon: " + this.name + ", attack: " + this.attackPower);
    }
}

//armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.defencePower = defencePower;
        this.name = name;
    }

    void display(){
        System.out.println("Armor: " + this.name + ", defence: " + this.defencePower);
    }

}

public class Latihan1 {
    public static void main(String[] args) {

        //membuat object player
        Player player1 = new Player("Anton", 100);
        Player player2 = new Player("Filir", 50);
        Player player3 = new Player("Eddie", 250);
        
        //membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("Ketapel", 1);
        Weapon Katana = new Weapon("Katana", 2000);


        //membuat object armor
        Armor bajuBesi = new Armor("Baju besi", 10);
        Armor kaos = new Armor("Kaos", 0);
        Armor kimono = new Armor("Kimono", 200);

        //equip senjata
        player1.equipWeapon(pedang);
        player2.equipWeapon(ketapel);
        player3.equipWeapon(Katana);
        //equip armor
        player1.equipArmor(bajuBesi);
        player2.equipArmor(kaos);
        player3.equipArmor(kimono);

        System.out.println("\nPERTEMPURAAANNNN!!");
        System.out.println("\nEpisode - 1\n");
        player3.attack(player1);
        player1.display();
        player2.display();
        player3.display();

        System.out.println("\nEpisode - 2\n");
        player1.attack(player3);
        player1.display();
        player2.display();
        player3.display();

        
        
    }
}
