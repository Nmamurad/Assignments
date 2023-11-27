import java.util.Scanner;
import java.util.Random;
public class Student extends person {
    Scanner input= new  Scanner (System.in);
    Random rdm = new Random();
    private  int stdID= rdm.nextInt(0,1000);
    private final int [] mark= new int[5];
    private int grade;
private int avgmark;
private int max;
private int mini;
    public void setStdID( int stdID) {
        stdID=stdID;

    }

public void setMax(int max) {
        this.max = max;
    }

    public void setAvgmark(int avgmark) {
        if(avgmark>0 & avgmark<100) {
            this.avgmark = avgmark;
        }
    }

    public void setGrade(int grade) {
            this.grade = grade;
    }
    public void setMini(int mini) {
        this.mini = mini;
    }
    public int getStdID() {
        return stdID;
    }
    public int getGrade() {
        return grade;
    }

    public int getAvgmark() {

            return avgmark;

    }

    public int getMax() {
        return max;
    }

    public int getMini() {
        return mini;
    }
    int oop;
    int elc;
    int entr;
    int datab;
    int lial;
    @Override
    public void Display() {
        System.out.println("Please Enter Your ID:");
        stdID= input.nextInt();
        super.Display();
        System.out.println("Enter your grade stage ");
        grade=input.nextInt();
        System.out.println("Enter your mark in the 5 Subjects to determine your average mark with maximum and minimum values\n");

    }
    public void TableD(){

            System.out.println("  ID      FullName      Age      Adress      Grade     AverageMark     Max      " +
                            " \n******   *********     ****    ********    *******   *************    *****  " +
                             "\n"+getStdID()+"      "+super.getFullN()+"      "+super.getAge()+"      "+super.getAdss()+"      "+getGrade()+"     "+getAvgmark());

    }

    public int maxMark(){
        int max = this.mark[0];
        for (int i=0; i<5 ; i++){
            if (this.mark[i]>max){
                max =this.mark[i];
            }
        }
        return max;
    }

    public int minMark(){
        int min = this.mark[0];
        for (int i=0; i<5 ; i++){
            if (this.mark[i]<min){
                min =this.mark[i];
            }
        }
        return min;
    }

    public double average(){
        int sum=0;
        for (int i=0; i<5 ; i++){
            sum+=this.mark[i];
        }
        return sum/5.0;
    }


}
