package day3;

public interface Aaibaar {
    void aai();
    default void ontvangAai(String s) {
        System.out.println("<3");
    }
}
