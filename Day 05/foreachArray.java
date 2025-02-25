public class foreachArray {

    public static void main(String[] args){
        int [] marks = {98, 98, 67, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        String [] students = {"Usmin", "Hello", "Ram", "Shyam"};
        System.out.println(students[0]);

        // for(int i= 0; i< students.length ; i++){
        //     System.out.println(students[i]);
        // }


        for(String i : students){
            System.out.println(i);
        }

    }
}