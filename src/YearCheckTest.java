public class YearCheckTest {
    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();
        System.out.println(bissextile(2012));
        System.out.println(bissextile(2100));
        System.out.println(bissextile(2400));
    }

    static String bissextile(int year){
        YearCheck yearCheck = new YearCheck();
        if (yearCheck.isLeap(year)) {
            return "Rok " + year + " jest przestępny";
        }else{
            return "Rok " + year + " nie jest przestępny";
        }
    }
}
