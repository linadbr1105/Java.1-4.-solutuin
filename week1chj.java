Ch1

  1. JDK와 JRE의 차이점을 설명한 것중 틀린 것은 무엇입니까? 4
  1 JDK는 JRE와 컴파일러 등의 개발도구가 포함된다.
  2 자바 프로그램을 개발하려면 JDK가 반드시 필요하다.
  3 자바 프로그램을 실행만 하려면 JRE를 설치해도 상관없다.
  4 JRE에는 컴파일러(javac.exe)가 포함되어있다. 
   >>컴파일러는 개발도구이기 떄문에 JDK를 다운받아야 포함되어있다.

 2.JVM에 대한 설명으로 틀린 것은 무엇입니까? 3
  1 JVM은 java.exe 명령어에 의해 구동된다.
  2 JVM은 바이트 코드를 기계어로 변환시키고 실행한다.
  3 JVM은 운영체제에 독립적이다(운영체제별로 동일한 JVM이 사용된다.)
  4 바이트코드는 JVM에 독립적이지만, JVM은 운영체제에 종속적이다.
   >>JVM은 운영체제에 종속적이라서 Mac이면 Mac용 JVM을, Window면 Window용 JVM을 다운받아야 한다.

 3.자바 프로그램 개발 과정을 순서대로 나열하세요. 3124
  1 javac.exe로 바이트코드 파일(~.class)을 생성한다. 
  2 java.exe로 JVM을 구동시킨다. 
  3 자바 소스파일(~.java)을 작성한다. 
  4 JVM은 main()메소드를 찾아 메소드 블록을 싱행시킨다.

 4.자바 소스파일을 작성할 때 틀린 것은 무엇입니까? 4
  1 자바 소스 파일명과 클래스 이름은 대소문자가 동일해야 한다. 
  2 클래스 블록과 메소드 블록은 반드시 중괄호{}로 감싸야 한다. 
  3 실행문 뒤에는 반드시 세미콜론(;)을 붙여야 한다. 
  4 주석은 문자열 안에서도 작성할 수 있다. 
   >>예를 들어  System.out.println("Hello, welcome to the java world!"); 에서
    ()안의 내용 중에 주석을 넣어도 주석으로 인식 못한다.

 5.자바 주석문의 종류가 아닌 것은 무엇입니까? 4
  1 // : 행 주석
  2 /*~*/ : 범위 주석
  3 /**~*/ : API 도큐먼트 주석
  4 <!--~--> : 범위주석
   >> <!--~-->는 html 등에서 사용 가능한 범위주석이고 java에서는 해당되지 않는다.

 6.이클립스에 대한 설명으로 틀린 것은 무엇입니까?4
  1 이클립스는 JDK(JRE)를 설치해야만 실행할 수 있다. 
  2 이클립스에서 소스파일을 저장하면 자동 컴파일되어 바이트코드 파일이 생성된다. 
  3 워크스페이스는 프로젝트들이 생성되는 기본 디렉토리를 말한다. 
  4 .metadata는 프로젝트의 소스파일들이 저장되는 디렉토리이다. 

-------------------------------------------------------------------------------------------------------------
Ch2


1. 자바에서 변수에 대한 설명 중 틀린것은 무엇입니까? 4
1 변수는 하나의 값만 저장할 수 있다.
2 변수는 선언시에 사용한 타입의 값만 저장할 수 있다. 
3 변수는 변수가 선언된 중괄효 안에서만 사용 가능하다. 
4 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다. 
 //변수는 초기값이 저장되어야만 읽을 수 있다.

2.변수 이름으로 사용 가능한 것을 모두 고르시오. 1,4,5
1 modeName
2 class //예약어이므로 사용 불가하다. 
3 6hour //숫자로 시작하므로 사용 불가하다. 
4 $value
5 _age
6 int //예약어이므로 사용 불가하다. 

3. 자동 타입변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?3
byte byteValue = 10;
char charValue = 'A';

1 int intValue = byteValue;
2 int intValue = charValue;
3 short shortValue = charValue;
 //char타입은 약 65000까지 저장 가능하지만, short타입은 그렇게 큰 수를 저장할 수 없다. 
4 double doubleValue = byteValue;

6.강제 타입변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?4
int intValue = 10;
char charValue = 'A';
double doubleValue = 5.7;
String strValue = "A";

1 double var = (double) intValue;
2 byte var = (byte) intValue;
3 int var = (int) doubleValue;
4 char var = (char) strValue;
//문자열은 char타입으로 변환할 수 없다.

7.변수를 잘못 초기화한 것은 무엇입니까?3
1 int var1 = 10;
2 long var2 = 100000000L;
3 char var3 = ''
//char타입은 빈 값을 값으로 가지지 못한다.
4 double var4 = 10;
5 float var5 = 10;

8.연산식에서의 타입변환 내용이다. 컴파일 에러가 생기는 것은 무엇입니까? 1
byte byteValue = 10;
float floatValue = 2.5F;
double doubleValue = 2.5;

1 byte result = byteValue+byteValue;
//연산을 하면 byte타입도 int로 저장되므로 byte로 받을 수 없다.
2 int result = 5 + byteValue;
3 float result = 5 + floatValue;
4 double result = 5 doubleValue;

-------------------------------------------------------------------------------------------------------------
Ch3


1.연산자와 연산식에 대한 설명 중 틀린것은 무엇입니까? 3
1 연산자는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분된다.
2 비교 연산자와 논리 연산자의 산출타입은 boolean(true/false)이다.
3 연산식은 하나 이상의 값을 산출할 수도 있다.
//연산식은 하나의 값만 산출할 수 있다.
4 하나의 값이 올 수 있는 자리라면 연산식도 올 수 있다. 
//()+2 에서 ()안에 얼마든지 3%2와 같은 연산식이 올 수 있다. 

