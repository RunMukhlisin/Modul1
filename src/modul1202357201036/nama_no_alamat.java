package modul1202357201036;

public class nama_no_alamat {

    public static void main(String[] args) {

        String data[][] = {
            {"NAMA", "\t\tALAMAT", "\t\tNO.HP"},
            {"\nABDUL", "\t\tKediri", "\t\t08564666899"},
            {"KUSNO", "\t\tTrenggalek", "\t08564666999"},
            {"PONIRAN", "\tBojonegoro", "\t085646669992"}
        };
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println("");
        }
    }
}
