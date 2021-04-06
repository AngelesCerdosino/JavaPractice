public class SortUtil {
    public static <T> void sort(Precedable<T> arr[]) {
        Precedable<T> p;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                int resultado = arr[j].precedeA((T) arr[j + 1]);
                if(resultado > 0){
                    p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }
    }
}
