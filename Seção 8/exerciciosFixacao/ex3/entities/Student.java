package entities;

public class Student {
    public String name;
    public double[] mark = new double[3];


    public double grade(){
         return this.mark[0] + this.mark[1] + this.mark[2];
    }

    public double missingPoint() {
        if (grade() < 60) {
            return 60 - grade();
        } else {
            return 0;
        }
    }
}
