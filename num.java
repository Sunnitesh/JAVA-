class Num {
    int number;
    Num(int number) {this.number = number;}
    void shownum() {System.out.println("Number: " + number);}
}
class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }
    @Override
    void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
    public static void main(String[] args) {
        Num num = new Num(42);
        num.shownum();
        HexNum hexNum = new HexNum(42);
        hexNum.shownum();
    }
}

