package Q3;

public class Main {
    public static void main(String[] args) {
        // 1. สร้าง array แบบ Billable[]
        Billable[] billables = new Billable[3];
        
        // 2. ใส่ object EMSService, FlashService พร้อมใช้ try-catch 
        // เราควรแยก try-catch การสร้าง Object ในแต่ละตัว เพื่อให้ Object ตัวอื่นยังสามารถถูกสร้างเข้าไปใน Array ได้แม้ตัวใดตัวหนึ่งจะ Error
        try {
            billables[0] = new EMSService(2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            billables[1] = new FlashService(2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // ตัวนี้จะเกิด Exception จาก Constructor ของ ParcelService
            billables[2] = new FlashService(-1); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught (Negative Weight): " + e.getMessage());
        }

        // 3. ใช้ loop เรียก calculateBill()
        for (Billable billable : billables) {
            try {
                // ต้องตรวจเช็ค null ด้วย เพราะตำแหน่งที่มี Exception (เช่น billables[2]) จะมีค่าเป็น null
                if (billable != null) {
                    String name = billable.getClass().getSimpleName();
                    System.out.println(name + " Total Bill: " + billable.calculateBill());
                }
            } catch (Exception e) {
                System.out.println("Error calculating bill: " + e.getMessage());
            }
        }
    }
}