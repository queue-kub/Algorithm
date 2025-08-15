public class VariableExample {
    public static void main(String[] args) {
        // 1.1 ตัวแปรที่ใช้เก็บค่าของขนาดเสื้อผ้า ซึ่งมีขนาดเป็น s, m หรือ 'l'
        char clothingSize = 's'; // สามารถเป็น 's', 'm', หรือ 'l'

        // 1.2 ตัวแปรที่ใช้เก็บค่าของจำนวนคนที่เข้ามาชมเว็บไซต์
        int websiteVisitors = 0; // จำนวนคนที่เข้าชมเว็บไวต์

        // 1.3 ตัวแปรที่ใช้เก็บเกรดของนักศึกษา (A, B, C, D, E)
        char studentGrade = 'A'; // สามารถเป็น 'A', 'B', 'C', 'D', หรือ 'E'

        // 1.4 ตัวแปรที่ใช้เก็บเกรดเฉลี่ยของนักศึกษา
        double studentGPA = 4.0; // ค่าเกรดเฉลี่ยของนักศึกษา

        // 1.5 ตัวแปรที่ใช้เก็บค่าของ π (Pi - ค่าที่ใช้ในการหาเส้นรอบวงและพื้นที่วงกลม
        final double PI = 3.14159; // ค่าของ Pi ควรเป็นค่าคงที่

        // 1.6 ตัวแปรที่ใช้เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExpenses = 15000.00f; // ค่าใช้จ่ายรายปีของนักศึกษา

        // 1.7 คัวแปรที่ใช้เก็บค่าจำนวนของเดือนที่มีในหนึ่งปี
        final int MONTHS_IN_YEAR = 12; // จำนวนเดือนในหนึ่งปี ควรเป็นค่าคงที่

        // ตัวอย่างการแสดงผลค่าตัวแปร
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Clothing Size: " + websiteVisitors);
        System.out.println("Clothing Size: " + studentGrade);
        System.out.println("Clothing Size: " + studentGPA);
        System.out.println("Clothing Size: " + PI);
        System.out.println("Clothing Size: " + annualExpenses);
        System.out.println("Clothing Size: " + MONTHS_IN_YEAR);

    }
}