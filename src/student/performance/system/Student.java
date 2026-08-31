/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.performance.system;
import java.util.ArrayList;

public class Student {
  
    private  String name;
    private  int age;
    private  String course;
    private  ArrayList <Integer> marks;
    
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
        
        marks = new ArrayList<>();
    
        
    }
    void addMarks(int mark) {
        marks.add(mark);
        
    }
    int getTotal(){
        int total = 0;
        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }
        return total;
    }
    double getAverage() {
        double average = getTotal() / (double) marks.size();
        return average;
    }
    int getHighest() {
        int highest = marks.get(0);
        for (int i = 1 ; i <marks.size(); i++)
            if (marks.get(i)> highest ){
                highest = marks.get(i);
            }
        return highest;
          
    }
       int getLowest() {
        int lowest = marks.get(0);
        for (int i = 1 ; i <marks.size(); i++)
            if (marks.get(i) < lowest ){
                lowest = marks.get(i);
            }
        return lowest;     
       }   
        String getResult(){
           if (getAverage()>= 50){
               return "Pass";
               
           }
           else {
               return "Fail";
           }
        }
           void displayReport(){
            System.out.println("Name:"+name);
            System.out.println("Age:" + age);
            System.out.println("Course:"+ course);
            System.out.println("Total:"+ getTotal());
            System.out.println("Average:"+ getAverage());
            System.out.println("Highest:"+getHighest());
            System.out.println("Lowest:"+ getLowest());
            System.out.println("Result:"+ getResult());
        }

    
    }
           


