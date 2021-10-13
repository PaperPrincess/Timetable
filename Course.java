package com.company;

public class Course {

        private int numberCourse;
        private int numberGroup;

      private Course(int numberGroup, int numberCourse){
            this.numberCourse = numberCourse;
            this.numberGroup = numberGroup;
        }

    public int getNumberCourse() {
        return numberCourse;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberCourse(int numberCourse) {
        this.numberCourse = numberCourse;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }
}
