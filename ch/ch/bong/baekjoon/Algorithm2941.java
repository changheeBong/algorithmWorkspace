package ch.ch.bong.baekjoon;


import java.util.Scanner;

public class Algorithm2941 {
    /*
    문제
    예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

    크로아티아 알파벳	변경
    č	c=
    ć	c-
    dž	dz=
    đ	d-
    lj	lj
    nj	nj
    š	s=
    ž	z=
    예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

    입력
    첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
    단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
    출력
    입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    예제 입력
    ljes=njak
    출력
    6

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("입력 : ");
//       String word = sc.next();
       String word = "dz=ak";

        // 크로아티아 비교 단어들을 arr배열에 담음
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        // 비교 단어들만큼 반복문을 돌리며 word에 포함되어있으면 그단어들을 !로 치환
        // 만약 알파벳으로 치환하거나 위의 단어들과 겹쳐지는 단어가 있으면 contains에 다시한번 겹칠 수 있기에
        // 비교 단어에 없는 !로 치환함
        for (String s : arr) {
            if (word.contains(s)) {
                word = word.replaceAll(s, "!");
            }
        }

        // 치환된 word의 길이
        int result = word.length();
        System.out.println(result);



    }


}
