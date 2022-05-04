class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student() {}

    Student (String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal() {
        return kor + eng + math;
    }
    public float getAverage() {
        return Math.round(10 * getTotal() / 3.0f) / 10.0f;
    }
    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
                + "," + getTotal() + "," + getAverage();
    }
}

public class Exercise06_02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 76;
        s.math = 60;

        System.out.println("name: " + s.name);
        System.out.println("total: " + s.getTotal());
        System.out.println("average: " + s.getAverage());
    }
}
