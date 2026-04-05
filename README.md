# Additional Java Exercises

Last modified: Sunday, 29 March 2026, 5:48 PM

---

## ข้อ 1: สัตว์ทะเล (Sea Animals)

### วัตถุประสงค์
เขียนโปรแกรมจำลองพฤติกรรมการเคลื่อนไหวของสัตว์ทะเล โดยใช้แนวคิด **Polymorphism**

### ขั้นตอน

#### 1. สร้าง abstract class `SeaAnimal`
- **Attribute**: `String name`
- **Constructor**: กำหนดชื่อสัตว์
- **Abstract method**:
  ```java
  public abstract void move();
  ```

#### 2. สร้างคลาสลูก 3 คลาส
- **Fish**: พิมพ์ `"Fish swims by moving its tail."`
- **Octopus**: พิมพ์ `"Octopus moves using jet propulsion."`
- **SeaTurtle**: พิมพ์ `"Sea turtle glides gracefully through water."`

#### 3. ในคลาส Main
- สร้าง array: `SeaAnimal[] animals = new SeaAnimal[3];`
- ใส่ object ของ Fish, Octopus, และ SeaTurtle ลงใน array
- ใช้ for-loop เพื่อเรียก `move()` กับสัตว์แต่ละตัว

### Output ที่คาดหวัง
```
Fish swims by moving its tail.
Octopus moves using jet propulsion.
Sea turtle glides gracefully through water.
```

---

## ข้อ 2: ตรวจสอบอุณหภูมิ (Temperature Check)

### วัตถุประสงค์
เขียนคลาสที่มีการตรวจสอบข้อมูล (validation) และการโยน/จัดการ **Exception**

### ขั้นตอน

#### 1. เขียนคลาส `Thermometer`
**เมธอด**: `public void checkTemperature(double celsius)`
- ถ้าอุณหภูมิ < 0 หรือ > 50:
  ```java
  throw new IllegalArgumentException("Temperature out of safe range: " + celsius);
  ```
- ถ้าอยู่ในช่วง:
  ```java
  System.out.println("Temperature is OK: " + celsius);
  ```

#### 2. ในคลาส Main
- ใช้ array เช่น: `double[] temperatures = {-5, 25, 55};`
- ใช้ for-loop และ try-catch ทดสอบทุกค่า

### Sample Output
```
Error: Temperature out of safe range: -5.0
Temperature is OK: 25.0
Error: Temperature out of safe range: 55.0
```

---

## ข้อ 3: ส่งพัสดุ (Parcel Delivery)

### วัตถุประสงค์
เขียนโปรแกรมคำนวณค่าส่งพัสดุตามประเภทบริการและน้ำหนัก โดยใช้ **Polymorphism** และ **Exception**

### ขั้นตอน

#### 1. สร้าง interface `Billable`
```java
public interface Billable {
    double calculateBill();
}
```

#### 2. เขียน abstract class `ParcelService`
**Attributes**:
- `String serviceName`
- `double weightInKg`

**Constructor**:
- ตรวจสอบว่า `weight > 0` หากไม่ให้ throw:
  ```java
  throw new IllegalArgumentException("Invalid weight: " + weightInKg);
  ```

**Abstract method**:
```java
public abstract double getRatePerKg();
```

#### 3. คลาสที่ extends ParcelService และ implements Billable
- **EMSService**: ค่าส่ง 50 บาท/กก.
- **FlashService**: ค่าส่ง 35 บาท/กก.

**เมธอด** `calculateBill()`:
```java
return weightInKg * getRatePerKg();
```

#### 4. Main class
- สร้าง array แบบ `Billable[]`
- ใส่ object EMSService, FlashService
- ใช้ loop เรียก `calculateBill()`
- ใช้ try-catch จัดการ exception เมื่อน้ำหนักติดลบ

### ตัวอย่าง Output
```
EMSService: 2.0 kg → 100.0 Baht
FlashService: 2.0 kg → 70.0 Baht
Error: Invalid weight: -3.0
```

### Hint
- การสร้าง abstract class และ interface
- การใช้ implements และ override
- การใช้ polymorphism (Billable เป็น reference)
- การโยนและจัดการ IllegalArgumentException

---

## ข้อ 4: ระบบซื้อตั๋วรถไฟ (Train Ticket System)

### วัตถุประสงค์
เขียนโปรแกรมจำลองระบบขายตั๋วรถไฟ โดยใช้ราคาต่างกันตามประเภทตั๋ว และรองรับการตรวจสอบข้อมูลโดยใช้ **Exception**

### ขั้นตอน

#### 1. เขียน abstract class `TrainTicket`
**Attributes**:
- `String passengerName`
- `double baseFare`

**Constructor**:
- ตรวจสอบว่า `baseFare > 0` หากไม่:
  ```java
  throw new IllegalArgumentException("Invalid base fare: " + baseFare);
  ```

**Abstract method**:
```java
public abstract double getFinalPrice();
```

#### 2. คลาสที่ extends TrainTicket (2 คลาส)
**RegularTicket**: คิดราคาเต็ม (ไม่มีส่วนลด)
```java
return baseFare;
```

**StudentTicket**: ได้รับส่วนลด 20%
```java
return baseFare * 0.8;
```

#### 3. เขียนคลาส Main
- สร้าง array แบบ `TrainTicket[]`
- ใส่ object ของ RegularTicket, StudentTicket, และตั๋วที่ราคาติดลบ (เพื่อทดสอบ exception)
- ใช้ loop แสดงชื่อผู้โดยสารและราคาตั๋วจริง
- ใช้ try-catch จัดการ IllegalArgumentException

### ตัวอย่าง Output
```
Passenger: Alice → 100.0 Baht
Passenger: Bob → 80.0 Baht
Error: Invalid base fare: -120.0
```

### Hint
- การใช้ abstract class และ override method
- การตรวจสอบข้อมูลและโยน exception
- การใช้ polymorphism กับ array ของ object
- การจัดการข้อผิดพลาดด้วย try-catch

---

## หัวข้อที่ครอบคลุม

- ✅ Polymorphism
- ✅ Abstract Classes
- ✅ Interfaces
- ✅ Exception Handling
- ✅ Inheritance
- ✅ Method Overriding

