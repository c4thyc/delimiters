public class Main {
    public static void main (String[] args) {
        Delimiters a = new Delimiters("(", ")");
        String[] tokens1 = {
            "(", "x + y", ")", " * 5"
        };
        System.out.println(a.getDelimitersList(tokens1));
        Delimiters b = new Delimiters("<q>", "</q>");
        String[] tokens2 = {
           "<q>", "yy", "</q>", "zz", "</q>"
        };
        System.out.println(b.getDelimitersList(tokens2));

        Delimiters c = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {
            "<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"
        };
        System.out.println(c.isBalanced(c.getDelimitersList(tokens3)));

        String[] tokens4 = {
            "<sup>", "</sup>", "</sup>", "<sup>"
        };
        System.out.println(c.isBalanced(c.getDelimitersList(tokens4)));

        String[] tokens5 = {
            "</sup>"
        };
        System.out.println(c.isBalanced(c.getDelimitersList(tokens5)));

        String[] tokens6 = {
            "<sup>", "<sup>", "</sup>"
        };
        System.out.println(c.isBalanced(c.getDelimitersList(tokens6)));
    }
}