import java.util.Arrays;

public class Exquiz {
    public static void main(String[] args){
//        int s = 88;
//         char grade;
//        if(s >= 90 && s<=100){
//            System.out.println("grade는"+'A'+"학점입니다");
//        } else if(s >= 80 && s<=89){
//            System.out.println("grade"+'B'+"학점입니다");
//        } else {
//            System.out.println("잘못된 입력입니다");
//        }
//        int i =3;
//        if(i<=5) System.out.println("1번");
//        else if(i<=4) System.out.println("2번");
//        else if(i<=3) System.out.println("3번");
//        else if(i<=2) System.out.println("4번");
//        else System.out.println("5번");
//        int i =1;
//        String str;
//        switch(i) {
//            case 1 : str = "1";
//            case 2 : str = "2";
//            case 3 : str = "3";
//            case 4 : str = "4";
//            case 5 : str = "5";
//            default : str = "6";
//        }
//        System.out.println(str);
//        int i =3;
//        String str= "";
//        switch(i) {
//            case [ ? ] : str += "고길동 "; break;
//            case [ ? ] : str += "도우넛 "; break;
//            case [ ? ] : str += "둘리 "; break;
//            case [ ? ] : str += "박희동 "; break;
//            case [ ? ] : str += "또치 "; break;
//            default : str += "마이콜 "; break;
//        }
//        System.out.println(str);

//        int i =3;
//        if(i<=5) System.out.println("1번");
//        else if(i<=4) System.out.println("2번");
//        else if(i<=3) System.out.println("3번");
//        else if(i<=2) System.out.println("4번");
//        else System.out.println("5번");
//        int i =3;
//        if(i<=5) System.out.println("1번");
//        if(i<=4) System.out.println("2번");
//        if(i<=3) System.out.println("3번");
//        if(i<=2) System.out.println("4번");
//        else System.out.println("5번");
//        String i ="A";
//        String str;
//        switch(i) {
//            case "A" :
//                str = "1";
//                System.out.println(str);
//            case "B" :
//                str = "2";
//                System.out.println(str);
//                break;
//            case "C" :
//                str = "3";
//                System.out.println(str);
//            case "D" :
//                str = "4";
//                System.out.println(str);
//            case "E" :
//                str = "5";
//                System.out.println(str);
//            default :
//                str = "6";
//                System.out.println(str);
//        }
//        int i =3;
//        String str= "";
//        switch(i-1) {
//            case  5  : str += "고길동 ";
//            case  4  : str += "도우넛 ";
//            case  3  : str += "둘리 ";
//            case  2  : str += "박희동 ";
//            case  1  : str += "또치 ";
//            default : str += "마이콜 ";
//        }
//        System.out.println(str);
        /*
         * 서울시 02
         * 경기도 031 -과천시 -고양시 -안산시 -안양시
         * 인천시 032
         * 강원도 033
         * 경상남도 055 -진주시 -통영시 -사천시 -김해시 -양산시
         */

//        String area ="고양시";
//        int chk = 0;
//        String area_number;
//
//        switch(area) {
//            case "서울시" : area_number = "02";break;
//            case "과천시" : case "고양시" : case "안산시" : case "안양시" : area_number ="031";break;
//            case "인천시" : area_number = "032";break;
//            case "진주시" : case "통영시" : case "사천시" : case "김해시" : case "양산시" : area_number ="055";break;
//            default : chk = 1; area_number = "찾으시는 국번이 확인되지 않습니다.";break;
//        }
//        if(chk == 0) System.out.println(area + "의 국번은 " + area_number + "번 입니다.");
//        else System.out.println(area_number);
//        int year = 2024;
//
//        System.out.println(year + "년도의 월별 일자 수 출력\n");
//        for(int m = 1 ; m <= 12 ; m++){
//
//            switch(m){
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                    System.out.println(m + "월: 31일"); break;
//                case 4: case 6: case 9: case 11:
//                    System.out.println(m + "월: 30일"); break;
//                default :
//                    if( year % 4 == 0 ) System.out.println(m + "월: 29일");
//                    else System.out.println(m + "월: 28일");
//            }
//
//        }


        //----------------------------------------------------------------------
//        int year = 2024;
//        System.out.println(year + "년도의 월별 일자 수 출력");
//        for (int m = 1; m<= 12; m++){
//            int days;
//            if(){

//        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
//
//        int max = score[0];
//        int min = score[0];
//
//        for (int i = 1; i < score.length; i++) {
//            if ( score[i] > max )
//                max = score[i];
//
//            if ( score[i] < min )
//                min = score[i];
//        }
//
//        System.out.println( "최대값 : " + max );
//        System.out.println( "최소값 : " + min );

        //----------------------------------------------------------------------
//        int[] array = new int[] { 3, 4, 5, 6, 7 };
//
////for :문
//        for (int k : array) {
//            System.out.print(k+" ");
//        }
//        System.out.println();
//
//// Arrays 이용
//        System.out.println(Arrays.toString(array));
 //----------------------------------------------------------------------
 //이차원 배열
//        int[][] a = new int[2][3];
//
//        a[0][0] = 0;
//        a[0][1] = 1;
//        a[0][2] = 2;
//        a[1][0] = 3;
//        a[1][1] = 4;
//        a[1][2] = 5;
//
//        for(int i = 0 ; i < a.length; i++) {
//            for(int j = 0; j < a[i].length ; j++) {
//                if(j== a[i].length-1) System.out.println(a[i][j]);
//                else System.out.print(a[i][j] + " ");
//            }
//        }
//---------------------선언 및 행공간할당
//        int[][] a = new int[2][];
//
//        a[0] = new int[2];
//        a[1] = new int[3];
//
//        for(int i = 0 ; i < a.length; i++) {
//            for(int j = 0; j < a[i].length ; j++) {
//                a[i][j] = i+j;
//                if(j== a[i].length-1) System.out.println(a[i][j]);
//                else System.out.print(a[i][j] + " ");
//            }
//        }

        //-----------------단축형식시작------------------------------------
//        int[][] a = { { 0, 1 },{ 2, 3, 4 } };
//
//        for(int i = 0 ; i < a.length; i++) {
//            for(int j = 0; j < a[i].length ; j++) {
//                if(j== a[i].length-1) System.out.println(a[i][j]);
//                else System.out.print(a[i][j] + " ");
//
//           }}
        //----------배열의요소값이 객체인경우-----------
//        String str = "다람쥐";
//        System.out.println("문자열 길이: " + str.length());
//
//
//        String[] sarr = {"하늘", "땅", "바다"};
//
//        for(int i = 0; i < sarr.length; i++) {
//            System.out.println(i+"번 방의 값은: " + sarr[i] + "입니다.");
//        }

        //-------------패키지와 메소드-----------------------------





    }
        }



