public class App1 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9};
        Calculator calculator = new Calculator();

        if(calculator.checkIfElementExistInArray(tab, 5)) {
            System.out.println("Liczba jest w tablicy !!");
        } else {
            System.out.println("Liczby nie ma w tablicy !!");
        }

        int[] tab1 = {1,2,3};
        int[] tab2 = {5,6,7};
        int[] tab3 = {9,10,11};

        if(calculator.checkIfElementExistInArrays(tab1, tab2, 10)) {
            System.out.println("Znaleziono liczbę w jednej z trzech tablic !!");
        } else {
            System.out.println("Nie znaleziono liczby w jednej z trzech tablic !!");
        }

        System.out.println(calculator.factorial(101));
    }
}
