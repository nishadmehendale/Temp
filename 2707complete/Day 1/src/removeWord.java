import java.util.*;
public class removeWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		sentence = sentence.trim().replaceAll(" +", " ");
		
		System.out.println("Enter a word to be deleted");
		String word = sc.nextLine();
		
		System.out.println("Enter position of the word to be deleted");
		int position = sc.nextInt();
		
		int count = 0, length = sentence.length(), wordlength = word.length();
		
		for(int i = 1; i<=length; i++)
		{
			if(sentence.charAt(i) == ' ')
				count++;
			if(count == position -1) {
				StringBuffer sent = new StringBuffer(sentence);
				sent=sent.replace(i+1, i+wordlength+1, " ");
				sentence = sent.toString();
				break;
			}
		}
		
		sentence = sentence.trim().replaceAll(" +", " ");
		System.out.println(sentence);
	}

}
