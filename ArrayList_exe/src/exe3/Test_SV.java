
package exe3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Viết chương trình quản lý sinh viên. 
Mỗi đối tượng sinh viên có các thuộc tính sau: id, name, age, address và gpa (điểm trung bình).
Yêu cầu: tạo ra một menu với các chức năng sau: 

/*
1. Add student.
2. Edit student by id.
3. Delete student by id.
4. Sort student by gpa.
5. Sort student by name.
6. Show student.

7. Lưu thông tin sv vào file student.txt

8. Đọc thông tin sv từ file student.txt và hiển thị ra màn hình
0. Exit.
 */
public class Test_SV {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<>();
        arr.add("--------MANAGE STUDENT---------");
        arr.add("1. Add student.");
        arr.add("2. Edit student by id.");
        arr.add("3. Delete student by id.");
        arr.add("4. Sort student by gpa.");
        arr.add("5. Sort student by name.");
        arr.add("6. Show student.");
        arr.add("7. Save information student in file student.txt");
        arr.add("8. Read inform student from file student.txt and show on the monitor.");
        arr.add("0. Exit");
        Menu me = new Menu(arr);
        try {
            me.execute();
            
        } catch (IOException ex) {
            Logger.getLogger(Test_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
