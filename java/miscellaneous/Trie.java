/** This is TRIE.
To run the code complie it and run the Test class, It contains the main method.
Once done provide input according to the menu INDEX.
1 > Insert word into trie.
2 > Search word in trie.
3 > Exit.

Important: Works with lowercase letter only.

*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;


class TrieNode {
  static final int SIZE = 26;
  TrieNode[] children = new TrieNode[SIZE];
  boolean wordEnd;
  TrieNode(){
    wordEnd = false;
  }
}

class Trie {

	static TrieNode root = new TrieNode();

  public void addWord(String key){
    int i, index;
		TrieNode next = root;
		for (i = 0; i < key.length(); i++)
		{
			index = key.charAt(i) - 'a';
			if (next.children[index] == null){
				next.children[index] = new TrieNode();
      }
			next = next.children[index];
		}
		next.wordEnd = true;
	}


	public boolean hasWord(String key){
		int i, index;
		TrieNode next = root;
		for (i = 0; i < key.length(); i++)
		{
			index = key.charAt(i) - 'a';

			if (next.children[index] == null){
				return false;
      }
			next = next.children[index];
		}
		return (next != null && next.wordEnd);
	}

}

class Test{

	public static void main(String args[]){

    Trie root = new Trie();

    Scanner input = new Scanner(System.in);
    System.out.println("HELLO");
    Trie trie = new Trie();
    String s;
    int option;
    try{
      do {

        System.out.println("\n 1.Add word to TRIE: addWord() \n 2.Search word in TRIE: hasWord()\n 3.Exit program\n");
        option = input.nextInt();
          switch (option) {
            case 1: System.out.println("\nEnter the word to be added to TRIE\n");
                    s = input.next().toLowerCase();
                    root.addWord(s);
                    break;
            case 2: System.out.println("\nEnter the word to search to TRIE\n");
                    s = input.next().toLowerCase();
                    if (root.hasWord(s)) {
                      System.out.println(s+" is present in TRIE\n");
                    }
                    else {
                      System.out.println(s+" is not present in TRIE\n");
                    }
                    break;
            case 3:
                    break;
            default:
                    System.out.println("\nPlease enter the correct options.\n");
          }
      } while (option != 3);
      System.out.println("Exiting the program");
    }

    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("\nPlease provide all lowercase letters only");
        System.out.println(e);
    }
    catch (InputMismatchException e) {
      System.out.println("\nPlease Check the input provided");
      System.out.println(e);
    }
    catch (Exception e) {
      System.out.println(e);
    }

  }
}
