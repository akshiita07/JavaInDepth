package Day11;

public class StringsCtd {
    public static void main(String[] args) {
        String s="Hello Akshita!";

        System.out.println("s: "+s);
        System.out.println("s.replace(\"a\",\"s\"): "+s.replace("a","s"));
        System.out.println("\ns.replaceAll(\"a\",\"s\"): "+s.replaceAll("a","s"));

        System.out.println("s.replace(\".\",\"X\"): "+s.replace(".","X"));
        System.out.println("\nUses regex: s.replaceAll(\".\",\"X\"): "+s.replaceAll(".","X"));

        String[] sArr=s.split("a");
        System.out.println("\ns.split(\"a\") ");
        for(int i=0;i<sArr.length;i++){
            System.out.print(sArr[i]+" ");
        }

        String joinedString=String.join("!",sArr);
        System.out.println("\njoinedString: "+joinedString);

        String joinedString2=String.join("a",sArr);
        System.out.println("\njoinedString2: "+joinedString2);

        String[] sArr2=s.split("k");
        String joinedString3=String.join(",",sArr2);
        System.out.println("\njoinedString3: "+joinedString3);
    }
}
