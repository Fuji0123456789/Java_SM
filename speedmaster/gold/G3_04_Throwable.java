package speedmaster.gold;

import java.io.IOError;

public class G3_04_Throwable {
    public static void main(String[] args) {
        try {

        } catch (OutOfMemoryError erOM) {
            System.out.println(erOM.toString());
        } catch (VirtualMachineError erVM) {
            System.out.println(erVM.toString());
        } catch (IOError erIO) {
            System.out.println(erIO.toString());
        } catch (Error er) {
            System.out.println(er.toString());
        } catch (NullPointerException exNP) {
            System.out.println(exNP.toString());
        } catch (ArithmeticException exA) {
            System.out.println(exA.toString());
        } catch (ArrayIndexOutOfBoundsException exAIOB) {
            System.out.println(exAIOB.toString());
        } catch (RuntimeException exR) {
            System.out.println(exR.toString());
        /*
        } catch (ClassNotFoundException exCNF) {
            System.out.println(exCNF.toString());
        */
        /*
        } catch (FileNotFoundException exFNF) {
            System.out.println(exFNF.toString());
        */
        /*
        } catch (IOException exIO) {
            System.out.println(exIO.toString());
        */
        /*
        } catch (SQLException exSQL) {
            System.out.println(exSQL.toString());
        */
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
