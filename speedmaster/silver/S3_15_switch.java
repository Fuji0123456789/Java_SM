package speedmaster.silver;

class S3_15_switch {
    public static void main(String[] args) {
        String s="BBB";
        final String STR="BBB";
        switch (s) {
            case "AAA":
                System.out.println("AAA");
                break;
            case STR:
                System.out.println("BBB");
            /*
            default:
                break;
            */
        }
    }
}
/*
BBB
*/
//switch
