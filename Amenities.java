package water_re;

public class Amenities {
	 int b; // �δ�ü�
	 int erved; //���° �¼�
	 	 
    public Amenities(int b,int erved) {
        this.b = b;
        this.erved = erved;
    }
    public void status(int[] seat) {
    	System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("------------------------------");
		System.out.println("������ ������´� ������ �����ϴ�.");
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
			//       System.out.println(seat[i] + " ");
		}    
		System.out.println();
		System.out.println("------------------------------");
    }
}
