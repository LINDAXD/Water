package water1;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		int m1=0;
		int m2=0;
		int p1=0;
		int p2=0;
		
		Scanner admission = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                 ���� ������ũ�� ���� ���� ȯ���մϴ�.               -");
		System.out.println("------------------------------------------------------------");
		System.out.println("������ ����� ���Ź���� ������ �ּ���.");
		System.out.println("[1] �¶���");
		System.out.println("[2] ��������");
		int adm = admission.nextInt();
		if(adm == 1) {	
for(;;) {

				System.out.println("��ȣ�� �Է��� �ּ���.");
				Scanner sc1 = new Scanner(System.in);
				int aaaa = admission.nextInt();
				System.out.println("�Է��Ͻ� ��ȣ�� �½��ϱ�? [1] �½��ϴ� , [2] �ƴմϴ�");
				int bbbb = admission.nextInt();    
			if(bbbb==1) {
				System.out.println("�¶��� Ƽ���� �߱��ϰڽ��ϴ�.");  //
				System.out.println("------------------------------------------------------------");
				break;
			}
			System.out.println("��ȣ�� �ٽ� �Է��� �ּ���.");
			}System.out.println("�Ϸ�Ǿ����ϴ�.");

		}else {

			int age;
		String[] play={"[1]�����", "[2]�����÷���", "[3]�θ޶���", "[4]������", "[5]���̽�", "[6]����̵�", "[7]�ް�����", "[8]Ʃ����̵�", "[9]���ζ��̵�"};
		Scanner inp = new Scanner(System.in);
		System.out.println("�����Ͻ� ��ǰ�� ������ �ּ���.");
		System.out.println("[1]�����̿��	\n  [���� 60,000�� / û�ҳ� 48,000��]"); // ���� 60000�� / 48000��
		System.out.println("[2]BIG 3 \n  [���� 35,000�� / û�ҳ� 23,000��]"); // ���� 35000�� / 23000��
		System.out.println("[3]BIG 5 \n  [���� 40,000�� / û�ҳ� 28,000��]"); // ���� 40000�� / 28000��
		int a = inp.nextInt();
		
		
		
		if (a == 1) {
			//�����̿���� ��! // ���� 60000�� / 48000��
			m1 = 60000;
			m2 = 48000;
			System.out.println("������ �ο����� �Է��� �ּ���.");
			Scanner number = new Scanner(System.in);
			p1 = number.nextInt();
			System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
			Scanner number1 = new Scanner(System.in);
			p2 = number.nextInt();
			System.out.println("������ " + p1 + "��, " + "û�ҳ��� " + p2 + "��, " +
					"�� �ο����� " + (p1 + p2) + "���̰�, " + "������ " + (( m1 * p1 ) + ( m2 * p2 )) + "�� �Դϴ�." );
		
		}//BIG3�� ��
		
		else if (a == 2) {
			System.out.println("�̿��Ͻ� ��Ʈ������ ������ �ּ���. ");
			Scanner num =new Scanner(System.in);
			System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
			System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
			System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
			int b = num.nextInt();
			int c = num.nextInt();
			int d = num.nextInt();
			System.out.println("�����Ͻ� �ⱸ��: " + play[b-1] + ", " + play[c-1] + ", " + play[d-1] + " �Դϴ�.");
			int m3 = 35000;
			int m4 = 23000;
			System.out.println("������ �ο����� �Է��� �ּ���.");
			Scanner number2 = new Scanner(System.in);
			int p3 = number2.nextInt();
			System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
			Scanner number3 = new Scanner(System.in);
			int p4 = number3.nextInt();
			System.out.println("������ " + p3 + "��, " + "û�ҳ��� " + p4 + "��, " +
					"�� �ο����� " + ( p3 + p4 ) + "���̰�, " + "������ " + (( m3 * p3 ) + ( m4 * p4 )) + "�� �Դϴ�." );
		} else if (a == 3) { // BIG5�� ��
			System.out.println("�̿��Ͻ� ��Ʈ������ ������ �ּ���. ");
			Scanner numb =new Scanner(System.in);
			System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
			System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
			System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
			int e = numb.nextInt();
			int f = numb.nextInt();
			int g = numb.nextInt();
			int h = numb.nextInt();
			int i = numb.nextInt();
			System.out.print("�����Ͻ� �ⱸ��: " + play[e-1] + ", " +  play[f-1] + ", " + play[g-1] + ", " + play[h-1] + ", " + play[i-1] + " �Դϴ�.");
			// BIG5�� �� // ���� 40000�� / 28000��
			int m5 = 40000;
			int m6 = 28000;
			System.out.println("������ �ο����� �Է��� �ּ���.");
			Scanner number4 = new Scanner(System.in);
			int p5 = number4.nextInt();
			System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
			Scanner number5 = new Scanner(System.in);
			int p6 = number5.nextInt();
			System.out.println("������ " + p5 + "��, " + "û�ҳ��� " + p6 + "��, " +
					"�� �ο����� " + ( p5 + p6 ) + "���̰�, " + "�� ������ " + (( m5 * p5 ) + ( m6 * p6 )) + "�� �Դϴ�." );
		} else {
			System.out.println("�ٽ� �Է��� �ּ���.");
		}}

		int price[] = {20000,40000,70000};
		int seat[] = new int[10];
		int rock[] = new int[20];
		int chek[] = new int[10];//new�� ���� �� �� �ʱ�ȭ
		int erved;
		int b=0;
		int h=0;
		int total1=0;

		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                     �δ�ü� �� �뿩��ǰ                       -");
		System.out.println("------------------------------------------------------------");
		System.out.println("              * 10�ʾȿ� ��ġ���� �����ø� �ڵ� �ʱ�ȭ �˴ϴ�. *         ");
		System.out.println("------------------------------------------------------------");
		System.out.println("�̿��Ͻ� ��ǰ�� ��ȣ�� �Է��� �ּ���.");
		System.out.println("[1] �δ�ü�");
		System.out.println("[2] �뿩��ǰ");
		System.out.println("[3] �̿����");
		int q = input.nextInt();
