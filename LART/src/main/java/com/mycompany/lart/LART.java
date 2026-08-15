/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lart;

/**
 *
 * @author CompLabC209-PC34
 */
public class LART {

    public static void main(String[] args) {

        displayGreetings();
        displayInfo();

    }

    static void displayGreetings() {
        System.out.println("Welcome to my project!");
    }

    static void displayInfo() {
        displayCharacter();
        displayClass();
    }

    static void displayCharacter() {
        System.out.println("Sakyu Basu\nShe and her sister are finding way to give her mother a life again after being killed by a human.");
    }

    static void displayClass() {
        System.out.println("Demon Entity\nShe is a demon and invincible at this stage.");
        displaySkills();
        displayTrait();
    }

    static void displayTrait() {
        System.out.println("Seduction\nShe uses this not to be inappropriate but to lure human into killing them instead.");
    }

    static void displaySkills() {
        StrongSelfDefense();
        SuperHumanStrength();
        Shapeshift();
        TheGreatPretender();
    }

    static void StrongSelfDefense() {
        System.out.println("Strong Self-Defense\nIncapable but once she sees her younger sister get harmed she'll be strong and heroic and will try to apprehend the attacker.");
    }

    static void SuperHumanStrength() {
        System.out.println("Super Human Strength\nShe is suspiciously strong whether she is in her human or demon form.");
    }

    static void Shapeshift() {
        System.out.println("Shapeshift\nShe can blend in the crowd or copy someone's appearance.");
    }

    static void TheGreatPretender() {
        System.out.println("The Great Pretender\nShe pretends to be nice.");
    }
}