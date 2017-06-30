/**
 * Created by kuwu on 2017/06/29.
 */

public class StarTree {

    public static void main(String[] args) {

       //getStar();
       System.out.println(getStar());


    }

    public static StringBuffer getStar(){

        //StringBuilder star = new StringBuilder();
        StringBuffer star = new StringBuffer();

        for (int i = 0; i < 10; i++)
        {
            for (int j = 10; j > i; j--)
            {
                //System.out.print(" ");
                star.append(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                //System.out.print(" *");
                star.append(" *");
            }
            //System.out.print("\n");
            star.append("\n");

        }
        //return getStar();
        return star;
    }


}
