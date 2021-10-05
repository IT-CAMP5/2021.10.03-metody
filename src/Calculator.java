public class Calculator {

    Calculator() {
    }

    boolean checkIfElementExistInArray(int[] tab, int element) {
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] == element) {
                return true;
            }
        }
        return false;
    }

    boolean checkIfElementExistInArrays(int[] tab1, int[] tab2, int[] tab3, int element) {
        // działa pod warunkiem że tablice są tej samej wielkości
        for(int i = 0; i < tab1.length; i++) {
            if(tab1[i] == element || tab2[i] == element || tab3[i] == element) {
                return true;
            }
        }
        return false;
    }

    boolean checkIfElementExistInArrays(int[] tab1, int[] tab2, int element) {
        // działa pod warunkiem że tablice są tej samej wielkości
        for(int i = 0; i < tab1.length; i++) {
            if(tab1[i] == element || tab2[i] == element) {
                return true;
            }
        }
        return false;
    }

    int factorial(int a) {
        /*int iloczyn = 1;
        for(int i = 1; i <= a; i++) {
            iloczyn = iloczyn * i;
        }
        return iloczyn;*/

        if(a == 1) {
            return 1;
        }
        return a * factorial(a-1);
    }
}
