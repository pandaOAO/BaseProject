package choice1.data;

public class SalonList {

  Salon[] salons = new Salon[5];

  public SalonList() {
    // TODO Auto-generated constructor stub

    salons[0] = new Salon("NONO頭毛店", 4.0, 350.0, "文華路永新巷北二弄4號號", "04 2706 2006", null);

    salons[1] = new Salon("slickbarbershop俐落理髮俱樂部", 5.0, 400.0, "福星路511巷3號", "04 2707 3000", "13:00-23:00");

    salons[2] = new Salon("小林髮廊（逢甲店）", 3.2, 400.0, "福星路435號", null, "12:00–21:00");

    salons[3] = new Salon("AT國際髮型", 3.7, 400.0, "福星路459號", "04 2451 9967", "12:00–22:00");

    salons[4] = new Salon("小林髮廊（愛樂店）", 5.0, 450.0, "福星路603號", "04 2708 0811", "10:30–21:30");

  }

}
