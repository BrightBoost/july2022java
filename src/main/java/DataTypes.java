public class DataTypes {

    public static void main(String[] args) {
        // twee soorten: primitives en reference types
        // 8 soorten primitives
        int rondGetal = 3;
        long grootGetal = 12345678900L;
        float kleinKommaGetal = 2.5f;
        double grootKommaGetal = 34.23223323232323233;
        boolean trueOrFalse = true;
        char character = 'a';
        byte b = 100;
        short kleinRondgetal = 300;

        int max = (int)(Math.pow(2, 32)-1);

        Integer i = 3;
        max = i.MAX_VALUE;


        System.out.println(max);
        max = max + 1;
        System.out.println(max);

        System.out.println(character);

        RekenUtil rekenUtil = new RekenUtil();
        double doublePrim = 4.0;
        double result = rekenUtil.addTwoNumber(doublePrim, doublePrim);
        System.out.println(result);

        Double doubleWrap = 3.0;
        double result2 = rekenUtil.addTwoNumber(doubleWrap, doubleWrap);

        double result3 = rekenUtil.addTwoNumber(doublePrim, doubleWrap);
        // oneindig veel reference types
    }
}
