import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        tieuChuan();
    }

    public static void tieuChuan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Giới Tính của bạn");
        String gioiTinh;
        gioiTinh = sc.nextLine();
        int doTuoi, chieuCao;
        System.out.println("Nhập độ tuổi của bạn ");
        doTuoi = sc.nextInt();
        System.out.println("Nhập Chiều Cao của bạn ");
        chieuCao = sc.nextInt();
        System.out.println("Nhập cân nặng cửa bạn ");
        float canNang = sc.nextFloat();
        if (doTuoi < 20)
            System.out.println("Tuổi bạn quá nhỏ để tính chỉ số cân nặng tiêu chuẩn");
        if (doTuoi >= 20 && doTuoi <= 29) {
            switch (gioiTinh) {
                case "Nam":
                    if (chieuCao >= 160) {
                        if (canNang >= 62.9 && canNang < 69.4) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 69.4)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
                case "Nữ":
                    if (chieuCao >= 160) {
                        if (canNang >= 59.8 && canNang < 65.8) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 65.8)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
            }
        }
        if (doTuoi >= 30 && doTuoi <= 39) {
            switch (gioiTinh) {
                case "Nam":
                    if (chieuCao >= 160) {
                        if (canNang > 69.4 && canNang < 72.3) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 72.3)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
                case "Nữ":
                    if (chieuCao >= 160) {
                        if (canNang >= 65.8 && canNang < 69.9) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 69.9)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
            }
        }
        if (doTuoi >= 40 && doTuoi <= 49) {
            switch (gioiTinh) {
                case "Nam":
                    if (chieuCao >= 160) {
                        if (canNang >= 72.3 && canNang < 78) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 78)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
                case "Nữ":
                    if (chieuCao >= 160) {
                        if (canNang >= 69.9 && canNang < 73) {
                            System.out.println("Bạn vừa đủ tiêu chuẩn ở độ tuổi " + doTuoi + " của bạn");
                            break;
                        } else if (canNang > 73)
                            System.out.println("Bạn hơi mập so với độ tuổi của bạn");
                        else
                            System.out.println("Bạn cần ăn uống thêm để đạt vóc dáng tiêu chuẩn");
                        break;
                    } else
                        System.out.println("Chiều cao của bạn cần cải thiện");
            }
        }
        if (doTuoi >= 50)
            System.out.println("Tuổi của bạn vượt quá khoản tiêu chuẩn");
    }
}