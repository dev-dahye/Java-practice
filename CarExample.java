class Car{
    //필드
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;

}

public class CarExample{
    public static void main(String[] args){
        //객체 생성
        Car myCar = new Car();

        //필드값 읽기
        System.out.println( "제작회사: \t" + myCar.company );
        System.out.println( "모델명: \t" + myCar.model );
        System.out.println( "색깔: \t\t" + myCar.color );
        System.out.println( "최고속도: \t" + myCar.maxSpeed );
        System.out.println( "현재속도: \t" + myCar.speed );

        //필드값 변경
        myCar.speed = 60;
        System.out.println( "수정된 속도: \t" + myCar.speed );
    }
}