import java.util.Scanner;
public class TestBlockchain {

	public static void main(String args[]) {
		int i,j;
        Block a[]=new Block[100];;
        String s=null;
        Blockchain iBlock = new Blockchain();
        Scanner sc=new Scanner(System.in);
        i=0;j=0;
        
        while(i!=4){
                    System.out.println("Enter 1-Enter a block | 2-Tamperdata | 3-Display Chain | 4-Exit");
            i=sc.nextInt();
            switch(i){
                case 1: 
                        s=sc.nextLine();
                       System.out.println("Enter Data ");
                        s=sc.nextLine();
                         a[j] = new Block("V0.1", new java.util.Date(), s);
                        j++;
                        iBlock.addBlock(a[j-1]);
                        break;
                case 2: s=sc.nextLine();
                        System.out.println("Enter Data to replace:");
                        s=sc.nextLine();
                        iBlock.getLatestBlock().setPreviousHash(s);
                        break;
                case 3: iBlock.displayChain();
                        iBlock.isValid();
                        break;
                case 4: 
                        break;

            }
        }
		

	}
	
}
