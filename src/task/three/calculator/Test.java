package task.three.calculator;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/12 18:25
 * @注释
 */
public class Test {
    public static void main(String[] args) {
        int a = 10, b = 5;
        UseCompute useCompute = new UseCompute();
        Compute add = new Add();
        useCompute.useCom(add, a, b);
        Compute subtract = new Subtract();
        useCompute.useCom(subtract, a, b);
        Compute multiply = new Multiply();
        useCompute.useCom(multiply, a, b);
        Compute divide = new Divide();
        useCompute.useCom(divide, a ,b);
    }
}
