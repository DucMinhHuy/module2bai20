package baidoc2;

public class ToyBuilderTest {
    public void testBuildToyHouse(){
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }
    public void testBuildToyCar(){
        ToyCar toyCar=ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }
    public void testBuildToyPlane(){
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }

    public static void main(String[] args) {
        ToyBuilderTest n=new ToyBuilderTest();
        n.testBuildToyPlane();
        n.testBuildToyHouse();
        n.testBuildToyCar();
    }
}
