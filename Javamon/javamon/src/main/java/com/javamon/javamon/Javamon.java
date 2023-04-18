package com.javamon.javamon;

import java.util.Random;

public class Javamon {

    private String name;
    private int strength;
    private int defence;
    private int agility;
    private int life;
    private Random random = new Random();

    public Javamon(String nombre) {
        this.name = nombre;
        initAttributes();
    }

    private void initAttributes() {
        int pointsToDeal = 18;
        int whatAttrib = 0;
        int max = 0;
        strength = defence = agility = 0;
        while (pointsToDeal > 0) {
            whatAttrib = random.nextInt(3);
            switch (whatAttrib) {
                case 0:
                strength++;
                    break;
                case 1:
                defence++;
                    break;
                case 2:
                agility++;
                    break;
                default:
                    break;
            }
            pointsToDeal--;
        }
        life = strength + defence + 6;
    }

    public int initiative(){
        return agility + random.nextInt(6);
    }

    public int attack(){
        return strength + random.nextInt(6);
    }

    public int defend(){
        return ((agility + defence) / 2) + random.nextInt(6);
    }

    public String status(){
        return name + "(" + life + ") | S:"+strength + "| D:"+defence+"| A:"+agility; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Random getRandom() {
        return this.random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }



}
