package Lab6;

import jdk.nashorn.internal.parser.Token;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("การทำงาน (Work) หมายถึง กิจกรรมที่บุคลากรใดบุคลากรหนึ่งกระทำขึ้นด้วยกำลังกายและกำลังใจ " +
                "เพื่อจุดมุ่งหมายหนึ่งที่ตนต้องการ เช่น เพื่อการดำรงชีวิต  เพื่อความสบายใจ หรือเพื่อช่วยส่งเสริมสังคม เป็นต้น");
        StringTokenizer strToken = new StringTokenizer(str.toString ());
        int countWord = strToken.countTokens();
        System.out.println("Word count:"+ countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());

        }


    }

}
