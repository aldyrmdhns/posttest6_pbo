//Import Library
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.io.IOException;

public class Main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(isr);
    static Party newParty = new Party();
    static ArrayList<Hero> dataHero = new ArrayList<>(){
        {
            add(new Hero("Kamisato Ayaka", "Frostlake Heron", "Cryo", "Kamisato CLan", "Inazuma", 342.03, 12858, 783.93, 150,25.30, 180.0, new String[]{"Kabuki","Hyouka", "Soumetsu"}, new String[]{"Amastsumi Kunitsumi", "Kanten Senmyou"}));
            add(new Hero("Ningguang", "Eclipsing Star", "Geo", "Liyue Qixing", "Liyue", 212.4, 9787, 573.32, 50,79.3, 150.0, new String[]{"Sparkling Scatter","Jade Screen", "Starshatter"}, new String[]{"Backup Plan", "Stratergic Reserve"}));
            add(new Hero("Jean", "Dandelion Knight", "Anemo", "Favonious Knight", "Mondstat", 239.18, 14695, 768.55, 300,55.0, 80.0, new String[]{"Favonious Bladework","Gale Blade", "Dandelion Breeze"}, new String[]{"Wind Companion", "Let The Wind Lead"}));
            add(new Hero("Eula", "Dance Of the Shimmering Wave", "Cryo", "Favonious Knight", "Mondstat", 342.18, 13225, 750.55, 130,55.0, 80.0, new String[]{"Favonious Bladework - Edel","Icetide Vortex", "Glacial Illumination"}, new String[]{"Roiling Rime", "Wellspring of War-Lust"}));
            add(new Hero("Kaedahara Kazuha", "Scarlet Leaves Pursue Wild Waves", "Anemo", "The Crux", "Inazuma", 296.18, 13345, 806.55, 800,55.0, 80.0, new String[]{"Garyuu Bladework","Chihayaburu", "Kazuha Slash"}, new String[]{"Soumon Swordmanship", "Poetics of Fuubutsu"}));
            add(new Hero("Zhongli", "Vago Mudo", "Geo", "Liyue Harbor", "Liyue", 251.18, 14695, 737.55, 50,55.0, 80.0, new String[]{"Rain of Stone","Dominus Lapidis", "Planet Befall"}, new String[]{"Resonant Waves", "Dominance of Earth"}));
        }
    };
    static ArrayList<Enemy> dataEnemy = new ArrayList<>(){
        {
            add(new Enemy("Azdaha", "Sealed Lord of Vishaps", "Geo", "World", "Liyue", "Boss", "Dragon"));
            add(new Enemy("Mirror Maiden", "Mirror Envoy", "Cryo", "Fatui", "Snezhaya", "Elite", "Humanoid"));
            add(new Enemy("Maguu Kenki", "Doll of Calamity", "Anemo & Cryo", "???", "Inazuma","Boss", "Automaton"));
        }
    };
    static ArrayList<Weapon> dataWeapon = new ArrayList<>(){
        {
            add(new Weapon("Mistsplitter Reforged", 5, "Sword", "Mistsplitter's Edge", 47.54));
            add(new Weapon("Memory of Dust", 5, "Catalyst", "Golden Majesty", 45.94));
            add(new Weapon("Elegy for The End", 5, "Bow", "The Parting Refrain", 45.94));
        }
    };
    public static void main(String[] args) throws NumberFormatException, IOException{
        Boolean loop = true;
        int choose = 0;

        while(loop){
            while (true) {
                try {
                    ClearScreen();
                    System.out.println("|=================================|");
                    System.out.println("|          GENSHIN IMPACT         |");
                    System.out.println("|        CHARACTER & WEAPON       |");
                    System.out.println("|=================================|");
                    System.out.println("|  [1]  Display Character         |");
                    System.out.println("|  [2]  Display Weapon            |");
                    System.out.println("|=================================|");
                    System.out.println("|  [3]  Add Character             |");
                    System.out.println("|  [4]  Add Weapon                |");
                    System.out.println("|=================================|");
                    System.out.println("|  [5]  Edit Character            |");
                    System.out.println("|  [6]  Edit Weapon               |");
                    System.out.println("|=================================|");
                    System.out.println("|  [7]  Delete Character          |");
                    System.out.println("|  [8]  Delete Weapon             |");
                    System.out.println("|=================================|");
                    System.out.println("|  [9]  Create Party              |");
                    System.out.println("|=================================|");
                    System.out.println("|  [0]  Exit                      |");
                    System.out.println("|=================================|");
                    System.out.print("   >> ");
                    choose = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" Masukan Input dengan Benar ! ! !");
                    System.out.println("  Tekan Enter Untuk Kembali");
                    input.readLine();
                }
            }
    
            switch (choose) {
                case 1: ClearScreen(); isDisplayChar(); break;
                case 2: ClearScreen(); isDisplayWeapon(); break;
                case 3: ClearScreen(); isAddChar(); break;
                case 4: ClearScreen(); isAddWeapon(); break;
                case 5: ClearScreen(); isUpdateChar(); break;
                case 6: ClearScreen(); isUpdateWeapon(); break;
                case 7: ClearScreen(); isDeleteChar(); break;
                case 8: ClearScreen(); isDeleteWeapon(); break;
                case 9: ClearScreen(); CreateParty(); break;
                case 0:
                    ClearScreen();
                    System.out.println(" Adios Amigos~");
                    loop = false;
                    break;
                default:
                    ClearScreen();
                    System.out.println("- Inputan Salah -");
                    input.readLine();
                    break;
            }
        }
    }

    //CRUD Method/Function
    //Read
    static void isDisplayChar() throws IOException{
        int choose;
        int dataHeroSize = dataHero.size();
        int dataEnemySize = dataEnemy.size();
        String chooseChar;
        System.out.println("=====================================");
        System.out.println("  [1] Hero Character");
        System.out.println("  [2] Hostile Character");
        System.out.println("=====================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("=====================================");
        ClearScreen();
        
        if (choose == 1) {
            if (dataHeroSize == 0) {
                System.out.println(" Your Database's Empty ");
            } else{
                for (int i = 0; i < dataHeroSize; i++) {
                    dataHero.get(i).Display();
                    // pesan.get(i).isDisplay(); System.out.println();
                }
                System.out.println(" Which Character You want to see the detail : "); chooseChar = input.readLine();
                ClearScreen();
                for (Hero hero : dataHero) {
                    hero.Display(chooseChar);
                    hero.regionBuff(chooseChar);
                }
            }
        } else if (choose == 2) {
            if (dataEnemySize == 0) {
                System.out.println(" Your Database's Empty ");
            } else{
                for (int i = 0; i < dataEnemySize; i++) {
                    dataEnemy.get(i).Display();
                    // pesan.get(i).isDisplay(); System.out.println();
                } 
            }
        }
        System.out.println(" Press [ENTER] to Continue"); input.readLine();
    }

    static void isDisplayWeapon() throws IOException{
        int dataWeaponSize = dataWeapon.size();
        if (dataWeaponSize == 0) {
            System.out.println(" Data Pesanan Masih Kosong ");
        } else{
            for (int i = 0; i < dataWeaponSize; i++) {
                System.out.println("=====================================");
                System.out.println("| Name          : " + dataWeapon.get(i).getName());
                System.out.println("| Rarity        : " + dataWeapon.get(i).getRarity());
                System.out.println("| Family        : " + dataWeapon.get(i).getFamily());
                System.out.println("| Affix         : " + dataWeapon.get(i).getAffix());
                System.out.println("| Base Attack   : " + dataWeapon.get(i).getBaseAttack());
                System.out.println("=====================================");
                // pesan.get(i).isDisplay(); System.out.println();
            }
            System.out.println(" Press [ENTER] to Continue"); input.readLine();
        }
    }

    //Create
    static void isAddChar() throws NumberFormatException, IOException{
        String heroName, heroTitle, heroElement, heroAssociation, heroRegion;
        String skill1, skill2, skill3, passive1, passive2;
        int heroHP, heroEM;
        double heroAttack, heroDeff, heroCr, heroCd;
        String enemyName, enemyTitle, enemyElement, enemyAssociation, enemyGrade, enemyCategory, enemyRegion;
        int choose;
        boolean isInArray = true;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|               Which Character You Want to Add                |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            while (true) {
                try {
                    System.out.println("================================================================");
                    System.out.println("|                       Insert Your Hero                       |");
                    System.out.println("================================================================");
                    System.out.print(" Hero Name                : "); heroName = input.readLine();
                    System.out.print(" Hero Title               : "); heroTitle = input.readLine();
                    System.out.print(" Hero Element             : "); heroElement = input.readLine();
                    System.out.print(" Hero Association         : "); heroAssociation = input.readLine();
                    System.out.print(" Hero Region              : "); heroRegion = input.readLine();
                    System.out.println("================================================================");
                    System.out.print(" Hero Attack              : "); heroAttack = Double.parseDouble(input.readLine());
                    System.out.print(" Hero HP                  : "); heroHP = Integer.parseInt(input.readLine());
                    System.out.print(" Hero Deffense            : "); heroDeff = Double.parseDouble(input.readLine());
                    System.out.print(" Hero Elemental Mastery   : "); heroEM = Integer.parseInt(input.readLine());
                    System.out.print(" Hero Critical Rate       : "); heroCr = Double.parseDouble(input.readLine());
                    System.out.print(" Hero Critical Damage     : "); heroCd = Double.parseDouble(input.readLine());
                    System.out.println("================================================================");
                    System.out.print(" 1st Skill                : "); skill1 = input.readLine();
                    System.out.print(" 2nd Skill                : "); skill2 = input.readLine();
                    System.out.print(" 3rd Skill                : "); skill3 = input.readLine();
                    System.out.print(" 1st Passive              : "); passive1 = input.readLine();
                    System.out.print(" 2nd Passive              : "); passive2 = input.readLine();

                    break;    
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" There's Wrong Input, please Do it Again");
                    System.out.println("  Press [ENTER] to continue");
                    input.readLine();
                    ClearScreen();
                }
            }
            System.out.println("================================================================");
            
            for (int i = 0; i < dataHero.size(); i++) {
                if (dataHero.get(i).getName().equals(heroName)) {
                    System.out.println(" - Your Character's already in the database !!! ");
                    System.out.println("  Press [ENTER] to continue"); input.readLine();
                    isInArray = false;
                }
            }
    
            if (isInArray) {
                Hero addHero = new Hero(heroName, heroTitle, heroElement, heroAssociation, heroRegion, heroAttack, heroHP, heroDeff, heroEM, heroCr, heroCd, new String[]{skill1, skill2, skill3}, new String[]{passive1, passive2});
                dataHero.add(addHero);
                System.out.println("                Successfully Added Your Character               ");
                System.out.println("================================================================");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
            }
        } else if (choose == 2){
            while (true) {
                try {
                    System.out.println("================================================================");
                    System.out.println("|                      Insert Your Enemy                       |");
                    System.out.println("================================================================");
                    System.out.print(" Enemy Name           : "); enemyName = input.readLine();
                    System.out.print(" Enemy Title          : "); enemyTitle = input.readLine();
                    System.out.print(" Enemy Element        : "); enemyElement = input.readLine();
                    System.out.print(" Enemy Association    : "); enemyAssociation = input.readLine();
                    System.out.print(" Enemy Association    : "); enemyRegion = input.readLine();
                    System.out.print(" Enemy Grade          : "); enemyGrade = input.readLine();
                    System.out.print(" Enemy Category       : "); enemyCategory = input.readLine();
                    break;    
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" There's Wrong Input, please Do it Again");
                    System.out.println("  Press [ENTER] to continue");
                    input.readLine();
                    ClearScreen();
                }
            }
            System.out.println("================================================================");
            
            for (int i = 0; i < dataEnemy.size(); i++) {
                if (dataEnemy.get(i).getName().equals(enemyName)) {
                    System.out.println(" - Your Character's already in the database !!! ");
                    System.out.println("  Press [ENTER] to continue"); input.readLine();
                    isInArray = false;
                }
            }
    
            if (isInArray) {
                Enemy addEnemy = new Enemy(enemyName, enemyTitle, enemyElement, enemyAssociation, enemyRegion,enemyGrade, enemyCategory);
                dataEnemy.add(addEnemy);
                System.out.println("                Successfully Added Your Character               ");
                System.out.println("================================================================");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
            }
        }
    }

    static void isAddWeapon() throws NumberFormatException, IOException{
        String name, family, affix;
        int rarity;
        Double baseAttack;
        boolean isInArray = true;
        ClearScreen();

        while (true) {
            try {
                System.out.println("================================================================");
                System.out.println("|                       Insert Your Weapon                     |");
                System.out.println("================================================================");
                System.out.print(" Weapon Name          : "); name = input.readLine();
                System.out.print(" Weapon Rarity        : "); rarity = Integer.parseInt(input.readLine());
                System.out.print(" Weapon Family        : "); family = input.readLine();
                System.out.print(" Weapon Affix         : "); affix = input.readLine();
                System.out.print(" Weapon Base Attack   : "); baseAttack = Double.parseDouble(input.readLine());
                break;    
            } catch (Exception e) {
                ClearScreen();
                System.out.println(" There's Wrong Input, please Do it Again");
                System.out.println("  Press [ENTER] to continue");
                input.readLine();
                ClearScreen();
            }
        }
        System.out.println("================================================================");
        
        for (int i = 0; i < dataWeapon.size(); i++) {
            if (dataWeapon.get(i).getName().equals(name)) {
                System.out.println(" - Your Weapon's already in the database !!! ");
                System.out.println("  Press [ENTER] to continue"); input.readLine();
                isInArray = false;
            }
        }

        if (isInArray) {
            Weapon addWeapon = new Weapon(name, rarity, family, affix, baseAttack);
            dataWeapon.add(addWeapon);
            System.out.println("                Successfully Added Your Weapon                 ");
            System.out.println("================================================================");
            System.out.println("  Press [ENTER] to continue");
            input.readLine();
        }
    }

    // Update
    static void isUpdateChar() throws NumberFormatException ,IOException{
        String skill1, skill2, skill3, passive1, passive2;
        String findName;
        int choose;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|              Which Character You Want to Update              |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            int dataHeroSize = dataHero.size();
            if (dataHeroSize == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                          Hero's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    System.out.println(i+1 + ". " + dataHero.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert your Hero's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (Hero hero : dataHero) {
                    if (hero.getName().equals(findName)) {
                        System.out.println("================================================================");
                        System.out.println("|                       Update Your Hero                       |");
                        System.out.println("================================================================");
                        System.out.print(" Hero Name                : "); hero.setName(input.readLine());
                        System.out.print(" Hero Title               : "); hero.setTitle(input.readLine());
                        System.out.print(" Hero Element             : "); hero.setElement(input.readLine());
                        System.out.print(" Hero Association         : "); hero.setAssociation(input.readLine());
                        System.out.print(" Hero Region              : "); hero.setRegion(input.readLine());
                        System.out.println("================================================================");
                        System.out.print(" Hero Attack              : "); hero.setAttack(Double.parseDouble(input.readLine()));
                        System.out.print(" Hero HP                  : "); hero.setHp(Integer.parseInt(input.readLine()));
                        System.out.print(" Hero Deffense            : "); hero.setDeffense(Double.parseDouble(input.readLine()));
                        System.out.print(" Hero Elemental Mastery   : "); hero.setElementalMastery(Integer.parseInt(input.readLine()));
                        System.out.print(" Hero Critical Rate       : "); hero.setCriticalRate(Double.parseDouble(input.readLine()));
                        System.out.print(" Hero Critical Damage     : "); hero.setCriticalDamage(Double.parseDouble(input.readLine()));
                        System.out.println("================================================================");
                        System.out.print(" 1st Skill                : "); skill1 = input.readLine();
                        System.out.print(" 2nd Skill                : "); skill2 = input.readLine();
                        System.out.print(" 3rd Skill                : "); skill3 = input.readLine();
                        String[] newSkills = {skill1, skill2, skill3};
                        hero.setSkills(newSkills);
                        System.out.print(" 1st Passive              : "); passive1 = input.readLine();
                        System.out.print(" 2nd Passive              : "); passive2 = input.readLine();
                        String[] newPassives = {passive1, passive2};
                        hero.setSkills(newPassives);
                        System.out.println("================================================================");
                        System.out.println(" Successfully Update Your Hero!!! Press [ENTER] to Continue"); input.readLine();
                        System.out.println("================================================================");
                    }
                }
            }
        } else if(choose == 2){
            int dataEnemySize = dataEnemy.size();
            if (dataEnemySize == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                         Enemy's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    System.out.println(i+1 + ". " + dataEnemy.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert your Enemy's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (Enemy enemy : dataEnemy) {
                    if (enemy.getName().equals(findName)) {
                        System.out.println("================================================================");
                        System.out.println("|                       Update Your Enemy                       |");
                        System.out.println("================================================================");
                        System.out.print(" Enemy Name           : "); enemy.setName(input.readLine());
                        System.out.print(" Enemy Title          : "); enemy.setTitle(input.readLine());
                        System.out.print(" Enemy Element        : "); enemy.setElement(input.readLine());
                        System.out.print(" Enemy Association    : "); enemy.setAssociation(input.readLine());
                        System.out.print(" Enemy Grade          : "); enemy.setGrade(input.readLine());
                        System.out.print(" Enemy Category       : "); enemy.setCategory(input.readLine());
                        System.out.println("================================================================");
                        System.out.println(" Successfully Update Your Enemy!!! Press [ENTER] to Continue"); input.readLine();
                        System.out.println("================================================================");
                    }
                }
            }
        }
    }

    static void isUpdateWeapon() throws NumberFormatException, IOException{
        String findName;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|                        Weapon's List                         |");
        System.out.println("================================================================");
        for (int i = 0; i < dataWeapon.size(); i++) {
            System.out.println(i+1 + ". " + dataWeapon.get(i).getName());
        }
        System.out.println("================================================================");
        System.out.print("  Insert Your Weapon Name: "); findName = input.readLine();
        System.out.println("================================================================");
        for (Weapon weapon : dataWeapon) {
            if (weapon.getName().equals(findName)) {
                System.out.println("================================================================");
                System.out.println("|                       Update Your Weapon                     |");
                System.out.println("================================================================");
                System.out.print(" Weapon Name          : "); weapon.setName(input.readLine());
                System.out.print(" Weapon Rarity        : "); weapon.setRarity(Integer.parseInt(input.readLine()));
                System.out.print(" Weapon Family        : "); weapon.setFamily(input.readLine());
                System.out.print(" Weapon Affix         : "); weapon.setAffix(input.readLine());
                System.out.print(" Weapon Base Attack   : ");  weapon.setBaseAttack(Double.parseDouble(input.readLine()));
                System.out.println("================================================================");
                System.out.println(" Successfully Update Your Weapon!!! Press [ENTER] to Continue"); input.readLine();
                System.out.println("================================================================");
            }
        }
    }
    
    //Delete
    static void isDeleteChar() throws NumberFormatException, IOException{
        String findName;
        String yes = "y", no = "n";
        int choose;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|              Which Character You Want to Delete              |");
        System.out.println("================================================================");
        System.out.println("|  [1]  Hero ");
        System.out.println("|  [2]  Enemy ");
        System.out.println("================================================================");
        System.out.print("  >> "); choose = Integer.parseInt(input.readLine());
        System.out.println("================================================================");
        ClearScreen();

        if (choose == 1) {
            if (dataHero.size() == 0) {
                System.out.println(" Your Database's Empty! ");
            } else{
                System.out.println("================================================================");
                System.out.println("|                          Hero's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    System.out.println(i+1 + ". " + dataHero.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert Your Hero's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (int i = 0; i < dataHero.size(); i++) {
                    if (dataHero.get(i).getName().equals(findName)) {
                        dataHero.get(i).Display();
                        while (true) {
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            if (acc.equals(yes)) {
                                dataHero.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                    }
                }
                input.readLine();
            }
        } else if(choose == 2){
            if (dataHero.size() == 0) {
                System.out.println(" Your Database's Empty! ");
            } else {
                System.out.println("================================================================");
                System.out.println("|                         Enemy's List                         |");
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    System.out.println(i+1 + ". " + dataEnemy.get(i).getName());
                }
                System.out.println("================================================================");
                System.out.print("  Insert Your Enemy's Name : "); findName = input.readLine();
                System.out.println("================================================================");
                for (int i = 0; i < dataEnemy.size(); i++) {
                    if (dataEnemy.get(i).getName().equals(findName)) {
                        dataEnemy.get(i).Display();
                        while (true) {
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            if (acc.equals(yes)) {
                                dataEnemy.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                    }
                }
                input.readLine();
            }
        }
    }

    static void isDeleteWeapon() throws NumberFormatException, IOException{
        String findName;
        String yes = "y", no = "n";

        if (dataWeapon.size() == 0) {
            System.out.println(" Your Database's Empty! ");
        } else{
            System.out.println("================================================================");
            System.out.println("|                        Weapon's List                         |");
            System.out.println("================================================================");
            for (int i = 0; i < dataWeapon.size(); i++) {
                System.out.println(i+1 + ". " + dataWeapon.get(i).getName());
            }
            System.out.println("================================================================");
            System.out.print("  Insert Your Weapon's Name : "); findName = input.readLine();
            System.out.println("================================================================");       
            for (int i = 0; i < dataWeapon.size(); i++) {
                if (dataWeapon.get(i).getName().equals(findName)) {
                    dataWeapon.get(i).Display();
                        while (true) {
                            System.out.flush();
                            System.out.println(" Do You Really Want to delete this Data? [y/n]"); String acc = input.readLine();
                            System.out.flush();
                            if (acc.equals(yes)) {
                                dataWeapon.remove(i);
                                System.out.println("Successfully Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else if(acc.equals(no)){
                                System.out.println("Your data's not Deleted!!");
                                System.out.println("  Press [ENTER] to Continue");
                                break;
                            } else{
                                System.out.println("Cannot Read your Input");
                                System.out.println("  Press [ENTER] to Continue");
                                input.readLine();
                            }
                        }
                }
            }
            input.readLine();
        }
    }

    //Some Other Methods/Function
    public static void CreateParty() throws NumberFormatException, IOException{
        int choose = 0;
        boolean loop = true;
        while(loop){
            while (true) {
                try {
                    ClearScreen();
                    System.out.println("|=================================|");
                    System.out.println("|          GENSHIN IMPACT         |");
                    System.out.println("|        CHARACTER & WEAPON       |");
                    System.out.println("|=================================|");
                    System.out.println("|  [1]  Display Party             |");
                    System.out.println("|  [0]  Exit                      |");
                    System.out.println("|=================================|");
                    System.out.print("   >> ");
                    choose = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" Masukan Input dengan Benar ! ! !");
                    System.out.println("  Tekan Enter Untuk Kembali");
                    input.readLine();
                }
            }
            switch (choose) {
                case 1: ClearScreen(); isDisplayParty(); break;
                case 0: ClearScreen(); loop = false; break;
                default:
                    ClearScreen();
                    System.out.println("- Inputan Salah -");
                    input.readLine();
                    break;
            }
        }
    }

    public static void isDisplayParty() throws NumberFormatException ,IOException{
        int choose;
        boolean loop = true;

        while (loop) {
            System.out.println("==================================");
            System.out.println("     " +  newParty.getPartyName() + "    ");
            System.out.println("==================================");
            newParty.Display();
            input.readLine();
            System.out.println("==================================");
            System.out.println("1. Change Party  |  2. Exit       ");
            System.out.print("   >> ");
            choose = Integer.parseInt(input.readLine());
            switch (choose) {
                case 1: ClearScreen(); changeParty(); break;
                case 2: ClearScreen(); loop = false; break;
                default:
                    ClearScreen();
                    System.out.println("- Inputan Salah -");
                    input.readLine();
                    break;
            }
            
        }
    }

    public static void changeParty() throws IOException{
        String char1, char2, char3, char4;
        String ele1 = "", ele2 = "", ele3 = "", ele4 = "";
        System.out.println("============= Available Hero =============");
        for (int i = 0; i < dataHero.size(); i++) {
            dataHero.get(i).Display();
        }
        System.out.println("============================================");
        System.out.println(" Choose your First Character  >> "); char1 = input.readLine();
        System.out.println(" Choose your Second Character >> "); char2 = input.readLine();
        System.out.println(" Choose your Third Character  >> "); char3 = input.readLine();
        System.out.println(" Choose your Fourth Character >> "); char4 = input.readLine();
        System.out.println("==============================================");

        for (int i = 0; i < dataHero.size(); i++) {
            if (dataHero.get(i).getName().equals(char1)){
                ele1 = dataHero.get(i).getElement();
            }
        }
        for (int i = 0; i < dataHero.size(); i++) {
            if (dataHero.get(i).getName().equals(char2)){
                ele2 = dataHero.get(i).getElement();
            }
        }
        for (int i = 0; i < dataHero.size(); i++) {
            if (dataHero.get(i).getName().equals(char3)){
                ele3 = dataHero.get(i).getElement();
            }
        }
        for (int i = 0; i < dataHero.size(); i++) {
            if (dataHero.get(i).getName().equals(char4)){
                ele4 = dataHero.get(i).getElement();
            }
        }
        String[] addElement = {ele1, ele2, ele3, ele4};
        String[] addChar = {char1, char2, char3, char4};
        newParty.setMember(addChar);
        newParty.setElement(addElement);
        ClearScreen();
    }

    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("Gagal Membersihkan");
        }
    }
}