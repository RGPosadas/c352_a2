//Driver class for MyLinkedList and MyArrayList 
import java.util.Random; 
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ListTester {
    public static void main(String[] args) {
        /**
         * Initialize PrintWriter and Random
         */
        PrintWriter pw = null;
		try {
				pw = new PrintWriter( new FileOutputStream("testrun.txt", false));
		}
		catch (FileNotFoundException e) {
			System.out.println("File could not be created. Terminating the program.");
			System.exit(0);
        }
        Random randomizer = new Random();
        int[] myN = {10, 100, 1000, 10000};
        // int[] myN = {10,100,1000,10000,100000,1000000};
        String toPW = "";


        /**
         * Start making arrays of size n, where n comes from the elements of the array myN 
         */
        for (int i = 0; i < myN.length; i++) {
            /**
             * Initialize lists to be used
             */
            MyArrayList<Integer> myAL = new MyArrayList<>();
            ArrayList<Integer> theirAL = new ArrayList<>();
            MyLinkedList<Integer> myLL = new MyLinkedList<>();
            LinkedList<Integer> theirLL = new LinkedList<>();
            int n = myN[i];





            ///////////////////////////////////////
            //START MyArrayList
            ///////////////////////////////////////

            /**
             * Add to end MyArrayList
             */
            // System.out.println("\nStarting add end MyAL...");
            long start1 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to end: " + num);
                myAL.add(num); //add to end a random number from [0, 2n]
            }
            long end1 = System.nanoTime();
            long addEndMyAL = end1 - start1;
            // System.out.println(myAL);

            /**
             * Remove from end MyArrayList
             */
            // System.out.println("\n\nStarting remove end MyAL...");
            long start2 = System.nanoTime();
            for (int j = 0; j < n; j++)
                myAL.remove(myAL.size() - 1);
                // System.out.println(myAL.remove(myAL.size() - 1));
            long end2 = System.nanoTime();
            long removeEndMyAL = end2 - start2;
            // System.out.println(myAL);

            /**
             * Add to start MyArrayList
             */
            // System.out.println("\nStarting add start MyAL...");
            long start3 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to start: " + num);
                myAL.add(0, num); //add a random number [0, 2n] to a random index [0, currentLength]
            }
            long end3 = System.nanoTime();
            long addStartMyAL = end3 - start3;
            // System.out.println(myAL);

            /**
             * Remove from start MyArrayList
             */
            // System.out.println("\nStarting remove start MyAL...");
            long start4 = System.nanoTime();
            for (int j = 0; j < n; j++)
                myAL.remove(0);
                // System.out.println(myAL.remove(0));
            long end4 = System.nanoTime();
            long removeStartMyAL = end4 - start4;
            // System.out.println(myAL);

            /**
             * Add to random index MyArrayList
             */
            // System.out.println("\nStarting add random MyAL...");
            long start5 = System.nanoTime();
            for (int j = 0; j < n; j ++){
                int num = randomizer.nextInt((2*n)+1);
                int index = 0;
                if (j != 0)
                    index = randomizer.nextInt(myAL.size());
                // System.out.println("Add to start: " + num + " at index: " + index);
                myAL.add(index, num); //add to start a random number from [0, 2n]

            }
            long end5 = System.nanoTime();
            long addRandomMyAL = end5 - start5;
            // System.out.println(myAL);

            /**
             * Remove from random index MyArrayList
             */
            // System.out.println("\nStarting remove random MyAL...");
            long start6 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                int num = randomizer.nextInt(myAL.size());
                // System.out.println("Removing index " + num);
                myAL.remove(num);
                // System.out.println(myAL);
            }
            long end6 = System.nanoTime();
            long removeRandomMyAL = end6 - start6;

            /**
             * Remove random Object MyArrayList
             */
            // System.out.println("\nFilling up array...");
            for (int j = 0; j < n; j++)
                myAL.add(randomizer.nextInt((2*n)+1));
            // System.out.println(myAL);

            // System.out.println("\nStarting remove Obj MyAL...");
            long start7 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                Integer num = (Integer) randomizer.nextInt((2*n) + 1);
                myAL.remove(num);
                // System.out.println(myAL.remove(num));
            }
            long end7 = System.nanoTime();
            long removeValueMyAL = end7 - start7;
            // System.out.println(myAL);





            
            ///////////////////////////////////////
            //START TheirArrayList
            ///////////////////////////////////////
            /**
             * Add to end TheirAL
             */
            // System.out.println("\nStarting add end TheirAL...");
            long start8 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to end: " + num);
                theirAL.add(num); //add to end a random number from [0, 2n]
            }
            long end8 = System.nanoTime();
            long addEndTheirAL = end8 - start8;
            // System.out.println(theirAL);

            /**
             * Remove from end TheirAL
             */
            // System.out.println("\nStarting remove end TheirAL...");
            long start9 = System.nanoTime();
            for (int j = 0; j < n; j++)
                theirAL.remove(theirAL.size() - 1);
                // System.out.println(theirAL.remove(theirAL.size() - 1));
            long end9 = System.nanoTime();
            long removeEndTheirAL = end9 - start9;
            // System.out.println(theirAL);

            /**
             * Add to start TheirAL
             */
            // System.out.println("\nStarting add start TheirAL...");
            long start10 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to start: " + num);
                theirAL.add(0, num); //add a random number [0, 2n] to a random index [0, currentLength]
            }
            long end10 = System.nanoTime();
            long addStartTheirAL = end10 - start10;
            // System.out.println(theirAL);

            /**
             * Remove from start TheirArrayList
             */
            // System.out.println("\nStarting remove start TheirAL...");
            long start11 = System.nanoTime();
            for (int j = 0; j < n; j++)
                theirAL.remove(0);
                // System.out.println(theirAL.remove(0));
            long end11 = System.nanoTime();
            long removeStartTheirAL = end11 - start11;
            // System.out.println(theirAL);

            /**
             * Add to random index TheirArrayList
             */
            // System.out.println("\nStarting add random index TheirAL");
            long start12 = System.nanoTime();
            for (int j = 0; j < n; j ++){
                int num = randomizer.nextInt((2*n)+1);
                int index = 0;
                if (j != 0)
                    index = randomizer.nextInt(theirAL.size());
                // System.out.println("Add to start: " + num + " at index: " + index);
                theirAL.add(index, num); //add to start a random number from [0, 2n]
            }
            long end12 = System.nanoTime();
            long addRandomTheirAL = end12 - start12;
            // System.out.println(theirAL);

            /**
             * Remove from random index TheirArrayList
             */
            // System.out.println("\nStarting remove random index theirAL...");
            long start13 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                int num = randomizer.nextInt(theirAL.size());
                // System.out.println("Removing index " + num);
                theirAL.remove(num);
                // System.out.println(theirAL);
            }
            long end13 = System.nanoTime();
            long removeRandomTheirAL = end13 - start13;

            /**
             * Remove random Object MyArrayList
             */
            // System.out.println("Creating array...");
            for (int j = 0; j < n; j++)
                theirAL.add(randomizer.nextInt((2*n)+1));
            // System.out.println(theirAL);

            // System.out.println("\nStarting remove Obj theirAL...");
            long start14 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                Integer num = (Integer) randomizer.nextInt((2*n) + 1);
                theirAL.remove(num);
                // System.out.println(theirAL.remove(num));
            }
            long end14 = System.nanoTime();
            long removeValueTheirAL = end14 - start14;
            // System.out.println(theirAL);







            ///////////////////////////////////////////
            //START MyLinkedList
            ///////////////////////////////////////////
            /**
             * Add to end MyLinkedList
             */
            // System.out.println("\nStarting add to end MyLL...");
            long start15 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to end: " + num);
                myLL.add(num); //add to end a random number from [0, 2n]
            }
            long end15 = System.nanoTime();
            long addEndMyLL = end15 - start15;
            // System.out.println(myLL);

            /**
             * Remove from end MyLinkedList
             */
            // System.out.println("\nStarting remove at end MyLL...");
            long start16 = System.nanoTime();
            for (int j = 0; j < n; j++)
                myLL.remove(myLL.size() - 1);
                // System.out.println(myLL.remove(myLL.size() - 1));
            long end16 = System.nanoTime();
            long removeEndMyLL = end16 - start16;
            // System.out.println(myLL);

            /**
             * Add to start MyLL
             */
            // System.out.println("\nStarting add to start MyLL...");
            long start17 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to start: " + num);
                myLL.add(0, num); //add a random number [0, 2n] to a random index [0, currentLength]
            }
            long end17 = System.nanoTime();
            long addStartMyLL = end17 - start17;
            // System.out.println(myLL);

            /**
             * Remove from start MyLL
             */
            // System.out.println("\nStarting remove at start MyLL...");
            long start18 = System.nanoTime();
            for (int j = 0; j < n; j++)
                myLL.remove(0);
                // System.out.println(myLL.remove(0));
            long end18 = System.nanoTime();
            long removeStartMyLL = end18 - start18;
            // System.out.println(myLL);

            /**
             * Add to random index MyLL
             */
            // System.out.println("\nStarting add at random index MyLL...");
            long start19 = System.nanoTime();
            for (int j = 0; j < n; j ++){
                int num = randomizer.nextInt((2*n)+1);
                int index = 0;
                if (j != 0)
                    index = randomizer.nextInt(myLL.size());
                // System.out.println("Add: " + num + " at index: " + index);
                myLL.add(index, num); //add to start a random number from [0, 2n]
            }
            long end19 = System.nanoTime();
            long addRandomMyLL = end19 - start19;
            // System.out.println(myLL);

            /**
             * Remove from random index MyLL
             */
            // System.out.println("\nStarting remove at random index MyLL...");
            long start20 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                int num = randomizer.nextInt(myLL.size());
                // System.out.println("Removing index " + num);
                myLL.remove(num);
                // System.out.println(myLL);
            }
            long end20 = System.nanoTime();
            long removeRandomMyLL = end20 - start20;

            /**
             * Remove random Object MyLL
             */
            // System.out.println("Creating list...");
            for (int j = 0; j < n; j++)
                myLL.add(randomizer.nextInt((2*n)+1));
            // System.out.println(myLL);

            // System.out.println("Remove random Object from MyLL...");
            long start21 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                Integer num = (Integer) randomizer.nextInt((2*n) + 1);
                myLL.remove(num);
                // System.out.println(myLL.remove(num));
            }
            long end21 = System.nanoTime();
            long removeValueMyLL = end21 - start21;
            // System.out.println(myLL);







            // ///////////////////////////////////////
            // //START TheirArrayList
            // ///////////////////////////////////////
            /**
             * Add to end TheirLinkedList
             */
            // System.out.println("\nStarting add to end TheirLL...");
            long start22 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to end: " + num);
                theirLL.add(num); //add to end a random number from [0, 2n]
            }
            long end22 = System.nanoTime();
            long addEndTheirLL = end22 - start22;
            // System.out.println(theirLL);

            /**
             * Remove from end TheirLinkedList
             */
            // System.out.println("\nStarting remove at end TheirLL...");
            long start23 = System.nanoTime();
            for (int j = 0; j < n; j++)
                theirLL.remove(theirLL.size() - 1);
                // System.out.println(theirLL.remove(theirLL.size() - 1));
            long end23 = System.nanoTime();
            long removeEndTheirLL = end23 - start23;
            // System.out.println(theirLL);

            /**
             * Add to start TheirLL
             */
            // System.out.println("\nStarting add to start TheirLL...");
            long start24 = System.nanoTime();
            for (int j = 0; j < n; j++){
                int num = randomizer.nextInt((2*n)+1);
                // System.out.println("Add to start: " + num);
                theirLL.add(0, num); //add a random number [0, 2n] to a random index [0, currentLength]
            }
            long end24 = System.nanoTime();
            long addStartTheirLL = end24 - start24;
            // System.out.println(theirLL);

            /**
             * Remove from start TheirLL
             */
            // System.out.println("\nStarting remove at start TheirLL...");
            long start25 = System.nanoTime();
            for (int j = 0; j < n; j++)
                theirLL.remove(0);
                // System.out.println(theirLL.remove(0));
            long end25 = System.nanoTime();
            long removeStartTheirLL = end25 - start25;
            // System.out.println(theirLL);

            /**
             * Add to random index TheirLL
             */
            // System.out.println("\nStarting add at random index TheirLL...");
            long start26 = System.nanoTime();
            for (int j = 0; j < n; j ++){
                int num = randomizer.nextInt((2*n)+1);
                int index = 0;
                if (j != 0)
                    index = randomizer.nextInt(theirLL.size());
                // System.out.println("Add: " + num + " at index: " + index);
                theirLL.add(index, num); //add to start a random number from [0, 2n]
            }
            long end26 = System.nanoTime();
            long addRandomTheirLL = end26 - start26;
            // System.out.println(theirLL);

            /**
             * Remove from random index TheirLL
             */
            // System.out.println("\nStarting remove at random index TheirLL...");
            long start27 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                int num = randomizer.nextInt(theirLL.size());
                // System.out.println("Removing index " + num);
                theirLL.remove(num);
                // System.out.println(theirLL);
            }
            long end27 = System.nanoTime();
            long removeRandomTheirLL = end27 - start27;

            /**
             * Remove random Object TheirLL
             */
            // System.out.println("Creating list...");
            for (int j = 0; j < n; j++)
                theirLL.add(randomizer.nextInt((2*n)+1));
            // System.out.println(theirLL);

            // System.out.println("Remove random Object from TheirLL...");
            long start28 = System.nanoTime();
            for (int j = 0; j < n; j++) {
                Integer num = (Integer) randomizer.nextInt((2*n) + 1);
                theirLL.remove(num);
                // System.out.println(theirLL.remove(num));
            }
            long end28 = System.nanoTime();
            long removeValueTheirLL = end28 - start28;
            // System.out.println(theirLL);
            








            //////////////////////////////////////
            //FORMATTING TABLES
            //////////////////////////////////////
            String s1 = "N = " + n;
            String s2 = "| Insert@start(ns)";
            String s3 = "| Insert@end(ns)";
            String s4 = "| Insert@random(ns)";
            String s = String.format("%-13s %-15s %-15s %-15s\n", s1, s2, s3, s4);
            toPW += s;
            pw.println(s);

            s1 = "MyArrayList";
            s2 = "| " + addStartMyAL;
            s3 = "| " + addEndMyAL;
            s4 = "| " + addRandomMyAL;
            s = String.format("%-13s %-18s %-16s %-14s\n", s1, s2, s3, s4);
            toPW += s;
            pw.println(s);

            s1 = "ArrayList";
            s2 = "| " + addStartTheirAL;
            s3 = "| " + addEndTheirAL;
            s4 = "| " + addRandomTheirAL;
            s = String.format("%-13s %-18s %-16s %-14s\n", s1, s2, s3, s4);
            toPW += s;

            pw.println(s);
            s1 = "MyLinkedList";
            s2 = "| " + addStartMyLL;
            s3 = "| " + addEndMyLL;
            s4 = "| " + addRandomMyLL;
            s = String.format("%-13s %-18s %-16s %-14s\n", s1, s2, s3, s4);
            toPW += s;
            pw.println(s);

            s1 = "LinkedList";
            s2 = "| " + addStartTheirLL;
            s3 = "| " + addEndTheirLL;
            s4 = "| " + addRandomTheirLL;
            s = String.format("%-13s %-18s %-16s %-14s\n", s1, s2, s3, s4);
            toPW += s;
            pw.println(s);


            pw.println();

            /**
             * Format removes 
             */
            s1 = "\nN = " + n;
            s2 = "| Remove@start(ns)";
            s3 = "| Remove@end(ns)";
            s4 = "| Remove@random(ns)";
            String s5 = "| Remove byvalue(ns)";
            s = String.format("%-14s %-15s %-15s %-15s %-15s\n", s1, s2, s3, s4,s5);
            toPW += s;
            pw.println(s);

            s1 = "MyArrayList";
            s2 = "| " + removeStartMyAL;
            s3 = "| " + removeEndMyAL;
            s4 = "| " + removeRandomMyAL;
            s5 = "| " + removeValueMyAL;
            s = String.format("%-13s %-18s %-16s %-19s %-15s\n", s1, s2, s3, s4, s5);
            toPW += s;
            pw.println(s);

            s1 = "ArrayList";
            s2 = "| " + removeStartTheirAL;
            s3 = "| " + removeEndTheirAL;
            s4 = "| " + removeRandomTheirAL;
            s5 = "| " + removeValueTheirAL;
            s = String.format("%-13s %-18s %-16s %-19s %-15s\n", s1, s2, s3, s4, s5);
            toPW += s;
            pw.println(s);

            s1 = "MyLinkedList";
            s2 = "| " + removeStartMyLL;
            s3 = "| " + removeEndMyLL;
            s4 = "| " + removeRandomMyLL;
            s5 = "| " + removeValueMyLL;
            s = String.format("%-13s %-18s %-16s %-19s %-15s\n", s1, s2, s3, s4, s5);
            toPW += s;
            pw.println(s);

            s1 = "LinkedList";
            s2 = "| " + removeStartTheirLL;
            s3 = "| " + removeEndTheirLL;
            s4 = "| " + removeRandomTheirLL;
            s5 = "| " + removeValueTheirLL;
            s = String.format("%-13s %-18s %-16s %-19s %-15s\n", s1, s2, s3, s4, s5);
            toPW += s;
            pw.println(s);

            pw.println();
            s = "\n============================================================================================\n";
            toPW += s;
            pw.println(s);
            pw.println();
        }



        System.out.println(toPW);
        pw.close();
    }
}