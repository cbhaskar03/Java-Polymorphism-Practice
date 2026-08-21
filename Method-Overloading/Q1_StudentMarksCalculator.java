class StudentMarks {

    void calculateTotal(int marks1, int marks2) {
        int total = marks1 + marks2;
        System.out.println("The total of two marks: " + total);
    }

    void calculateTotal(int marks1, int marks2, int marks3) {
        int total = marks1 + marks2 + marks3;
        System.out.println("The total of 3 marks: " + total);
    }

    void calculateTotal(int marks1, int marks2, int marks3, int marks4) {
        int total = marks1 + marks2 + marks3 + marks4;
        System.out.println("The total of 4 marks: " + total);
    }
}

class Main {

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();

        student.calculateTotal(60, 80);
        student.calculateTotal(60, 80, 90);
        student.calculateTotal(60, 80, 90, 100);
    }
}
