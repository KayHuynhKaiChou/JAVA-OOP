/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GarbageTruckLab4;

/**
 *
 * @author DELL
 */
public interface GarbageInform {
    public static final int MAX_LOAD = 10000;
    public static final int AVG_LOAD_TIME = 8;
    public static final int AVG_TRIP_LOAD = 30;
    public static final int SALARY_HOUR = 120000;
    public static final int AVG_FEE = 57000;


    
    /*
    1. Xe tải có thể chứa tối đa 10 tấn rác.
    2. Xe tải lần lượt đến từng trạm trung chuyển rác trên tuyến đường theo thứ tự và thu rác. Khi không đủ khả năng lấy hết rác tại 1 trạm thì nó đưa rác đến bãi đổ và quay lại để tải rác lên xe.
    3. Thời gian để tải rác lên xe tại 1 điểm trung bình là 8 phút.
    4. Thời gian đi và về bãi đổ rác trung bình là 30 phút, 
    5. Chi phí nhân công và vận tải tính theo giờ là 120000đ/h
    6. Chi phí phải trả cho bãi đổ rác là 57000đ/xe
    Viết chương trình để ước tính chi phí phục vụ cho việc đấu thầu thu gom rác.

    */
}
