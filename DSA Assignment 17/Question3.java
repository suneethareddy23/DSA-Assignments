package in.ineuron.main;
public class Question3{
    public static int countStudents(int[] students, int[] sandwiches) {
        int unableToEat = 0;
        int studentIndex = 0;
        int sandwichIndex = 0;
        int remainingSandwiches = sandwiches.length;
        
        while (studentIndex < students.length && unableToEat < remainingSandwiches) {
            if (students[studentIndex] == sandwiches[sandwichIndex]) {
                studentIndex++;
                sandwichIndex++;
                remainingSandwiches--;
            } else {
                studentIndex++;
                unableToEat++;
            }
            
            // Reset sandwichIndex to 0 if it reaches the end of the stack
            if (sandwichIndex == sandwiches.length) {
                sandwichIndex = 0;
            }
        }
        
        return unableToEat;
    }
    
    public static void main(String[] args) {
        int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println(countStudents(students1, sandwiches1));  // Output: 0
        
        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students2, sandwiches2));  // Output: 3
    }
}