package speedmaster.silver;

class S2_3_Variable_Scope {
    public static void main(String[] args) {
        int i1=Integer.parseInt(args[0]);
        int i2;
        int i4;
        if (i1>0) {
            i2=10;
            int i3=20;
            i4=i3;
        } else {
            i2=0;
            int i3=0;
            i4=i3;
        }
        int i3=0;
        //i3 cannot be resolved to a variableJava(33554515)
        System.out.println(i2+i3);
        System.out.println(i4);
    }
}