2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까?31
public class Exercise02{
  public static void main(String[] args){
    int x = 10;
    int y = 20;
    int z = (++x)+(y--);
    System.out.print(z);
  }
}

3. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? A
public class Exercise03{
  public static void main(String[] args){
    int score = 85;
    String result = (!(score>90))?"A":"B";
    System.out.println(result);
  }
}

4. 다음은 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 떄 학생당 몇개를 가질 수 있고,
최종적으로 몇 개가 남는지를 구하는 코드입니다 빈곳에 알맞은 코드를 작성하세요. 
 public class Exercise04{
   public static void main(String[] args){
     int pencils = 534;
     int students = 30;

     //학생 한 명이 가지는 연필 수
     int pencilsPerStudent = (pencils/students);
     System.out.println(pencilsPerStudent);

     //남은 연필 수
     int pencilsLeft = (pencils%students);
     System.out.println(pencilsLeft);
   }
 }

5. 다음은 백의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록
빈곳에 알맞은 코드를 작성하세요(산술 연산자만 사용하세요.)
 public class Exercise05{
   public static void main(String[] args){
     int value = 356;
     System.out.println(value/100*100)
   }
 }

6. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수자리수가 나올 수 있도록 빈곳에 알맞은 코드를 작성하세요.
public class Exercise06{
 public static void main(String[] args){
   int lengthTop = 5;
   int lengthBottom = 10;
   int height = 7;
   double area = ((lengthTop+lengthBottom)*height/2.0);
   System.out.println(area)
   }
 }

7.다음 코드는 비교 연산자와 논리 연산자의 복합연산식입니다. 연산식의 출력 결과를 괄호속에 넣으세요.
 public class Exercise07{
   public static void main(String[] args){
    int x = 10;
    int y = 5;

    System.out.println((x>7)&&(y<=5));
    //true
    System.out.println((x%3 == 2)||(y%2 != 1));
    //false 
     }
   }

8. 다음은 %연산을 수행한 결과값에 10을 더하는 코드입니다. NaN값을 검사해서 올바른 결과가 출력될 수 있도록
빈곳에 들어갈 NaN을 검사하는 코드를 작성하세요. 
 public class Exercise08{
   public static void main(String[] args){
   double x = 5.0;
   double y = 0.0;
   
   double z = x % y;

   if (Double.isNaN(z)){
     System.out.println("0.0으로 나눌 수 없습니다.");
   } else {
     double result = z + 10;
     System.out.println("결과:"+result);
   }
     }
   }

-------------------------------------------------------------------------------------------------------------
Ch4


1. 조건문과 반복문의 종류를 ()속에 넣어보세요
조건문 : if, switch
반복문 : while, for, do-while

2.조건문과 반복문을 설명한 것 중 틀린것은 무엇입니까? 2
1 if문은 조건식의 결과에 따라 실행으로 흐름을 달리할 수 있다.
2 switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
//double은 될 수 없다. 정수, String변수만 가능하다. 
3 for문은 카운터 변수로 지정한 횟수 만큼 반복시킬 때 사용할 수 있다.
4 break문은 switch문, for문, while문을 종료할 떄 사용할 수 있다. 

3.for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요. 
public class Exercise03 {
  public static void main(String[] args){
    int sum = 0;

    for(int i=1; i<=100; i++){
      if(i%3==0){
        sum +=i;
      }
    }
    System.out.println("3의 배수의 합:"+sum);
  }
}

4.while문과 Math.random()메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2)형태로 출력하고,
 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5면 실행을 멈추는 콛를 작성해 보세요. 눈의 합이 5가 되는 조합은
 (1,4)(4,1)(2,3)(3,2)입니다.

  public class Exercise04 {
    public static void main(String[] args){
     int num1 = (int)(Math.random()*6)+1;
     int num2 = (int)(Math.random()*6)+1;
     System.out.println("("+num1+ "," + num2 + ")");

     if((num1+num2)==5){
       break;
     }
    }
  }

5.중첩 for문을 이용해서 방정식 4x +5y = 60의 모든 해를 구해서 (x,y)형태로 출력해보세요. 단 x와 y는 10이하의 자연수 입니다.
public class Exercise05 {
  public statis void main(String[] args){
    for(int x = 1; x<=10; x++){
      for(int y=1; y<=10; y++){
        if((4*x + 5*y)==60){
          System.out.println("("+ x +"," + y + ")");
        }
      }
    }
  }
}

6. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
 *
 **
 ***
 ****
 *****
   public class Exercise06 {
     public static void mian(String[] args){
       for (int i=1; i<=5; i++;){
         for(int j=1; j<=i; j++){
           System.out.println("*");
           if(i==j){
             System.out.println();
           }
         }
       }
     }
   }

7. while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하시오.

   import java.util.Scanner;

   public class Exercise07 {
     public static void mian(String[] args){
       boolean run  = true;
       int balance = 0;
       Scanner scanner = new Scanner(System.in);

       while(run) {
         System.out.println("------------------------------");
         System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
         System.out.println("------------------------------");
         System.out.print("선택> ");

         int menuNum = scanner.nextInt();

         switch(menuNum){
           case1 :
             System.out.print("예금액> ");
             balance += scanner.nextInt();
             break;
           case2 :
             System.out.print("출금액> ");
             balance -= scanner.nextInt();
             break;
           case3 : 
             System.out.print("잔고"> ");
             System.out.print(balance);
             break;
           case4 :
             run = false;
             break;
         }
         System.out.println();
       }
       System.out.printLn("프로그램 종료");
     }
   }



. 