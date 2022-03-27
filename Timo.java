/**
 * Created by user on 27/03/22.
 */
public class Timo {


        public static void main(String[] args) {


        String []myname={"osama","sameer","noman"};
        String []newmyname=new String[myname.length];
        int counter=0;
        for(int i=myname.length-1;i>=0;i--)
        {
            newmyname[counter]=myname[i];
            counter++;
        }
        myname=newmyname;
        for(String name :newmyname)
            System.out.println(name);

    }


}
