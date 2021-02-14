/**
 * En: Bubble sort algorithm
 * Es: Algoritmo de ordenamiento burbuja
 * @author Jose Guerrero
 */
public class BubbleSort {
    
    public static void main(String[] args) {
        String[]  names   = {"José", "Alex", "Raul", "María", "Kamila"};
        Integer[] numbers = {10, 15, 30, 20}; 
        
        Sort.order(names);
        for(String name: names) {
            System.out.println("name = " + name);
        }
        
        System.out.println("=================================================");
        
        Sort.order(numbers);
        for(Integer number: numbers) {
            System.out.println("number = " + number);
        }
    }
    
}

final class Sort {
    
    /**
     * En: Order iterable
     * Es: Ordenar iterable
     * @param iterable 
     */
    public static void order(Object[] iterable) {
        order(iterable, false);
    }
    
    /**
     * En: Reverse ordering
     * Es: Ordenamiento de forma inversa
     * @param iterable 
     */
    public static void inverse(Object[] iterable) {
        order(iterable, true);
    }
    
    /**
     * En: Sorting algorithm
     * Es: Algoritmo de ordenamiento
     * @param iterable
     * @param inverse 
     */
    private static void order(Object[] iterable, boolean inverse) {
        int amount  = iterable.length;
        for(int i = 0; i < (amount - 1); i++) {
            for(int j = 0; j < (amount - 1 -i); j++) {
                if (checkActionOrder(inverse, iterable, j)) {
                    Object aux      = iterable[j];
                    iterable[j]     = iterable[j + 1];
                    iterable[j + 1] = aux;
                }
            }
        }
    }
    
    /**
     * En: Check ordering action
     * Es: Comprobar acción ordenamiento
     * @param inverse
     * @param iterable
     * @param index
     * @return boolean 
     */
    private static boolean checkActionOrder(boolean inverse, Object[] iterable, int index) {
        return !inverse && ((Comparable) iterable[index + 1]).compareTo(iterable[index]) < 0 ||
                inverse && ((Comparable) iterable[index + 1]).compareTo(iterable[index]) > 0;
    }
    
}