if(q==3) {
		System.out.println("�����մϴ�.");}
else if(q==1){
			System.out.println("�δ�ü��� �����Ͻðڽ��ϱ�?");
			System.out.println("[1] ��");
			System.out.println("[2] �ƴϿ�");
			int aa = input.nextInt();
			if(aa==1){
				System.out.println("�̿��Ͻ� �δ�ü��� ������ �ּ���.");
				System.out.println("[1] ������ [20,000��]");
				System.out.println("[2] ��� [40,000��]");
				System.out.println("[3] ī�ٳ� [70,000��]");
				b = input.nextInt();
				for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
					System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
				}                                 //    }
				System.out.println();
				System.out.print("�����Ͻ� �¼��� ������ �ּ���.");
				erved = input.nextInt();
				if (seat[erved - 1] == 0) {
					seat[erved - 1] = 1;
					Amenities am1 = new Amenities(b,erved); //Amenities Ŭ���� am1�� �̸��� ������
					am1.status(seat); // am1 = amenities Ŭ���� �ȿ� ����ִ� status ���� ������

					total1 = (b*price[b-1]);
					System.out.println("�� �ݾ��� "+total1+"�Դϴ�.");		
				} else if (seat[erved - 1] == 1) {
					System.out.println("�̹� ����� �¼��Դϴ�.");

				}
			}
			
		
		}{
		//		System.out.println("------------------------------");
		//		System.out.println("�� ���Ͻô� ���񽺰� �����ʴϱ�?");
		//		System.out.println("[1]�����ϱ�");
		//		System.out.println("[2]�뿩�ϱ�");
		//		int y = input.nextInt();
		//		if(y==2)
		//
		//		{
		System.out.println("��Ŀ�� �뿩�Ͻðڽ��ϱ�? [4,000��]");	
		System.out.println("[1] ��");
		System.out.println("[2] �ƴϿ�");	
		int e = input.nextInt();
		if(e==1) {e=1;}else{e=0;}
		int towelSmall=0,towelBig=0;
		if (e==1){
			for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
				System.out.print((i + 1) + " ");
			}
			System.out.println();
			for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
			} 
			
			//    }
			System.out.println();
			System.out.print("�� ��° �ڸ��� �����Ͻðڽ��ϱ�?");
			erved = input.nextInt();
			if ( rock[erved - 1] == 0) {
				rock[erved - 1] = 1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println("  ������ ������´� ������ �����ϴ�.  ");
				System.out.println("------------------------------------------------------------");

				for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
					System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
				} 
				System.out.println();
				System.out.println("------------------------------------------------------------");
				//				} else if ( chek[erved - 1] == 1) {
				//					System.out.println("�̹� ����� �¼��Դϴ�.");
				//				}
			}
		}
		{
			System.out.println("Ÿ���� �뿩�Ͻðڽ��ϱ�? [3,000��~]");	
			System.out.println("[1] ��");
			System.out.println("[2] �ƴϿ�");
			h = input.nextInt();

			if(h==1) {
				System.out.println("�뿩�Ͻ� ��(����)[3,000��]�� ������ �Է��� �ּ���.");
				towelSmall = input.nextInt();
				System.out.println("�뿩�Ͻ� ��(��ġŸ��)[5,000��]�� ������ �Է��� �ּ���.");					
				towelBig = input.nextInt();
				//					Towel t = new Towel(towelSmall,towelBig);

			}
		}
		int total = e*4000+(towelSmall*3000) +(towelBig*5000);
		
		int total2 = total+total1;

		System.out.println("------------------------------------------------------------");
		System.out.println("���Ͻô� ��ǰ�� �´��� �ٽ� �� �� Ȯ���� �ּ���.");
		System.out.println("\t �뿩�ϴ� ��ǰ ���");
		System.out.println("------------------------------------------------------------");
		if(b == 0) {System.out.println("");}else if(b == 1) {System.out.println("������ : "+total1+"�� �����Ͽ����ϴ�.");}else if(b==2) {System.out.println("��� : "+total1+"�� �����Ͽ����ϴ�.");}else {System.out.println("ī�ٳ� : "+total1+"�� �����Ͽ����ϴ�.");}
		if(e==0&&h==2) {System.out.println(" ");}else{System.out.println("��Ŀ : "+ e +"��"+" / "+"Ÿ�� ��(����) : "+towelSmall+"��"+" / "+"Ÿ�� ��(��ġŸ��) : "+towelBig+"��");}



		System.out.println("�� �ݾ��� "+total2+"�� �Դϴ�.");
		//}
		int total3=(m1*p1)+(m2+p2);
		int total4=total2+total3;
		
		System.out.println("����Ǳ��� ������ �� �ݾ��� "+total4+"�� �Դϴ�.");
		Answer.main_discount(args); 

	}}



	//���� �Ѱ�.
	public static void main_discount(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------------------------------------------------------------");
		System.out.println("* ���� �ȳ� *");
		System.out.println("- ī�� ����: �Ｚ, �ϳ�, ����, ����, BCī�� �ִ� 50% ����"
				+ "\n- ��Ż� ����: LG U+ ����� 30% ����"
				+ "\n- �л�(��~����л�, ����(��)��) ����: ����� 20,000��"
				+ "\n- ��� ����: 65�� �̻� / ����� / ����������"
				+ " ����� 30,000��");
		System.out.println("------------------------------------------------------------");

		System.out.println("���� ����� ������ �ּ���.");
		System.out.println("[1] ī������\n[2] ��Ż� ����\n[3] �л� ����\n[4] ��� ����");

		int a = scanner.nextInt();
		System.out.println("------------------------------------------------------------");
		for(;;) {
			if(a == 1) {
				Answer.main_card(args);                             // ī��� �̵�.
				break;
			}else if(a == 2) {
				System.out.println("------------------------------------------------------------");
				try {												// ������ ����.
					System.out.println("LG U+ ����� ���ڵ带 ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Ȯ���� �Ϸ�Ǿ����ϴ�.\n");
				System.out.println("------------------------------------------------------------");

				Answer.main_pay2(args);                             // pay(���� ���� ����)�� �ι�° �������� �̵�
				break;
			}else if(a == 3) {
				try {												// ������ ����.
					System.out.println("�л����� ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}


				System.out.println("\nȮ���� �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				Answer.main_pay(args);                                  // pay(���� ���� ����)�� ù��° �������� �̵�
				return;

			}else if(a == 4) {
				try {												// ������ ����.
					System.out.println("Ȯ�� ������ �ź����� ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("\nȮ���� �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				Answer.main_pay(args);                                  // pay(���� ���� ����)�� ù��° �������� �̵�
				return;

			}
		}
	}

	//  ���� �ΰ�
	public static void main_pay(String[] args) {                          // main1
		Scanner scanner = new Scanner(System.in);

		System.out.println("* ���� ���� ���� *");
		System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");

		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_card(args);                                       // card�� �̵�
		}else if(a == 2) {
			Answer.main_cash(args);                                       // cash�� �̵�
		}else {
			Answer.main_gift_card1(args);                            // gift_card�� ù��° �������� �̵�
		}
	}
	public static void main_pay2(String[] args) {                          // main2
		Scanner scanner = new Scanner(System.in);

		System.out.println("* ���� ���� ���� *");
		System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");

		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_card(args);                                       // card�� �̵�
		}else if(a == 2) {
			Answer.main_cash(args);                                       // cash�� �̵�
		}else {
			Answer.main_gift_card1(args);                            // gift_card�� ù��° �������� �̵�
		}
	}



	//  ���� �Ѱ�.
	public static void main_card(String[] args) {
		int m = 120000;
		System.out.println("������ �ݾ��� " + m + "�� �Դϴ�.\n");
		System.out.println("------------------------------------------------------------");

		System.out.println("{ī�� ���� ����} \n* ī�� ������ 1��, ��1ȸ, ��5ȸ �����˴ϴ�.\n");
		System.out.println("- �Ｚī�� : �̿�� 30% ����\n"
				+ "- �ϳ�ī�� : �̿�� 50% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- B  Cī�� : �̿�� 50% ����\n");
		System.out.println("[1] �������\n[2] ī�����");


		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_pay(args);                                       // pay ù��° �������� �̵�
		}else {
			try {												// ������ ����.
				System.out.println("ī�带 ������ �ּ���.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");

		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("* ����Ʈ�� �����Ͻðڽ��ϱ�? *");
		System.out.println("[1] ����Ʈ ���� �ϱ�\n[2] ����Ʈ ���� �� ��");

		int b = scanner.nextInt();
		if(b == 1) {
			System.out.println("�޴��� ��ȣ�� �Է����ּ���.  ex)01012341234");
			String c = scanner.next();
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("�����մϴ�.");
			System.out.println("------------------------------------------------------------");
		}else{
			System.out.println("�����մϴ�.");
		}
	}

	// ���� �Ѱ�. ���� �̵� ����.
	public static void main_cash(String[] args) {
		int asd = 120000;
		System.out.println("���� �ݾ���" + asd +"�Դϴ�");
		Scanner sc = new Scanner(System.in);


		// ��� �ֱ�. ����.

		System.out.println("���� �������� �Ͻðڽ��ϱ�?");
		System.out.println("[1]�� [2] �ƴϿ�");
		int asd_ca = sc.nextInt();

		System.out.println();


		for(;;) {
			if(asd_ca == 1) {
				System.out.println("��ȣ�� �Է��� �ּ���.");
				Scanner sc1 = new Scanner(System.in);
				int SC1 = sc1.nextInt();
				System.out.println("�Է��Ͻ� ��ȣ�� �½��ϱ�? [1] �½��ϴ� , [2] �ƴմϴ�");
				int SC2 = sc.nextInt();    
				if(SC2 == 1) {
					System.out.println("���� �������� �߱��ϰڽ��ϴ�.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("��ȣ�� �ٽ� �Է��� �ּ���.");
			}
			System.out.println("�Ϸ�Ǿ����ϴ�.");
			break;
		} return;
	}


	// ���� �ΰ�
	public static void main_gift_card1(String[] args){                   // main1
		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("��ǰ���� ������ �ּ���.");
			System.out.println("[1] �Ե� ��ǰ�� \n[2] ��ȭ ��ǰ��");
			int gift_cash_1 = scanner.nextInt();

			if(gift_cash_1 == 1) {
				System.out.println("�Ե� ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else if(gift_cash_1 == 2){
				System.out.println("��ȭ ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else {
				System.out.println("���ڸ� �ٽ� �Է��� �ּ���.");
				System.out.println("------------------------------------------------------------");
			}
		}


		System.out.println("�ݾױ��� ������ �ּ���.");
		System.out.println("[1] 100,000�� \n [2] 50,000��");
		int total = 100000;   //  -------------------------------- ���߿� �����ϱ�^^^^^^^
		int gift_cash_2 = scanner.nextInt();

		if(gift_cash_2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == total){
			System.out.println(total + " - " + gift_cash_2 + " = " + "0" +"��� ������ �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("�ܾ���: " + (total - gift_cash_2) + "�� �Դϴ�.");
			System.out.println("�ܾ� ���� ������ ������ �ּ���.");
			Answer.main_gift_card2(args);                       // gift_card �ι�° �������� �̵�
		}

	}
	public static void main_gift_card2(String[] args) {                 // main2  �̰Ŵ� ��ǰ���� �ƴϰ� ��ǰ�� ���� �� �ܾ� ����ϴ� �κ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] ī�� ����\n[2] ���� ����");

		int a = scanner.nextInt();

		if(a == 1) {
			try {
				System.out.println("ī�带 ������ �ּ���.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			// �� �޾Ƽ� ���� �ֱ�. ����.2

		}else{
			Answer.main_cash(args);                                       // cash�� �̵�
		}
	}
}