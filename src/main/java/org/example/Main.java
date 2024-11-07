package org.example;


import football.Team;
import football.Players;
import football.Tournament;
import football.Matches;
import person.Car;
import person.Person;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


Person owner = new Person();
owner.name ="Judit";
owner.age = 23;

Car car = new Car();
car.owner = owner;
car.model = "Bentley";
//System.out.println("Before:"+ owner.name+ owner.age);
//System.out.println(car.model);
//updatePerson(owner);
//System.out.println("After update method: "+car.owner.name + car.owner.age);

int num = 4;

System.out.println(num);
doubleNumber(num);
//it will not double due to this is primitive and it gets copied only
System.out.println("after calling the double method " + num);



    }

    public static void updatePerson(Person person) {
        person.name="Anita";
        person.age=52;
    }

    public static void doubleNumber(int num){
        num = num * 2;
    }
}