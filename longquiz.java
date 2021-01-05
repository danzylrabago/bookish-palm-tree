package longquiz;
import java.util.Scanner;
public class longquiz{
	public static void main(String[] args) {
		
			System.out.println("EASY QUIZ  (2 pts each )\n");
			Scanner input = new Scanner (System.in);
			System.out.println("press A to proceed\n");
			String key = input.nextLine(); if (key.equals("a")) System.out.println(); else if(key.equals("A")) System.out.println(); else return;
			
		do {	int i=0; 
			
			System.out.println();
			System.out.println("question 1\n what is the capital of Philippines?\n a. Manila\n b. Cavite\n c. Davao\n d. Quezon");
			System.out.print("Answer: ");
			String a = input.nextLine(); 
			if (a.equals("a")) ++i; if (a.equals("a")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 2\n what is a skunk?\n a. plant\n b. animal\n c. drink\n d. sport");
			System.out.print("Answer: ");
			String b = input.nextLine(); if (b.equals("b")) ++i; if (b.equals("b")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 3\n who is Kemba Walker?\n a. basketball player\n b. artist\n c. singer\n d. preacher");
			System.out.print("Answer: ");
			String c= input.nextLine(); if (c.equals("a")) ++i; if (c.equals("a")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 4\n how much is a dollar in peso?\n a. 35\n b. 40\n c. 45\n d. 50");
			System.out.print("Answer: ");
			String d= input.nextLine(); if (d.equals("d")) ++i; if (d.equals("d")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 5\n who is Reepicheep?\n a. zombie\n b. singer\n c. mouse\n d. artist");
			System.out.print("Answer: ");
			String e = input.nextLine(); if (e.equals("c")) ++i; if (e.equals("c")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 6\n what is python?\n a. plant\n b. computer brand\n c. programming language\n d. famous drink");
			System.out.print("Answer: ");
			String f = input.nextLine(); if (f.equals("c")) ++i; if (f.equals("c")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 7\n what is 20%7?\n a. 3\n b. 4\n c. 5\n d. 6");
			System.out.print("Answer: ");
			String g = input.nextLine(); if (g.equals("d")) ++i; if (g.equals("d")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 8\n what is a calyx?\n a. part of human body\n b. part of animal body\n c. part of flower\n d. part of plant");			System.out.print("Answer: ");
			String h= input.nextLine(); if (h.equals("c")) ++i; if (h.equals("c")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 9\n what is the last digit of 2^105?\n a. 2\n b. 4\n c. 6\n d. 8");
			System.out.print("Answer: ");
			String z= input.nextLine(); if (z.equals("a")) ++i; if (z.equals("a")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			
			System.out.println();
			System.out.println("question 10\n what movie did Jason Statham star in?\n a. Avengers\n b. Need for Speed\n c. Star Wars\n d. Fast and Furious");
			System.out.print("Answer: ");
			String j = input.nextLine(); if (j.equals("d")) ++i; if (j.equals("d")) System.out.println("CORRECT"); else
			System.out.println("WRONG");
			System.out.println();
			
			System.out.println("your score: " + i*2);
			if (i*2>=14&& i*2<20) System.out.println("Congratulations! You passed the quiz.\n");
			else if (i*2==20) System.out.println("Excellent. You are perfect.\n");
			else System.out.println("Poor kid, better luck next time!\n");
			
			System.out.print("continue?: "); String cont= input.nextLine();System.out.println(); if (cont.equals("yes"))
		System.out.print("AVERAGE (3pts each): "); else return; 
		System.out.print("press b to continue: "); String ave = input.nextLine(); if (ave.equals("b")) System.out.println();else if (ave.equals("B")) System.out.println(); else return;
		
		int i2=0;
		
		System.out.println(); System.out.println("question 1\n what is 5!?\n a. 120\n b. 90\n c. 80\n d. 60"); System.out.print("Answer: "); String a1=input.nextLine(); if (a1.equals("a")) i2++; if (a1.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
	     System.out.println("question 2\n what is related to the word:  complacent?\n a. hardship \n b. comfort zone\n c. temptation\n d. love"); System.out.print("Answer: "); String b1=input.nextLine(); if (b1.equals("b")) i2++; if (b1.equals("b")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 3\n what is the synonym of derivative?\n a. hard\n b. easy\n c. subordinate\n d. superior"); System.out.print("Answer: "); String c1=input.nextLine(); if (c1.equals("c")) i2++; if (c1.equals("c")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 4\n what is the last digit of  3^77?\n a. 1\n b. 7\n c. 9\n d. 3"); System.out.print("Answer: "); String d1=input.nextLine(); if (d1.equals("d")) i2++; if (d1.equals("d")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 5\n what is the opposite of reckless?\n a. careful\n b. careless\n c. harmful\n d. harmless"); System.out.print("Answer: "); String e1=input.nextLine(); if (e1.equals("a")) i2++; if (e1.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 6\n what is a beaker?\n a. instrument\n b. laboratory apparatus\n c. rock\n d. bird"); System.out.print("Answer: "); String f1=input.nextLine(); if (f1.equals("b")) i2++; if (f1.equals("b")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 7\n what is next in the sequence (1, 2, 4, 2, 0, 0, 2, 1, -1, ...)?\n a. 0\n b. -1\n c. -2\n d. -3"); System.out.print("Answer: "); String g1=input.nextLine(); if (g1.equals("c")) i2++; if (g1.equals("c")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 8\n In STI, what is the equivalent of 1.75?\n a. 90\n b. 91\n c. 88\n d. 89"); System.out.print("Answer: "); String h1=input.nextLine(); if (h1.equals("d")) i2++; if (h1.equals("d")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 9\n how many books are in the Bible?\n a. 66\n b. 67\n c. 68\n d. 69"); System.out.print("Answer: "); String i1=input.nextLine(); if (i1.equals("a")) i2++; if (i1.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 10\n what is the cube root of 343?\n a. 7\n b. 9\n c. 8\n d. 6"); System.out.print("Answer: "); String j1=input.nextLine(); if (j1.equals("a")) i2++; if (j1.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println();	System.out.println("your score: " + i2*3);
			if (i2>=21&& i<30) System.out.println("Congratulations! You passed the quiz.\n");
			else if (i2*3==30) System.out.println("Excellent. You are perfect.\n");
			else System.out.println("Poor kid, better luck next time!\n");
			System.out.println("current total score: " + (i*2 + i2*3)); System.out.println();
			
			System.out.print("continue?: "); String con= input.nextLine();System.out.println(); if (con.equals("yes"))
		System.out.print("DIFFICULT (3pts each): "); else return; 
		System.out.print("press c to continue: "); String dif = input.nextLine(); if (dif.equals("c")) System.out.println();else if (ave.equals("C")) System.out.println(); else return;
		
		int i3=0;
		
		System.out.println(); System.out.println("question 1\n who is the maker of SpaceX?\n a. Elon Musk\n b. Larry Page\n c. Sergey Brin\n d. Anne Kwot"); System.out.print("Answer: "); String a2=input.nextLine(); if (a2.equals("a")) i3++; if (a2.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 2\n what is the last digit of 7^125?\n a. 3 \n b. 7\n c. 9\n d. 1"); System.out.print("Answer: "); String b2=input.nextLine(); if (b2.equals("b")) i3++; if (b2.equals("b")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 3\n what is the synonym of thrive?\n a. fail\n b. work\n c. succeed\n d. stay"); System.out.print("Answer: "); String c2=input.nextLine(); if (c2.equals("c")) i3++; if (c2.equals("c")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 4\n what is the last digit of  8^100?\n a. 8\n b. 4\n c. 2\n d. 6"); System.out.print("Answer: "); String d2=input.nextLine(); if (d2.equals("d")) i3++; if (d2.equals("d")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println("question 5\n what is the meaning of ecstatic?\n a. excited\n b. sad\n c. energetic\n d. steady"); System.out.print("Answer: "); String e2=input.nextLine(); if (e2.equals("a")) i3++; if (e2.equals("a")) System.out.println("CORRECT"); else System.out.println("WRONG");System.out.println();
		
		System.out.println();	System.out.println("your score: " + i3*5);
			if (i3*5>=15&& i3*5<25) System.out.println("Congratulations! You passed the quiz.\n");
			else if (i3*5==25) System.out.println("Excellent. You are perfect.\n");
			else System.out.println("Poor kid, better luck next time!\n");
			System.out.println("final total score: " + (i*2 + i2*3 + i3*5)); System.out.println(); if ((i*2 + i2*3 + i3*5)==75) System.out.println("GREAT JOB. WELL DONE");
			
			System.out.print("Restart? ( yes / no ): "); String retake = input.nextLine(); if (retake.equals("yes")) continue;
			else if(retake.equals("no")) break;
	} while(true); 	
}
}
