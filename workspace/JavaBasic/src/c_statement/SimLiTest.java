package c_statement;
import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		

		String str1 = new String("나는 금사빠다");
		String str2 = new String("연애할 때 끌려다니는 타입이다");
		String str3 = new String("데이트 코스는 미리 짜는게 편하다");
		String str4 = new String("감정기복이 크지 않다");
		String str5 = new String("감정 표현에 솔직한 편이다");
		String str6 = new String("활동적인 데이트가 좋다");
		String str7 = new String("연락이 없어도 믿고 기다리는 편이다");
		String str8 = new String("이성친구는 존재할 수 없다");
		String str9 = new String("아무것도 아닌 일에 쉬게 섭섭함이 쌓인다");
		
		Scanner s = new Scanner (System.in);
		
		System.out.println(str1);
		String input1 = s.nextLine();
		if(input1.equals("YES")){
			System.out.println(str2);
			String input2 = s.nextLine();
			if(input2.equals("YES")){
				System.out.println(str5);
				String input18 = s.nextLine();
				if(input18.equals("YES")){
					System.out.println(str8);
					String input19 = s.nextLine();
					if(input19.equals("YES")){
						System.out.println("str9");
						String input25 = s.nextLine();
						if(input25.equals("YES")){
							System.out.println("D");
						}else{
							System.out.println("C");
						}
					}else{
						System.out.println("B");
					}
				}else{
					System.out.println(str6);
					String input20 = s.nextLine();
					if(input20.equals("YES")){
						System.out.println(str8);
						String input21 = s.nextLine();
						if(input21.equals("YES")){
							System.out.println("str9");
							String input24 = s.nextLine();
							if(input24.equals("YES")){
								System.out.println("D");
							}else{
								System.out.println("C");
							}
						}else{
							System.out.println("B");
						}
					}else{
						System.out.println(str9);
						String input22 = s.nextLine();
						if(input22.equals("YES")){
							System.out.println("D");
						}else{
							System.out.println("C");
						}
					}
				}
			}else{
				System.out.println(str3);
				String input3 = s.nextLine();
				if(input3.equals("YES")){
					System.out.println(str6);
					String input10 = s.nextLine();
						if(input10.equals("YES")){
							System.out.println(str8);
							String input11 = s.nextLine();
							if(input11.equals("YES")){
								System.out.println("str9");
								String input23 = s.nextLine();
								if(input23.equals("YES")){
									System.out.println("D");
								}else{
									System.out.println("C");
								}
							}else{
								System.out.println("B");
							}
						}else{
							System.out.println(str9);
							String input12 = s.nextLine();
							if(input12.equals("YES")){
								System.out.println("D");
							}else{
								System.out.println("C");
							}
						}
				}else{
					System.out.println(str5);
					String input13 = s.nextLine();
					if(input13.equals("YES")){
						System.out.println(str8);
						String input14 = s.nextLine();
						if(input14.equals("YES")){
							System.out.println("B");
						}else{
							System.out.println(str9);
							String input26 = s.nextLine();
							if(input26.equals("YES")){
								System.out.println("D");
							}else{
								System.out.println("C");
							}
						}
					}else{
						System.out.println(str6);
						String input15 = s.nextLine();
						if(input15.equals("YES")){
							System.out.println(str8);
							String input16 = s.nextLine();
							if(input16.equals("YES")){
								System.out.println(str9);
								String input27 = s.nextLine();
								if(input27.equals("YES")){
									System.out.println("D");
								}else{
									System.out.println("C");
								}
							}else{
								System.out.println("B");
							}
						}else{
							System.out.println(str9);
							String input17 = s.nextLine();
							if(input17.equals("YES")){
								System.out.println("D");
							}else{
								System.out.println("C");
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		else {
			System.out.println(str4);
			String input4 = s.nextLine();
			if(input4.equals("YES")){
				System.out.println(str7);
				String f = s.nextLine();
				if(f.equals("YES")){
					System.out.println("A");
				}else{
					System.out.println(str8);
					String input35 = s.nextLine();
					if(input35.equals("YES")){
						System.out.println(str9);
						String input36 = s.nextLine();
						if(input36.equals("YES")){
							System.out.println("D");
						}else{
							System.out.println("C");
						}
					}else{
						System.out.println("B");
					}
				
				}
			}
					
			
					
			else{
				System.out.println(str5);
				String input28 = s.nextLine();
				if(input28.equals("YES")){
					System.out.println(str8);
					String input29 = s.nextLine();
					if(input29.equals("YES")){
						System.out.println(str9);
						String input30 = s.nextLine();
						if(input30.equals("YES")){
							System.out.println("D");
						}else{
							System.out.println("C");
						}
					}else{
						System.out.println("B");
					}
				}else{
					System.out.println(str6);
					String input31 = s.nextLine();
					if(input31.equals("YES")){
						System.out.println(str8);
						String input32 = s.nextLine();
						if(input32.equals("YES")){
							System.out.println(str9);
							String input33 = s.nextLine();
							if(input33.equals("YES")){
								System.out.println("D");
							}else{
								System.out.println("C");
							}
						}else{
							System.out.println("B");
						}
					}else{
						System.out.println(str9);
						String input34 = s.nextLine();
						if(input34.equals("YES")){
							System.out.println("D");
						}else{
							System.out.println("C");
						}
					}
				}
			}
		}
	}

}
