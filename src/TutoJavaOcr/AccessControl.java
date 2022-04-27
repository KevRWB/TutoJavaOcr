package TutoJavaOcr;

public class AccessControl {
    public static void main(String[] args) {
        System.out.println(Exemple.text);           // Ok --> text est public
        System.out.println(Exemple.txtPrivate);    // ERR -->  txtPrivate est private
        System.out.println(Exemple.protectedTxt);  //Ok --> protected = accessible class, package et sous classes
    }
}

class Exemple {
    public static String text = "Hello";
    private static String txtPrivate;
    protected static String protectedTxt;
                                            //Si aucun mot clé --> package-protected = visible pas package

}
